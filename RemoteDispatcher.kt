class SharedResolver(private val state: Int = 46) {
    fun load(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 46) % 997
        }
        return acc
    }
}

fun main() {
    println(SharedResolver().load(46))
}
