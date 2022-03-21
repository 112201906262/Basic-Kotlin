/*
* Arrays are used to store multiple values in a single variable, instead of creating separate variables for each value.
* To create an array, use the arrayOf() function, and place the values in a comma-separated list inside it:
*/

fun main()
{
    val fruits = arrayOf("Banana", "Orange", "Melon")

    // Access the Elements of an Array
    println(fruits[1])

    // Change an Array Element
    fruits[1] = "Honda"
    println(fruits[1])

    // Array Length / Size
    println(fruits.size)

    // Check if an Element Exists
    if("Banana" in fruits){
        println("True")
    }else{
        println("False")
    }

    for (x in fruits){
        println(x)
    }

}