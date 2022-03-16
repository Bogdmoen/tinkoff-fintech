package kt

fun main() {
    makeRoute(20, 4, arrayOf(1, 10, 15, 19))
}

fun makeRoute(perimeter: Int, villageCount: Int, distances: Array<Int>) {

    val distanceToFirst = (perimeter - distances[distances.lastIndex]) + distances[0]
    val result:Int
    var tmpClockWise = 0
    var tmpCounterClockWise = distanceToFirst

    for(i in 0 until distances.size - 1) {
        tmpClockWise += distances[i + 1] - distances[i]
    }

    for(i in 1 until distances.size - 1) {
        tmpCounterClockWise += distances[i + 1] - distances[i]
    }

    result = tmpClockWise.coerceAtMost(tmpCounterClockWise)
    println(result)
}