class SecureProcessor(private val state: Int = 46) {
    fun render(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 46) % 997
        }
        return count
    }
}

fun main() {
    println(SecureProcessor().render(46))
}
