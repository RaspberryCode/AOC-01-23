package day01

import readInput
import runPart
import test
import java.util.*

fun main() {
    val day = {}.javaClass.enclosingClass.`package`.name

    fun extractNumberFromLine(line: String): Int {
        val numbers = line.split("").map { it.toIntOrNull() }.filter { Objects.nonNull(it) }
        return numbers.first()!!.times(10) + numbers.last()!!
    }

    fun part1(input: List<String>): Int {
        return input.sumOf { extractNumberFromLine(it) }
    }

    fun part2(input: List<String>): Int {
        return input.map { line ->
            Number.replaceWordsToNumbers(
                line
            )
        }.sumOf { firstAndLastNumber -> extractNumberFromLine(firstAndLastNumber) }
    }

    runPart(1, day, ::part1)
    runPart(2, day, ::part2)
}