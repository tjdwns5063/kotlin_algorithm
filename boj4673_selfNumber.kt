fun weirdSum(num: Int): Int {
    var ret = num
    val str = num.toString()

    for (ch in str) {
        ret += ch.digitToInt()
    }
    return (ret)
}

fun main() {
    val arr = BooleanArray(10000)

    for (i in arr.indices) {
        val idx = weirdSum(i + 1)
        if (idx >= 10000)
            continue
        arr[idx] = true
    }
    for (i in 1 until 10000) {
        if (!arr[i])
            println(i)
    }
}