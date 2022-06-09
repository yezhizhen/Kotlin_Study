

fun play_mutableMap(){
    println("\n play_mutableMap")
    val my_mutable_map = mutableMapOf(3 to 4, 5 to 7, 11 to 77)
    println(my_mutable_map[77]) //this won't set new pair, unlike in C++
    println(my_mutable_map[77])

    my_mutable_map.put(11, 31)
    println(my_mutable_map[11])

    var new_key = 77
    println(my_mutable_map.getOrPut(new_key, {println("Creating new key $new_key.."); new_key / 2})
    )

    my_mutable_map += (11 to 31)

}


fun play_map(){
    val x = mapOf(Pair(2, "fdsds"), Pair(4, "fds"))
    println(x.getOrDefault(3, 555))
    var y = mapOf("fdsfds" to 5, "dsa" to 6, 7 to 5, "kt" to "ad")
    println(y["dsa"])
    println(y[7])
    println(y["kt"])

    //x.getOrDefault(4, "Default value...")
    x.getOrElse(77, {println("Well, no such key");  "default value~"})

}

fun main(args: Array<String>) {
    play_list()
    play_map()
    play_mutableMap()
    play_mutableSet()
}

fun play_list() {
    var first_arr = arrayOf(3, 4, 5, 2)
    var second_arr = Array(4, { it + 1 }) //constructor. it is the index
    second_arr.forEach { print(it) }
    var haha = second_arr.toMutableList()
    haha += 4

    var my_mut_list = mutableListOf<Int>(4,5,6,7,8,2,1,3)
    (my_mut_list + 3).forEach { println(it) } //this is a copy. does not affect my_mut_list
    println()

    my_mut_list += 2 //operator overloaded
}

fun play_mutableSet() {
    var x = mutableSetOf("dfsa", "fdsfds", "Elfraine")
    x += "dsa" //alias for add
    x.remove("not there")
    x -= "dfsa"
    x.forEach { println(it) }

}

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
fun twoSum(numbers: IntArray, target: Int): IntArray {
    var (l, r) = listOf(0, numbers.size - 1)
    while (true) {
        (numbers[l] + numbers[r]).let {
            if (it < target)
                l++
            else if (it > target)
                r--
            else
                return intArrayOf(l + 1, r + 1)
        }
    }
}

//binary search
fun twoSum_b(numbers: IntArray, target: Int): IntArray {
    //for each numbers[l]. find its target
    for (l in 0 until numbers.size - 1) //l cannot reach the final. use until
    {
        var r = numbers.binarySearch(target - numbers[l], l + 1)
        if (r >= 0)
            return intArrayOf(l + 1, r + 1)
    }

    return intArrayOf(-1, -1)
}
