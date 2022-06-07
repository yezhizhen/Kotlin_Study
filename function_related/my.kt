//import myjava

/*how to compile:

kotlinc my.kt myjava.java  (.java can be omitted if we put import above)
javac myjava.java

run: 
kotlin MyKt 
*/

fun main(){
    who_how_old(age = 104, name = "Elafrine")
    who_how_old("Euclid", 26)
    
    println( who_how_old("Elafrine Mom") )
    `~special weird * func`()
 
    myjava.isgood()
    
    //myjava.is() //error. since "is" is a keyword in Kotlin but not in Java 
    myjava.`is`() //have to use backquote
    
    TODO("Not implemented la")
    println("After TODO")
}
    
private fun who_how_old(name: String, age: Int = 22) {
    println("I, $name have age $age")
}

fun `~special weird * func`(){
    println("I am such a weird function so weird")
}
    
