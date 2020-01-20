package com.appin.kotlinexamples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button4.setOnClickListener(){
            intent = Intent(applicationContext,EditTextAndTextView::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener(){
            intent = Intent(applicationContext,ToastEx::class.java)
            startActivity(intent)
        }
        button6.setOnClickListener(){
            intent = Intent(applicationContext,ButtonEx::class.java)
            startActivity(intent)
        }
        button7.setOnClickListener(){
            intent = Intent(applicationContext,ExplicitIntent::class.java)
            startActivity(intent)
        }
        button8.setOnClickListener(){
            intent = Intent(applicationContext,ImplicitIntent::class.java)
            startActivity(intent)
        }
        button9.setOnClickListener(){
            intent = Intent(applicationContext,ListViewEx::class.java)
            startActivity(intent)
        }
        button10.setOnClickListener(){
            intent = Intent(applicationContext,AlertDialogEx::class.java)
            startActivity(intent)
        }
        button11.setOnClickListener(){
            intent = Intent(applicationContext,ContextMenuExample::class.java)
            startActivity(intent)
        }
        button12.setOnClickListener(){
            intent = Intent(applicationContext,OptionsMenuEx::class.java)
            startActivity(intent)
        }
        button13.setOnClickListener(){
            intent = Intent(applicationContext,PopUpMenuEx::class.java)
            startActivity(intent)
        }
        button14.setOnClickListener(){
            intent = Intent(applicationContext,WebViewEx::class.java)
            startActivity(intent)
        }
        button15.setOnClickListener(){
            intent = Intent(applicationContext,SeekBarEx::class.java)
            startActivity(intent)
        }
        button16.setOnClickListener(){
            intent = Intent(applicationContext,TabWithFrameEx::class.java)
            startActivity(intent)
        }
        button17.setOnClickListener(){
            intent = Intent(applicationContext,TabLayoutWithViewPager::class.java)
            startActivity(intent)
        }
        button18.setOnClickListener(){
            intent = Intent(applicationContext,XMLParsingUsingDOMParser::class.java)
            startActivity(intent)
        }
        button19.setOnClickListener(){
            intent = Intent(applicationContext,XMLParsingUsingSAXParser::class.java)
            startActivity(intent)
        }
        button20.setOnClickListener(){
            intent = Intent(applicationContext,XMLParsingUsingXMLPullParser::class.java)
            startActivity(intent)
        }
        button21.setOnClickListener(){
            intent = Intent(applicationContext,TabWithSwipeableViews::class.java)
            startActivity(intent)
        }
        button22.setOnClickListener(){
            intent = Intent(applicationContext,JsonParsingUsingUrl::class.java)
            startActivity(intent)
        }
        button23.setOnClickListener(){
            intent = Intent(applicationContext,ExternalStorageReadWrite::class.java)
            startActivity(intent)
        }
        button24.setOnClickListener(){
            intent = Intent(applicationContext,InternalStorageReadWrite::class.java)
            startActivity(intent)
        }
        button25.setOnClickListener(){
            intent = Intent(applicationContext,SharedPreferencesEx::class.java)
            startActivity(intent)
        }
        button26.setOnClickListener(){
            intent = Intent(applicationContext,SQLiteStorageEx::class.java)
            startActivity(intent)
        }
        button27.setOnClickListener(){
            intent = Intent(applicationContext,AndroidNotificationEx::class.java)
            startActivity(intent)
        }
        button28.setOnClickListener(){
            intent = Intent(applicationContext,AndroidWebServiceEx::class.java)
            startActivity(intent)
        }
        button29.setOnClickListener(){
            intent = Intent(applicationContext,AndroidMediaPlayerEx::class.java)
            startActivity(intent)
        }
        button30.setOnClickListener(){
            intent = Intent(applicationContext,AndroidVideoViewEx::class.java)
            startActivity(intent)
        }
        button31.setOnClickListener(){
            intent = Intent(applicationContext,GoogleRecaptchaEx::class.java)
            startActivity(intent)
        }
        button32.setOnClickListener(){
            intent = Intent(applicationContext,FirebaseAuthenticationGoogleLogin::class.java)
            startActivity(intent)
        }
        button33.setOnClickListener(){
            intent = Intent(applicationContext,GoogleAdmobBannerAdsEx::class.java)
            startActivity(intent)
        }
        button34.setOnClickListener(){
            intent = Intent(applicationContext,GoogleAdmobInterstitialAdsEx::class.java)
            startActivity(intent)
        }
        button35.setOnClickListener(){
            intent = Intent(applicationContext,MapsActivity::class.java)
            startActivity(intent)
        }
        button36.setOnClickListener(){
            intent = Intent(applicationContext,GoogleMapCurrentLocationEx::class.java)
            startActivity(intent)
        }
        button37.setOnClickListener(){
            intent = Intent(applicationContext,GoogleMapSearchLocationEx::class.java)
            startActivity(intent)
        }
    }
}
