import bytebank.models.Client
import bytebank.models.SavingAccount
import bytebank.models.TransactionAccount

fun testAccountBehavior() {
    println("Bem-vindo ao Bytebank!")

    val accountDataOne = Client(name = "Marcos Felipe", CPF = "111.111.111-11", password = "1");

    val accountPersonOne = TransactionAccount(holder = accountDataOne, number = 1000)
    accountPersonOne.deposit(200.00)

    val accountDataTwo = Client(name = "Beatriz Mendes", CPF = "111.111.111-11", password = "1");

    val accountPersonTwo = SavingAccount(holder = accountDataTwo, number = 1001)
    accountPersonTwo.deposit(300.00)

    accountPersonOne.deposit(100.0)
    println("Depositando 100 reais na conta do Marcos Felipe. Saldo atualizado:")
    println(accountPersonOne.balance)

    accountPersonOne.withdraw(50.0)
    println("Sacando 50 reais na conta do Marcos Felipe. Saldo atualizado:")
    println(accountPersonOne.balance)

    println("Transferência da conta da Beatriz Mendes para a conta do Marcos:")

    if(accountPersonTwo.transfer(100.0, accountPersonOne)) {
        println("Transferência realizada com sucesso.")
    }

    else {
        println("Transferência não realizada.")
    }

    println("Saldo do Marcos Felipe: ${accountPersonOne.balance}")
    println("Saldo da Beatriz Mendes: ${accountPersonTwo.balance}")
}