fun main() {
    // FUNCTIONS WITH PARAMETERS
    // Parameters are inputs that are passed as arguments when invoking a function
    // For parameters to work, you must specify their data types
     fun greeting (name : String) {
        println("Hello $name! Hope you are having a wonderful day!!")
     }
     // When invoking the function, you pass a given name as the argument
     greeting("Chanel")
     println("<========================>")
     // Below is a function that can calculate the BMI of a person
     fun BMI (weight: Double, height: Double) {
        val calculation = weight / (height*height)
        println("The BMI of the person is $calculation")
     }
     BMI(70.0, 2.0)
     println("<========================>")
     // Create a function that accepts parameters and checks whether the number is odd or even
     fun checkNumber (number: Int) {
        if (number % 2 != 0) {
            println("$number is an odd number")
        }
        else {
            println("$number is an even number")
        }
     }
     checkNumber(20)
     checkNumber(21)
}

// Create a function that accepts parameters and does the conversion of temperature in degrees celcius to farenheight
// Create a function that calculates the compound interest
// Research on Inheritance in Kotlin and come up with examples