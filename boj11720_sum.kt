fun main() {
    readln().toInt()
    var arr = IntArray(0)
    readln().map { it.digitToInt().also {
        arr += it
    } }
    println(arr.sum())
}