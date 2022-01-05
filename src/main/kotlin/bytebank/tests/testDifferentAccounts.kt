import bytebank.models.*

fun testDifferentAccounts() {
    val transactionAccountData = Client(name = "Marcos Felipe", CPF = "111.111.111-11", password = "1", adress = Adress(publicPlace = "Avenida Marcos Penteado de Ulhôa Rodrigues"));
    val savingAccountData = Client(name = "Lionel Messi", CPF = "111.111.111-11", password = "1");
    val salaryAccountData = Client(name = "Cristiano Ronaldo", CPF = "111.111.111-11", password = "1");

    val transactionAccount = TransactionAccount(holder = transactionAccountData, number = 101010)
    val savingAccount = SavingAccount(holder = savingAccountData, number = 707070)
    val salaryAccount = SalaryAccount(holder = salaryAccountData, number = 505050)

    transactionAccount.deposit(1000.0)
    savingAccount.deposit(1000.0)
    salaryAccount.deposit(1000.0)

    println("Saldo da conta-corrente: R$ ${transactionAccount.balance}")
    println("Saldo da conta-poupança: R$ ${savingAccount.balance}")
    println("Saldo da conta-salário: R$ ${savingAccount.balance}")
    println("Logradouro: ${transactionAccount.holder.adress.publicPlace}")

    transactionAccount.withdraw(100.0)
    savingAccount.withdraw(100.0)
    salaryAccount.withdraw(100.0)

    println("Saldo da conta-corrente após o saque: R$ ${transactionAccount.balance}")
    println("Saldo da conta-poupança após o saque: R$ ${savingAccount.balance}")
    println("Saldo da conta-salário após o saque: R$ ${salaryAccount.balance}")

    transactionAccount.transfer(100.0, savingAccount, "1")
    println("Saldo da conta-corrente após realizar a transferência: R$ ${transactionAccount.balance}")
    println("Saldo da conta-poupança após receber a transferência: R$ ${savingAccount.balance}")

    savingAccount.transfer(100.0, transactionAccount, "1")
    println("Saldo da conta-poupança após realizar a transferência: R$ ${savingAccount.balance}")
    println("Saldo da conta-corrente após receber a transferência: R$ ${transactionAccount.balance}")

    salaryAccount.transfer(100.0, transactionAccount)
}