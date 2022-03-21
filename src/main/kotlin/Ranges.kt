// With the for loop, you can also create ranges of values with ".."

fun main()
{
    // Loop nums 5 until 15
    for (nums in 1..10) {
        println(nums)
    }

    // Check if a Value Exists
    val nums = arrayOf(2, 4, 6, 8)
    if (2 in nums) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }
}