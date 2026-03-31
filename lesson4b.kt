fun main(args: Array<String>) {
    // Below is a function that can add two numbers
    fun addition () {
        val num1 = 15
        val num2 = 69
        val sum = num1 + num2
        println("The sum of the two numbers is: $sum")
    }
    addition()
    println("<========================>")
    // Create a function that multiplies 3 numbers
    fun multiply () {
        val number1 = 34
        val number2 = 91
        val number3 = 76
        val product = number1 * number2 * number3
        println("The product of the three numbers is: $product")
    }
    multiply()
    println("<========================>")
    // Given 2 numbers, create a function that can find the larger and the smaller of the 2 numbers
    fun evaluateNumber () {
        val x = 91
        val y = 91
        if (x > y) {
            println("$x is larger than $y")
        }
        else if (x < y){
            println("$y is larger than $x")
        }
        else {
            println("$x and $y are equal")
        }
    }
    evaluateNumber()
    println("<========================>")
    // Given 179 minutes, create a function that will convert the minutes into hours and show the remainder in hours
    fun timeConverter () {
        val minutes = 179
        val hours = minutes /60
        val rem = minutes % 60
        println("$hours hours $rem minutes")
    }
    timeConverter()
}