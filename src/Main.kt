import java.util.*


fun main(args: Array<String>) {
    val price = listOf(1000, -5, -12, 100, -10, 20)
    val maxOfPrice = price.subList(find(price).second, find(price).third + 1)
    println(find(price).first.toString() + " " + maxOfPrice)
}

fun find(price: List<Int>): Triple<Int, Int, Int> {
    var sum = price[0]
    var bufSum = 0
    var leftIndex = 0
    var rightIndex = 0
    var bufLeft = -1
    for (i in 0 until price.size) {
        bufSum += price[i]
        if (bufSum > sum) {
            sum = bufSum
            leftIndex = bufLeft + 1
            rightIndex = i
        }
        if (bufSum < 0) {
            bufSum = 0
            bufLeft = i
        }
    }
    return Triple(sum, leftIndex, rightIndex)
}
