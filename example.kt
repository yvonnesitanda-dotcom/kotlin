fun main() {
    val person: Array <Any> =arrayOf( "James" , 12)
    println(person.contentToString())
    

// This is a code to show that an array can contain different data types using the keyword <Any> to allow the array have different data types.

 var counties = arrayOf("Nairobi", "Mombasa", "Kisumu", "Nakuru", "Eldoret", "Machakos", "Kiambu")
    
    for (county in counties) {
 if (county== "Nairobi" || county == "Kisumu"){
        print ("$county ")
    }
    }
}