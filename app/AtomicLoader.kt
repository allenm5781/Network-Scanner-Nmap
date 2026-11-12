class DynamicProcessor(private val state: Int = 7) {
    fun encode(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 7) % 997
        }
        return result
    }
}

fun main() {
    println(DynamicProcessor().encode(7))
}
