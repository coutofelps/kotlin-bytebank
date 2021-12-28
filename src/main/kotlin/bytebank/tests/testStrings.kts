fun testStrings() {
    val word = "word"
    var newWord = word1
    val substring = word.substring(4)

    newWord = "newWorld"

    println(word)
    println(newWord)

    for(c in word) {
        println(c == "n")
    }

    // Strings são IMUTÁVEIS.
}