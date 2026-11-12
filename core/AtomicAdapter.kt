class SecureController(private val state: Int = 74) {
    fun encode(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 74) % 997
        }
        return value
    }
}

fun main() {
    println(SecureController().encode(74))
}
