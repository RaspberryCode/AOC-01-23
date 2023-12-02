package nextDay

import readInput
import test


fun main() {
    val day = "nextDay"

    fun part1(input: List<String>): Int {
        return 0
    }

    fun part2(input: List<String>): Int {
        return 0
    }


    test("${day}_p1", ::part1)
    val part1Result = part1(readInput("${day}_p1_real"))
    println("Part 1 result: $part1Result")

    test("${day}_p2", ::part2)
    val part2Result = part2(readInput("${day}_p2_real"))
    println("Part 2 result: $part2Result")
}