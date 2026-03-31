fun main() {
    // FOR LOOP
    // It is used execute a block of code/ statements a number of times until a condititon is met

    for (number in 1 .. 10) {
        println("The count is: $number")
    }
    println("<=======================>")
    // Create a for loop that prints from 50 to 65
    for (num in 50 .. 65) {
        println("The number is: $num")
    }
    println("<=======================>")
    for (y in 20 .. 40 step 2) {
        println(y)
    }
    println("<=======================>")
    // Printing only the odd numbers in the range above
    for (m in 20 .. 40) {
        if (m % 2 != 0) {
            println(m)
        }
    }
    println("<=======================>")
    // Use a for loop to generate a mutliplication table for 5
    for(c in 1 .. 5) {
        var product = c * 5
        println("5 * $c = $product")
    }
    println("<=======================>")
    // Create a program that can find the factorial of 5
    var factorial = 1

    for (z in 1 .. 5) {
        factorial = factorial * z
        println(factorial)
    }
    println("The factorila of 5 is $factorial")
    // Check on the difference between local variables and global variables.
}