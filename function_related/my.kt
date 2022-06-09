/*how to compile:

kotlinc my.kt myjava.java  (.java can be omitted if we put import above)
javac myjava.java

run:
kotlin MyKt
*/
//named functio must use return. lambda do not
fun named_func (p1: String, p2: Int): String{
    return "$p1 has ${'$'} ${ if (p2 >= 0) "$p2 cash"
    else "${-p2} debt"}"
}

fun func1(){
    println("Hello from function 1")
}

fun func2(){
    println("Hello from function 2")
}

//return a function taking no parameter
fun select_printer(label: Int): () -> Unit {
    return when(label){
        1 -> ::func1
        2 -> ::func2
        else -> {->}
    }
}



fun main(args: Array<String>){
    who_how_old(age = 104, name = "Elafrine")
    who_how_old("Euclid", 26)

    println( who_how_old("Elafrine Mom") )
    `~special weird * func`()

    myjava.isgood()

    //myjava.is() //error. since "is" is a keyword in Kotlin but not in Java

    myjava.`is`() //have to use backquote

    var credit_deficit = 0

    var lambda_func = {p1: String, p2: Int ->
        val temp_str = if(p2 >= 0) "$p2 cash" else "${-p2} debt"
        "Printed by Lambda: $p1 has ${'$'} $temp_str"
    }


    println(named_func("Hi Elafrine", -40))
    println(named_func("Hi Elafrine", 80))

    println(lambda_func("Hi Elafrine", -40))
    println(lambda_func("Hi Elafrine", 80))

    println("\nTest returning function")

    select_printer(2)()
    select_printer(2)()
    
    //Comparator interface
    //use lambda as it has only one abstract method: compare
    
    var mylist = listOf("sdfsa","fdasfds","fdtersfsd")
    mylist.sortedWith ({ o1, o2 ->
        when {
            o1.length < o2.length -> 1
            o1.length > o2.length -> -1
            else -> 0
        }
    })

    var mylist2 = listOf("sdfsa","fdasfds","fdtersfsd")
    mylist2.sortedWith { o1, o2 ->
        if(o1.length < o2.length)
            1
        else
            -1
    }


    TODO("Not implemented la")
    println("After TODO")
}

private fun who_how_old(name: String, age: Int = 22) {
    println("I, $name have age $age")
}

fun `~special weird * func`(){
    println("I am such a weird function so weird")
}
