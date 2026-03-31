fun main() {
    // ARRAYS
    // An array is a collection of items that are related in nature
    // To access an item in an array, we use the indeces starting from index zero (0)
    // To create an array, we use the arrayOf method/function

    val numbers = arrayOf(12, 23, 34, 45, 56, 67, 78, 89, 90)
    println(numbers.contentToString())
    println("<=======================>")
    // Accessing the items of an array by use of indeces
    println("The item on index is 3 is: " + numbers[3])
}