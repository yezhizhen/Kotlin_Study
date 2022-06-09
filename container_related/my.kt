

fun main(args: Array<String>) {

    var first_arr = arrayOf(3, 4, 5, 2)


    var second_arr = Array(4, { it + 1 }) //constructor. it is the index
    second_arr.forEach { print(it) }

    var my_mut_list = mutableListOf<Int>(4,5,6,7,8,2,1,3)
    (my_mut_list + 3).forEach { println(it) } //this is a copy. does not affect my_mut_list
    println()

    my_mut_list += 2 //operator overloaded


}
