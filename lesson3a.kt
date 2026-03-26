fun main() {
   // for loop
   //It is used to execute of block of code/statement a number of times until  a consition is met.

   for (number in 1..10){
    println("The count is:$number")
   }

   println("=============")
   // create a for lo0p that is able to print from 50 to 65
   for (digit in 50..65 ){
    println("The numbers are: $digit")
   }

   // research on how to increment on the for loop by use of steps
   println("=============")

   for (x in 20..40 step 2){
    println(x)
   }

   println("=============")
   for (x in 20..40){
    if (x % 2 != 0){
        println(x)
    }
   }

   // by use of a for loop , generate the mutiplication table for 5 from 1 to 5
   println("=============")
   for ( a in 1..5  ){
    val prod = a * 5
    println(" 5 * $a = $prod")
}



// create a program that is able to find the factorial of number 5
println("=============")
 val d = 5
 var factorial = 1
 for (i in 1..d){
    factorial *= i
 }
 println("Factorial of $d is $factorial")


}




// check on the difference between local variables and global variables