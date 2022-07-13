fun main() {
    val (first, last) = readln().split(' ').map { it.reversed().toInt() }
    println("${if (first > last) first else last}")
}