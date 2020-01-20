package com.appin.kotlinexamples

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.*
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.CommonStatusCodes
import com.google.android.gms.safetynet.SafetyNet
import kotlinx.android.synthetic.main.activity_google_recaptcha_ex.*
import org.json.JSONObject


class GoogleRecaptchaEx : AppCompatActivity(){
    var TAG = MainActivity::class.java.simpleName

    var SITE_KEY = "6LdGwc4UAAAAAOlESsrFY7-1LxobFNqzf68Idor1"
    var SECRET_KEY = "6LdGwc4UAAAAAP7x-EofN8-TAlbqTVD-3PGwVazf"
    var queue: RequestQueue? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_google_recaptcha_ex)
        queue = Volley.newRequestQueue(getApplicationContext());
        button.setOnClickListener(){
            SafetyNet.getClient(this).verifyWithRecaptcha(SITE_KEY)
                .addOnSuccessListener(
                    this
                ) { response ->
                    if (!response.tokenResult.isEmpty()) {
                        handleSiteVerify(response.tokenResult)
                    }
                }
                .addOnFailureListener(this) { e ->
                    if (e is ApiException) {
                        Log.d(
                            TAG, "Error message: " +
                                    CommonStatusCodes.getStatusCodeString(e.statusCode)
                        )
                    } else {
                        Log.d(TAG, "Unknown type of error: " + e.message)
                    }
                }
        }
    }
    protected fun handleSiteVerify(responseToken: String) { //it is google recaptcha siteverify server
//you can place your server url
        val url = "https://www.google.com/recaptcha/api/siteverify"
        val request: StringRequest = object : StringRequest(Request.Method.POST, url,
            object : Response.Listener<String?> {
                override fun onResponse(response: String?) {
                    try {
                        val jsonObject = JSONObject(response)
                        if (jsonObject.getBoolean("success")) { //code logic when captcha returns true Toast.makeText(getApplicationContext(),String.valueOf(jsonObject.getBoolean("success")),Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(
                                applicationContext,
                                jsonObject.getString("error-codes").toString(),
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    } catch (ex: Exception) {
                        Log.d(TAG, "JSON exception: " + ex.message)
                    }
                }
            },
            object : Response.ErrorListener{
                override fun onErrorResponse(error: VolleyError) {
                    Log.d(TAG, "Error message: " + error.message)
                }
            }) {
            override fun getParams(): Map<String, String> {
                val params: MutableMap<String, String> = HashMap()
                params["secret"] = SECRET_KEY
                params["response"] = responseToken
                return params
            }
        }
        request.retryPolicy = DefaultRetryPolicy(
            50000,
            DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
            DefaultRetryPolicy.DEFAULT_BACKOFF_MULT
        )
        queue!!.add(request)
    }
}
