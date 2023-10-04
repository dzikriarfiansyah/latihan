fun isPositive(x: Int) = x > 0

fun main() {
    val numbers = listOf(-2, -1, 0, 1, 2)
    println(numbers.filter(:: isPositive))
}git