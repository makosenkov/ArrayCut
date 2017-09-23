
fun find(price: List<Int>): List<Int> {
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
    return price.subList(leftIndex, rightIndex + 1)
}
