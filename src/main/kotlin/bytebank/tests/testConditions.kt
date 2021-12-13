fun testConditions(balance : Double) {
    when {
        balance > 0.0 -> {
            println("Seu saldo atual é positivo!")
        }
        balance == 0.0 -> {
            println("Sua conta ainda é neutra!")
        }
        else -> {
            println("Seu saldo atual é negativo!")
        }
    }
}