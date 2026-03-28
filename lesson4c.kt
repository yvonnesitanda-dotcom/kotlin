// function with parameters
// Parameters are inputs that get passed as arguments when invoking a function
// You must specify the data types of parameters
fun main() {
    fun greeting (name: String){
    println("Hello $name, Hope you had a good day?")
}

greeting("James")
greeting("Bernard")

println("==============================")
// Below is an example of a function that is able to calculate the bmi of a person
fun BMI (weight : Double , height : Double){
    val answer = weight / (height * height)
    println("The BMI is: " + answer)
}
BMI(69.5,1.73)
BMI(58.6,1.87)

 // Create a function that accepts parameters and checks whether a given number is odd or even
 fun checkOddEven (number : Int){
    if (number % 2 == 0){
        println("$number is Even")
    }
    else {
        println("$number is Odd")
    }
 }
 checkOddEven(7)
}