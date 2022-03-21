// The break statement is used to jump out of a loop.
// The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

fun main()
{
    // Break
    var i = 1
    while (i < 10) {
        println(i)
        i++
        if (i == 4) {
            break
        }
    }

    println("")

    // Continue
    var x = 1
    while (x < 10) {
        if (x == 4) {
            x++
            continue
        }
        println(x)
        x++
    }
}
