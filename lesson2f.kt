// Convert the code on lesson2d to a when statement
fun main() {
    val marks = 98
    when(marks) {
        in 0 .. 30 -> println("You Freaking Failed!!!")
        in 31 .. 50 -> println("Average")
        in 51 .. 70 -> println("Above Average")
        in 71 .. 100 -> println("You passed")
        else -> println("Invalid Input!!!")
    }
}

// lesson2c
// fun main() {
//     val number = 0
//     when {
//          number > 0 -> printIn("The Number is Positive")
//          numer == 0 -> printIn("The Number is Zero")
//          else -> printIn("The Number is Negative")
//     }
// }