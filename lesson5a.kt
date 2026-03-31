class Person {
    // Attributes/ Characteristics/ Properties of a person
    var name = "Sonia"
    var age = 23
    var height = 170
    var weight = 60
    // Behaviors/ Actions/ Doables
    fun walk () {
        println("The person can walk")
    }
    fun speak() {
        println("The person can speak")
    }
    fun eat () {
        println("The person can eat")
    }
    fun sleep () {
        println("The person can sleep")
    }
}

fun main() {
    // An Object is a real world thing
    // An object is instanciated/created/obtained/emmanated from a class
    // For us to be able to either access the properties/ behaviors of a class, we require to have an object
    // Below we create an object
    var myObject = Person()
    // Below we use the dot separator to access either the properties or functions
    myObject.walk()
    myObject.sleep()
    myObject.eat()

    println("The age of the person is: " + myObject.age)
    println("The height of the person is: " + myObject.height + " cm")
    println("The weight of the person is: " + myObject.weight + " kg")
}