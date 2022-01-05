package bytebank.tests

import bytebank.exceptions.InsufficientFundsException
import java.lang.ClassCastException
import java.lang.NumberFormatException

fun testStack() {
    val entry: String = "1.9"

    val value: Double? = try {
        entry.toDouble()
    }

    catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    val taxedValue: Double? = if(value != null) {
        value + 0.1
    }

    else {
        null
    }

    functionOne()
}

fun functionOne() {
    println("Início da função um")

    try {
        functionTwo()
    }

    catch (e: ClassCastException) { // Exception do tipo ClassCastException
        println(e.printStackTrace())
        println("ClassCastException foi encontrada")
    }

    println("Fim da função um")
}

fun functionTwo() {
    println("Início da função dois")

    for(i in 1..5) {
        println(i)

        val adress = Any()
        throw InsufficientFundsException()
    }

    println("Fim da função dois")
}