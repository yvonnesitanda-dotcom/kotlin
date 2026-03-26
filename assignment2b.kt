
fun main() {
    val points = 
    if (points> 0 && points<= 100){
        println("You do not qualify")
    }
    else if ( points > 101 && points <= 400){
        println("You win a smartphone")
    }
    else if ( points > 400 && points <= 1000){
        println("You win a laptop")
    }
    else if (points > 1000){
        println("You win a trip to canada!!")
    }
    else{
        println("Wrong entry")
    }

    

    
}