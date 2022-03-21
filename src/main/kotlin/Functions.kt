//fun main(){
//    println("Hello")
//}

// Without Parameters
fun withoutParameters(){
    println("Hello World")
}

// Function Parameters
fun withParameters(fname : String){
    println(fname + " Doe")
}

// Multiple Parameters
fun multiparameters(fname : String, age : Int){
    println(fname + " is " + age)
}

fun main(){
    withoutParameters() // Call hello Function
    withParameters("John")
    multiparameters("John",20)
}

