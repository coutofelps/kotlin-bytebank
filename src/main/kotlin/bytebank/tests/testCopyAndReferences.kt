import bytebank.models.Client
import bytebank.models.SavingAccount
import bytebank.models.TransactionAccount

fun testCopyAndReferences() {
    val accountDataOne = Client(name = "Marcos Felipe", CPF = "111.111.111-11", password = "1");

    val accountPersonOne = TransactionAccount(accountDataOne, number = 1000)

    println(accountPersonOne.holder)
    println(accountPersonOne.number)
    println(accountPersonOne.balance)

    val accountDataTwo = Client(name = "Beatriz Mendes", CPF = "111.111.111-11", password = "1");

    val accountPersonTwo =  SavingAccount(accountDataTwo, number = 1001)

    println(accountPersonTwo.holder)
    println(accountPersonTwo.number)
    println(accountPersonTwo.balance)
}