package day02

import readInput
import runPart
import test


fun main() {
    val day = {}.javaClass.enclosingClass.`package`.name

    fun part1(input: List<String>): Int {
        return 0
    }

    fun part2(input: List<String>): Int {
        return 0
    }

    runPart(1, day, ::part1)
    runPart(2, day, ::part2)
}