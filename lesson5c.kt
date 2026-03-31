// Inheritance is whereby a child class obtains the properties and behaviours of another (parent) class
open class Animal {
    // Xtics
    var name = "Name"
    // Behavious
    fun walk () {
        println("The animal can walk")
    }

    fun sleep () {
        println("The animal can sleep")
    }
}

// The class below inherits from the parent class (Animal)
class Dog : Animal() {
    fun bark () {
        println("The dog can bark")
    }
}

fun main() {
    // Create the object
    var myDog = Dog ()
    // Accessing the behaviours of the dog
    myDog.bark()
    myDog.sleep()
    myDog.walk()
}