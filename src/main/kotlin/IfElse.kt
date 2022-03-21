/*
* Use if to specify a block of code to be executed, if a specified condition is true
* Use else to specify a block of code to be executed, if the same condition is false
* Use else if to specify a new condition to test, if the first condition is false
* Use when to specify many alternative blocks of code to be executed
* */

fun main()
{
    val x = 20
    val y = 18
    if (x > y) {
        println("x is greater than y")
    }
    // Use if to specify a block of code to be executed if a condition is true.
    val time = 20
    if (time < 18) {
        println("Good day.")
    } else {
        println("Good evening.")
    }

    // Use else if to specify a new condition if the first condition is false.
    if (time < 10) {
        println("Good morning.")
    } else if (time < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }
}
