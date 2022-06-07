
fun main(){
    who_how_old(age = 104, name = "Elaine")
    who_how_old("Euclid", 26)
    println( who_how_old("Elaine Mom") )
    
    TODO("Not implemented la")
    println("After TODO")
}
    
private fun who_how_old(name: String, age: Int = 22) {
    println("I, $name have age $age")
}

    
