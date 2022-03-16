package kt

fun main() {
    makeRoute(20, 4, arrayOf(1, 10, 15, 19))
}

fun makeRoute(perimeter: Int, villageCount: Int, distance: Array<Int>) {

    val distanceToFirst = (perimeter - distance[distance.lastIndex]) + distance[0]
    val result:Int
    var tmpClockWise = 0
    var tmpCounterClockWise = distanceToFirst

    for(i in 0 until distance.size - 1) {
        tmpClockWise += distance[i + 1] - distance[i]
    }

    for(i in 1 until distance.size - 1) {
        tmpCounterClockWise += distance[i + 1] - distance[i]
    }

    result = tmpClockWise.coerceAtMost(tmpCounterClockWise)
    println(result)
}