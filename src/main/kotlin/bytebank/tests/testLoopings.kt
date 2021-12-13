fun testLoopings() {
    // val: variável com valor não modificável
    // var: variável com valor modificável
    val holder : String = "Marcos Felipe"
    val accountNumber : Int = 1000
    var balance : Double = 0.0

    println("Bem-vindo ao Bytebank!")
    println("Olá, $holder!")
    println("Número da conta: $accountNumber")
    println("Saldo atual: $balance")

    for(i in 1..5) {
        // Parar na quarta iteração
        if(i == 4) {
            // break
        }

        // Pular a iteração quando i = 4
        if(i == 4) {
            continue
        }

        println(i)
    }

    for(i in 5 downTo 1 step 1) {
        println(i)
    }

    var i = 0
    while(i < 5) {
        println("While looping: iterator $i")
        i++
    }
}