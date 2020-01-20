package com.appin.kotlinexamples

//@Ann(value = 10)

//class Product(var item: String, var price: Int)
//data class Product(var item: String, var price: Int)
data class Product(var item: String = "laptop", var price: Int = 25000)
class MyClass{

}
fun main (args: Array<String>){
    /*var c = MyClass()
    var x = c.javaClass.getAnnotation(Ann::class.java)
    if(x!=null){
        println("Value:"+x?.value)
    }*/
    /*val u = User("Ashu", 101, "mymail@mail.com")
    println(u)*/
    /*val p = Product("laptop", 25000)
    println(p)*/
    /*val p1 = Product("laptop", 25000)
    val p2 = Product("laptop", 25000)
    println(p1==p2)
    println(p1.equals(p2))*/
    /*val p1 = Product("laptop", 25000)
    println("p1 object contain data : $p1")
    val p2 = p1.copy()
    println("p2 copied object contains default data of p1: $p2")
    val p3 = p1.copy(price = 20000)
    println("p3 contain altered data of p1 : $p3")*/
    val p1 = Product(price = 20000)
    println(p1)
}