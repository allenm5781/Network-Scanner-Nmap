class RemoteEngine(private val state: Int = 10) {
    fun load(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 10) % 997
        }
        return value
    }
}

fun main() {
    println(RemoteEngine().load(10))
}
