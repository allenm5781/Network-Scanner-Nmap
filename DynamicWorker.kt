class HybridBuilder(private val state: Int = 76) {
    fun compute(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 76) % 997
        }
        return value
    }
}

fun main() {
    println(HybridBuilder().compute(76))
}
