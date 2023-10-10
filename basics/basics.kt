// entry point
fun main () {
    println("hello world")

    /*
        Variables in Kotlin
    */

    var foo = 10 // semi colons are optional
    var bar = 20;

    // immutable variable
    val immutableVal = "learn kotlin"
    println(immutableVal)

    // boolean conditions
    if(foo > 5 && bar < 10) {
        // do something
    }

    // while loop
    while(foo < 20) {
        foo ++ // or foo += 1
    }

    println(foo)

    // equailty check

    // structural equality
    if(foo == bar) {
        println("foo == bar")
    }
    
    // referential equailty 
    // !referential equailty operator has been deprecated for primitive types
    // if(foo === bar) {
    //     println("foo == bar using referential equality")
    // }
    // else {
    //     println("foo != bar using referential equality")
    // }
        
    /* 
        * kotlin use camelCase for variable, function and package name
        * constant name uses Upper snake case
        * Data Types Title Case
    */

    var name: String = "me"
    // user defined function
    fun sayMyName () {
        println("hello, " + name)
    }

    // invoking function
    sayMyName()
    
    // tenary operator
    var age: Int = 19
    println("you are " + (if (age < 18) "not" else "") + "18 year old")

    // switch statement
    when(age) {
        0 -> {
            println("just born")
        }
        in 1..15 -> {
            println("child")
        }
        in 15..17 -> {
            println("young kid")
        }
        in 18..100 -> {
            println("adult")
        }
    }

    // for loop
    for(i in 0..10) {
        println(i)
    }

    // multiline strings
    var json = """ 
        {
            "key": "val"
        }
    """;
    
    println(json)

    // string templates
    println("hello $name")
}
