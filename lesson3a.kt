fun main() {
   // for loop
   //It is used to execute of block of code/statement a number of times until  a consition is met.

   for (number in 1..10){
    println("The count is:$number")
   }

   println("=============")
   // create a for loop that is able to print from 50 to 65
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

// Personal practise
//Write a program that uses a loop to reverse a given number (e.g., 1234 → 4321).

println("=====================")
//Write a Kotlin program to find the sum of all even numbers between 1 and 50 using a for loop.
var s = 0
for (c in 1 .. 50 ){
    if (c % 2 == 0){
        s += c
    }
}
println("s:$s")
println("=====================")
//Write a program that prints the square of numbers from 1 to 10 using a for loop.
for ( z in 1..10){
    println("$z -> ${z * z}")
}

// Factorial of Six
println("=====================")
val f= 6
var fact = 1
for (m in 1..6){
    fact *= m
}
println("The factorial of six:$fact")

println("=====================")
for (t in 1..100){
    if ( t % 3 == 0){
        println(t)
    }
}

println("=====================")
//Multiples of five from 1 to 50
for (e in 1 .. 50){
    if( e% 5 == 0){
        println(e)
    }
}

/* Write a program that prints numbers from 1 to 20, but:

prints "Fizz" if divisible by 3
prints "Buzz" if divisible by 5
prints "FizzBuzz" if divisible by both
 */
println("=====================")
for (k in 1..20){
    if(k%3==0 && k%5== 0){
        println("FizzBuzz")
    }
    else if (k % 3 == 0){
        println("Fizz")
    }
    else if (k % 5 == 0){
        println("Buzz")
    }
    else{
        println(k)
    }
    }

    println("=====================")
    //Write a program that prints the following pattern using nested for loops
    



}




// check on the difference between local variables and global variables