fun checkTwoWord(list: List<String>, str: String, idx: Int): Int {
    if (idx + 2 > str.length)
        return 0
    var substr = str.substring(idx, idx + 2)
    if (list.contains(substr))
        return 2
    return 0
}

fun checkThreeWord(list: List<String>, str: String, idx: Int): Int {
    if (idx + 3 > str.length)
        return 0
    var substr = str.substring(idx, idx + 3)
    if (list.contains(substr))
        return 3
    return 0
}

fun isCroatia(list: List<String>, str: String, idx: Int): Int {
    if (!(str[idx] == 'c' || str[idx] == 'd' || str[idx] == 'l' || str[idx] == 'n' || str[idx] == 's' || str[idx] == 'z'))
        return 0
    var ret = 0
    ret = checkTwoWord(list, str, idx)
    if (ret != 0)
        return ret
    ret = checkThreeWord(list, str, idx)
    if (ret != 0)
        return ret
    return 0
}

fun main() {
    val str = readln()
    val croatia_alpha = listOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var ans = 0
    var idx = 0

    while (idx < str.length) {
        var offset = isCroatia(croatia_alpha, str, idx)
        if (offset != 0) {
            idx += isCroatia(croatia_alpha, str, idx)
            ++ans
        }
        else {
            ++ans
            ++idx
        }
    }
    println(ans)
}