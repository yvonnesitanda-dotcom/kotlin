fun main() {
    // Below is  a function that is able to add two numbers
    fun addition(){
        val num1 = 10
        val num2 = 20
        val sum = num1 + num2

        print("The sum of the numbers is : $sum")
    }

addition()

// Create a 
println("==========================")
fun multiplication (){
    val number1 =5
    val number2 = 8
    val number3 = 4
    val product = number1 * number2 * number3

    println("product: $product")
}

multiplication()

// Given two numbers create a function that is able to find the largest and the smallest of the numbers
fun digits (){
    val dg1 = 10
    val dg2 = 5
    if ( dg1 > dg2 ){
        println( "largest: $dg1 and smallest : $dg2")
    }
    else {
        println(" Smallest : $ dg2 and Largest :dg1")
    }

}
digits()

// Given 179 minutes , create a function that is able to convert the said min into hr
fun time (){
val a = 179
val b = 60
val hours= a/b
val minutes= a%b

println("$hours hours $minutes min")
}
time()

    
}