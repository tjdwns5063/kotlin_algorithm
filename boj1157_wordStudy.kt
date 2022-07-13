fun main() {
    val arr = IntArray(26) { 0 }
    val str = readln().lowercase()

    for (ch in str) {
        arr[ch.code - 'a'.code] += 1
    }
    val max = arr.maxOrNull()
    if (arr.count { it == max } != 1)
        println("?")
    else
        arr.forEachIndexed { index, value ->
            if (value == max) {
                println((index + 'A'.code).toChar())
                return@forEachIndexed
            }
        }
}