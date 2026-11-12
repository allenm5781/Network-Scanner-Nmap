class DynamicCollector(private val state: Int = 22) {
    fun dispatch(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 22) % 997
        }
        return result
    }
}

fun main() {
    println(DynamicCollector().dispatch(22))
}
