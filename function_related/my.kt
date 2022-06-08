
/*how to compile:

kotlinc my.kt myjava.java  (.java can be omitted if we put import above)
javac myjava.java

run: 
kotlin MyKt 
*/

        fun named_func (p1: String, p2: Int): String{
            return "$p1 has ${'$'} ${ if (p2 >= 0) "$p2 cash" 
                                      else "${-p2} debt"}"
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
            TODO("Not implemented la")
            println("After TODO")
        }
            
        private fun who_how_old(name: String, age: Int = 22) {
            println("I, $name have age $age")
        }
        
        fun `~special weird * func`(){
            println("I am such a weird function so weird")
        }
