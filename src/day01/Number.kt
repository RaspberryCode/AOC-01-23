package day01

enum class Number(val word: String, val replace: String) {
    ONE("one", "one1one"),
    TWO("two", "two2two"),
    THREE("three", "three3three"),
    FOUR("four", "four4four"),
    FIVE("five", "five5five"),
    SIX("six", "six6six"),
    SEVEN("seven", "seven7seven"),
    EIGHT("eight", "eight8eight"),
    NINE("nine", "nine9nine");

    companion object {
        fun replaceWordsToNumbers(text: String): String {
            var modifiedText = text
            for (entry in entries) {
                modifiedText = modifiedText.replace(entry.word, entry.replace)
            }
            return modifiedText
        }
    }
}