package kt

import java.math.RoundingMode
import kotlin.random.Random

fun main() {

    cutLogs(5, listOf(15, 11, 19))
}

fun cutLogs(cuts: Int, logs: List<Int>) {

    var logsDouble = logs.map{it.toDouble()}.toMutableList()

    val result: Int
    var cutOne = 0.0
    var cutTwo = 0.0

    for (i in cuts downTo 0) {
        logsDouble = logsDouble.sortedDescending().toMutableList()
        if (logsDouble[0] <= 0.1) {
            break
        }
        cutOne = Random.nextDouble(0.1, logsDouble[0])
        cutTwo = logsDouble[0] - cutOne

        logsDouble = logsDouble.drop(1).toMutableList()
        logsDouble.add(cutOne)
        logsDouble.add(cutTwo)

    }

    result = cutOne.coerceAtMost(cutTwo).toBigDecimal().setScale(0, RoundingMode.UP).toInt()
    println(result)
}