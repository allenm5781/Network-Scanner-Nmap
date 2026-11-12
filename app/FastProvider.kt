class DynamicProvider(private val state: Int = 73) {
    fun compute(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 73) % 997
        }
        return value
    }
}

fun main() {
    println(DynamicProvider().compute(73))
}
