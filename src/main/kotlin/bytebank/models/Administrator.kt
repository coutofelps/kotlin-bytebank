package bytebank.models

import bytebank.models.AuthInterface
import bytebank.models.Employee

abstract class Administrator(
    name: String,
    CPF: String,
    salary: Double,
    private val password: String
): Employee(
    name = name,
    CPF = CPF,
    salary = salary
), AuthInterface {
    override fun auth(password: String): Boolean {
        if(this.password == password) {
            return true
        }

        return false
    }
}