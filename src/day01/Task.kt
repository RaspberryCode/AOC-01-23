package day01

import readInput
import test
import java.util.*

fun main() {
    val day = "Day01"

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


    test("${day}_p1", ::part1)
    val part1Result = part1(readInput("${day}_p1_real"))
    println("Part 1 result: $part1Result")

    test("${day}_p2", ::part2)
    val part2Result = part2(readInput("${day}_p2_real"))
    println("Part 2 result: $part2Result")
}