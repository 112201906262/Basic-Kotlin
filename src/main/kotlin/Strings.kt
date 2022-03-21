/*
* Strings are used for storing text.
* A string contains a collection of characters surrounded by double quotes:
*/

fun main()
{
    var text = "Hello World!"

    // String
    println(text)

    // Access a string
    println(text[1])

    // String Length
    println(text.length)

    // String function
    println(text.toUpperCase())
    println(text.toLowerCase())

    // Comparing string
    var text1 = "Hello"
    var text2 = "Hello"
    println(text1.compareTo(text2))

    // Finding a String in a String
    println(text.indexOf("World"))

    // String Concatenation
    var firstName = "Sakya "
    var lastName = "Mous "
    var age = 20
    println(firstName.plus(lastName).plus(age))

    // String Templates/Interpolation
    println("My name is $firstName $lastName")



}