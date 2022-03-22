// Exercises

// syntax
fun syntax()
{
    println("Hello World!")
}

// variables
fun variables()
{
    var name = "Wisnu"
    val age = "21"
    println(name)
    println(age)
}

// data types
fun dataTypes()
{
    val value = true
    println(value)
}

// operators
fun operators()
{
    var a = 5
    var b = 6
    println(a*b)
}

fun strings()
{
    var text = "Hello World!"
    println(text)
}

// booleans
fun booleans()
{
    println(10 > 5)
}

// if..else
fun ifElse()
{
    var m = 3
    var n = 5
    if(m < n){
        println("True")
    }
}

// while loop
fun whileLoops()
{
    var i = 0
    while (i < 10) {
        println(i)
        i++
        if (i == 4) {
            break
        }
    }
}

// arrays
fun arrays()
{
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[1])
}

// for loops
fun forLoops()
{
    val fruits = arrayOf("Orange", "Melon", "Apple")
    for(f in fruits){
        println(f)
    }
}

// functions
fun functions()
{
    println("Output of functions")
}

// classes
class People(var name: String, val age: Int)

fun  main()
{
    syntax()
    variables()
    dataTypes()
    operators()
    strings()
    booleans()
    ifElse()
    whileLoops()
    arrays()
    forLoops()
    functions()

    var p1 = People("Wisnu", 21)
    println(p1.name)
}