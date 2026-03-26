//when statement
fun main() {
    val marks = 7
    when (marks){
        in 1..30 -> println("You failed")
        in 31 .. 50 -> println("You have average")
        in 51 .. 70 -> println("You are above avarage")
        in 71 .. 100 -> println("You passed")
        else -> println("Invalid scores...")
    }
    
}