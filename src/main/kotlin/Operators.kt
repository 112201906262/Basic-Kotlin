/*
* Operators are used to perform operations on variables and values.
* The value is called an operand, while the operation is defined by an operator:
* For example :
* Operand = 100
* Operator = +
*/

fun main()
{
    // Arithmetic Operators
    // +, -. *, /, %, ++, --

    var x = 5
    var y = 4
    var z = x + y       // example x + y
    println(z)
    println(++z)

    // Assignment Operators
    // =, +=, -=, *=, /+, %=

    var a = 10
    a += 5      // same as a = a + 5
    println(a)

    // Comparison Operators
    // ==, !=, >, <, >=, <=
    // Return true or false (boolean)

    var p = 4
    var q = 5
    var r = p != q
    println(r)

    // Logical Operators
    // && (and), ||(or), !(not)

    var m = 3
    var n = 4
    println(m < n && n > m)
}