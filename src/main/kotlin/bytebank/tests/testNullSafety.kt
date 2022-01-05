package bytebank.tests

import bytebank.models.Adress

fun testNullSafety() {
    var nullAdress: Adress? = Adress(publicPlace = "Rua", complement = "71-C")
    val newAdress: String? = nullAdress?.publicPlace

    // Criando uma safe call encadeada com um let
    nullAdress?.let { adress: Adress -> // Dei um apelido ao it, utilizando a lambda (->)
        println(adress.publicPlace.length)
        val complementSize: Int = adress.complement?.length ?: 0
        println(complementSize)

        test("")
        test(1)
    }
}

// Criando função para trabalhar com os valores que esperamos e valores nulos
fun test(value: Any) {
    val number: Int? = value as? Int // A variável number recebe um tipo Int ou nulo, e depois a converte para um do tipo Int ou nulo
    println(number)
}