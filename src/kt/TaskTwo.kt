package kt

fun main() {
    makeRoute(20, 4, arrayOf(1, 10, 15, 19))
}

fun makeRoute(perimeter: Int, villageCount: Int, distances: Array<Int>) {

    if(villageCount <= 1) {
        println("неверный формат данных")
        return
    }

    val trimmedDistances = distances.take(villageCount)
    val distanceToFirst = (perimeter - trimmedDistances[trimmedDistances.lastIndex]) + trimmedDistances[0]
    val result:Int
    var tmpClockWise = 0
    var tmpCounterClockWise = distanceToFirst

    for(i in 0 until trimmedDistances.size - 1) {
        tmpClockWise += trimmedDistances[i + 1] - trimmedDistances[i]
    }

    for(i in 1 until trimmedDistances.size - 1) {
        tmpCounterClockWise += trimmedDistances[i + 1] - trimmedDistances[i]
    }

    result = tmpClockWise.coerceAtMost(tmpCounterClockWise)
    println(result)
}