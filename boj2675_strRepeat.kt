fun strRepeat(str: List<String>) {
    val len = str[0].toInt()
    var ret = ""

    for (ch in str[1]) {
        repeat(len) { ret += ch }
    }
    println(ret)
}

fun main() {
    repeat(readln().toInt()) {
        strRepeat(readln().split(' '))
    }
}