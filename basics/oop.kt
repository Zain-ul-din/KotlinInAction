/*
    Base class
    by default all classes are final which means you can't inherit from this class
    'open' keyword allow other classes to inherit from this class
*/
open class Person(var name: String) {}

/*
    inhertitance example
*/
class Student(name: String, var rollNo: Int): Person(name)
{   
    /**
     *  Any has three methods: equals(), hashCode(), and toString(). Thus, these methods are defined for all Kotlin classes.
     * https://kotlinlang.org/docs/inheritance.html 
    */
    override fun toString (): String
    {
        return "name: " + this.name + ", rollNo: " + this.rollNo
    }
}

/*
    Dice class to generate random number
*/
class Dice 
{
    var min: Int = 1
    var max: Int = 6 
    
    /*
        returns random number from 1 to 6
    */
    fun roll () : Int
    {
        return (min..max).random()
    }
}

// driver code
fun main () 
{
    var dice = Dice()
    println(dice.roll())
    // var student = Student("zain", 147)
    // println(student)

    // var rand = Random(1,10)
    // println(rand.getRandom())
}
