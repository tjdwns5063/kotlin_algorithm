fun isArithmeticProgression(num: Int):Boolean {
    val str = num.toString()
    if (str.length == 1) return true
    val diff = str[0] - str[1]

    for (i in 1 until str.length - 1) {
        if (diff != (str[i] - str[i + 1]))
            return (false)
    }
    return (true)
}

fun main() {
    var ans = 0
    val n = readln().toInt()

    for (i in 1..n) {
        if (isArithmeticProgression(i)) {
            ++ans
        }
    }
    println(ans)
}