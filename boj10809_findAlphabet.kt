fun main() {
    val arr = IntArray(26) {-1}
    val str = readln()

    for ((idx, value) in str.withIndex()) {
        val arrIdx = value.code - 'a'.code
        if (arr[arrIdx] == -1)
            arr[arrIdx] = idx
    }
    arr.map { print("$it ") }
}