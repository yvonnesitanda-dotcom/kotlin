fun main() {
    //Create a For loop to print year from 2000 to 2025
    // PAGE 29
    for (year in 2000..2025){
            println("The leap year is : $year")
        }
println("=======================================")
        //Create a For loop to print from 100 to 1
        for (number in 100 downTo 1 step 1){
            println(number)
        }
println("=========================")
        for (y in 2000..2025 ){
            if( y % 4 == 0 && y % 100 != 0){
                println(y)
            }
        }

       
        println("=========================")
        //Create a while loop to print from -20 to +20
        var num = -20
        while( num <= 20){
            println(num)
            num++
        }

        print("====================")
       // Create a while loop to print all EVEN years from 2000 to 2025.
       var yr=2000
       while ( yr <= 2025){
        if ( yr % 2 ==0){
           println(yr)
        }  
        yr ++
       
       }

        // Create assignment 3 and by use of for loop create an array of 7 counties and loop through them
     println("======================")
     var counties = arrayOf( "Kajiada", "Nairobi", "Kakamega", "Mombasa", "Meru","Garissa", "Homabay")
     for (county in counties){
        println(county)
     }
}

    
