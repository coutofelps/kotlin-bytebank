package bytebank.models

abstract class Account(
    var holder: Client,
    val number: Int) {
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

    /*
    fun getBalance() : Double {
        return this.balance
    }

    fun setBalance(balance : Double) {
        if(balance > 0) {
            this.balance = balance
        }
    }

    constructor(holder : String, number : Int) {
        this.holder = holder
        this.number = number
    }
    */

    fun deposit(amount : Double) {
        if(amount > 0) {
            this.balance += amount
        }
    }

    open fun transfer(amount : Double, targetAccount : Account) : Boolean {
        // Código utilizando o padrão early return
        if(this.balance >= amount) {
            this.balance -= amount
            targetAccount.balance += amount
            return true
        }

        return false;
    }

    abstract fun withdraw(amount : Double)
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

    override fun transfer(amount: Double, targetAccount: Account): Boolean {
        print("Não é possível realizar uma transferência com uma conta salário.")
        return false
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