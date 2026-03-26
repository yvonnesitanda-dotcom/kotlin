fun main() {
    val number=20
    when{
        number > 0 ->println("This is a positive number")
        number == 0 -> println("This is zero")
        else -> println("The number is negative number")
    }    
}

// research on looping structures in kotlin and how to create an array 
fun main() {

    // =========================================
    // LOOPING STRUCTURES IN KOTLIN
    // =========================================

    // 1. FOR LOOP
    // Used when you know how many times you want to loop

    // Example 1: Loop from 1 to 5
    for (i in 1..5) {
        println("Number: $i")
    }

    // Example 2: Loop with step
    for (i in 1..10 step 2) {
        println("Step loop: $i") // 1, 3, 5, 7, 9
    }

    // Example 3: Loop downwards
    for (i in 5 downTo 1) {
        println("Countdown: $i")
    }

    // Example 4: Loop through a string
    for (char in "Kotlin") {
        println(char)
    }



    // -----------------------------------------

    // 2. WHILE LOOP
    // Runs while a condition is TRUE

    var x = 1

    while (x <= 5) {
        println("While loop: $x")
        x++
    }

    // ⚠️ Be careful: If condition never becomes false → infinite loop



    // -----------------------------------------

    // 3. DO-WHILE LOOP
    // Runs AT LEAST ONCE, then checks condition

    var y = 1

    do {
        println("Do-while: $y")
        y++
    } while (y <= 5)



    // =========================================
    // 📦 ARRAYS IN KOTLIN
    // =========================================

    // An array stores multiple values of the SAME type


    // 1. CREATING ARRAYS

    // Method 1: Using arrayOf()
    val numbers = arrayOf(10, 20, 30, 40)

    // Method 2: Empty array with size
    val names = Array(3) { "" }  // size 3, all empty strings

    // Method 3: Specific type arrays
    val nums = intArrayOf(1, 2, 3, 4)



    // -----------------------------------------

    // 2. ACCESSING ELEMENTS
    println(numbers[0])  // First element → 10
    println(numbers[2])  // Third element → 30



    // -----------------------------------------

    // 3. MODIFYING ELEMENTS
    numbers[1] = 25
    println(numbers[1]) // Now → 25



    // -----------------------------------------

    // 4. ARRAY LENGTH
    println("Size: ${numbers.size}")



    // -----------------------------------------

    // 5. LOOPING THROUGH ARRAYS

    // Method 1: Using for loop
    for (num in numbers) {
        println("Value: $num")
    }

    // Method 2: Using indices
    for (i in numbers.indices) {
        println("Index: $i Value: ${numbers[i]}")
    }

    // Method 3: Using forEach
    numbers.forEach {
        println("forEach: $it")
    }



    // -----------------------------------------

    // 6. MULTI-DIMENSIONAL ARRAY (2D ARRAY)

    val matrix = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6)
    )

    println(matrix[0][1]) // → 2

    // Loop through 2D array
    for (row in matrix) {
        for (value in row) {
            print("$value ")
        }
        println()
    }



    // =========================================
    // 💡 BONUS TIPS
    // =========================================

    // - Arrays are FIXED in size (cannot grow)
    // - If you need flexible size → use Lists (mutableListOf)
    // - Kotlin prefers Lists over Arrays in many cases

}