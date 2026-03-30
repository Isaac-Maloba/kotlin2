fun main(args: Array<String>) {
    val marks = 100

    if (marks < 0) {
        println("You Cannot Have negative Marks")
    }
    else if (marks >= 0 && marks <= 30) {
        println("You Freaking Failed!!!!!")
    }
    else if (marks <= 50) {
        println("Average")
    }
    else if (marks <= 70) {
        println("Above Average")
    }
    else if (marks <= 100) {
        println("You Passed")
    }
    else {
        println("Marks Cannot Exceed 100")
    }
}