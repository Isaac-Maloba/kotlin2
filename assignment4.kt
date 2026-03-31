import kotlin.math.pow
fun main() {
    // A function that converts temperature from degrees celcius to farenheight
    fun tempConverter (temperature: Double) {
        val fahrenheit = (temperature * (9/5)) + 32
        println("The temperature is $fahrenheit degrees Fahrenheit")
    }
    tempConverter(37.6)
    println("<========================>")
    // A function that calculates compound interest
    fun compountInterest (principle: Int, rate: Int, time: Int) {
        val rateNstuff = (1 + (rate.toDouble()/100)).pow(time.toDouble())
        val interest = (principle * rateNstuff) - principle
        println("With the principal of $principle and a rate of $rate% per year, the total compound interest earned after $time years becomes $interest")
    }
    compountInterest(200000, 13, 4)
}