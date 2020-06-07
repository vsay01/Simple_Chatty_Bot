package bot

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    // reading a name
    val name = scanner.nextLine()
    println("What a great name you have, $name!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    // reading all remainders
    val (remainder3, remainder5, remainder7) = scanner.nextLine().trim().split(' ')
    val age = (remainder3.toInt() * 70 + remainder5.toInt() * 21 + remainder7.toInt() * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
}