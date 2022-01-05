package bytebank.models

import bytebank.exceptions.AuthException
import bytebank.exceptions.InsufficientFundsException

abstract class Account(var holder: Client, val number: Int): AuthInterface {
    var balance: Double = 0.0
        protected set // Dessa maneira, apenas as classes que herdarem esta classe poderão alterar o valor do saldo

    companion object Counter {
        var total: Int = 0
            private set
    }

    init {
        println("Criando conta...")
        total++
    }

    override fun auth(password: String): Boolean {
        return holder.auth(password)
    }

    /*
    fun getBalance(): Double {
        return this.balance
    }

    fun setBalance(balance: Double) {
        if(balance > 0) {
            this.balance = balance
        }
    }

    constructor(holder: String, number: Int) {
        this.holder = holder
        this.number = number
    }
    */

    fun deposit(amount: Double) {
        if(amount > 0) {
            this.balance += amount
        }
    }

    open fun transfer(amount: Double, targetAccount: Account, password: String) {
        if(this.balance < amount) {
            throw InsufficientFundsException()
        }

        if(!auth(password)) {
            throw AuthException()
        }

        this.balance -= amount
        targetAccount.balance += amount
    }

    abstract fun withdraw(amount: Double)
}

class SalaryAccount (
    holder: Client,
    number: Int
): Account(
    holder = holder,
    number = number
) {
    override fun withdraw(amount: Double) {
        if(this.balance >= amount) {
            this.balance -= amount
        }
    }

    fun transfer(amount: Double, targetAccount: Account) {
        print("Não é possível realizar uma transferência com uma conta salário.")
    }
}

class SavingAccount(
    holder: Client,
    number: Int) : Account(
    holder = holder,
    number = number
) {
    override fun withdraw(amount: Double) {
        if(this.balance >= amount) {
            this.balance -= amount
        }
    }
}

class TransactionAccount(
    holder: Client,
    number: Int
): Account(
    holder = holder,
    number = number
) {
    override fun withdraw(amount: Double) {
        val taxedValue = amount + 0.1

        if(this.balance >= taxedValue) {
            this.balance -= taxedValue
        }
    }
}