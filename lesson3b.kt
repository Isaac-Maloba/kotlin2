fun main(args: Array<String>) {
    // Printing from a higher number to a lower number
    // Create a program that prints from 10 to 1
    for(num in 10 downTo 1) {
        println(num)
    }
    println("<=======================>")
    // Create a program that prints the odd numbers from 20 to 10
    for (number in 20 downTo 10) {
        if (number % 2 != 0) {
            println(number)
        }
    }
}