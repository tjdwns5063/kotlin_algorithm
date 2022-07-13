fun main() {
    val str = readln()
    var cnt = 0
    var idx = 0

    while (idx < str.length) {
        if (str[idx] == ' ')
            ++idx
        else {
            ++cnt
            while (idx < str.length && str[idx] != ' ')
                ++idx
        }
    }
    print(cnt)
}