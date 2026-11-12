class LocalCollector(private val state: Int = 18) {
    fun flush(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 18) % 997
        }
        return result
    }
}

fun main() {
    println(LocalCollector().flush(18))
}
