class Circle {
    // Xtics of a circle
    var radius = 14
    var pie = 3.142
    // Behavios of a circle
    fun circleArea () {
        var areaOfCirlce = pie * radius * radius
        println("The area of the circle is: " + areaOfCirlce + " cm^2")
    }

    fun circleCurcumference () {
        var circumference = 2 * pie * radius
        println("The circumference of the circle is: " + circumference + " cm")
    }
}

// Create a class for a rectangle and find the perimeter and area of the rectangle
class Rectangle {
    // Properties of the Rectangle
    var length = 37
    var width = 13
    // Behaviors of the rectangle
    fun areaOfRectangle () {
        var rectangleArea = length * width
        println("The area of the rectangle is: " + rectangleArea + " cm^2")
    }

    fun perimeterRectangle () {
        var rectanglePerimeter = 2 * (length + width)
        println("The perimeter of the rectange is: " + rectanglePerimeter + " cm")
    }
}

fun main() {
    // Below is our object
    var myCircle = Circle ()
    var myRectangle = Rectangle ()
    // We access the behavior 'circleArea' using the expression below:
    myCircle.circleArea()
    println("<===================================>")
    // We can also access the behavior 'circleCurcumference' using the expression below:
    myCircle.circleCurcumference()
    println("<===================================>")
    myRectangle.areaOfRectangle()
    println("<===================================>")
    myRectangle.perimeterRectangle()

}