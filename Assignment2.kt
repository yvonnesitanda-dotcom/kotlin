fun main() {

    // A leap year:
    // - Divisible by 4
    // - NOT divisible by 100 UNLESS also divisible by 400

    val year = 2024

    // Using IF statement
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        println("$year is a Leap Year")
    } else {
        println("$year is NOT a Leap Year")
    }

}

fun main() {

    val year = 2023

    when {
        (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ->
            println("$year is a Leap Year")

        else ->
            println("$year is NOT a Leap Year")
    }

}

fun main() {

    val number = 7

    // If number is divisible by 2 → EVEN
    if (number % 2 == 0) {
        println("$number is EVEN")
    } else {
        println("$number is ODD")
    }

}

fun main() {

    val number = 10

    when (number % 2) {
        0 -> println("$number is EVEN")
        else -> println("$number is ODD")
    }

}