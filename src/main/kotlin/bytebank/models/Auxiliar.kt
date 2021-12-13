package bytebank.models

import bytebank.models.Employee

class Auxiliar(name: String, CPF: String, salary: Double): Employee(name = name, CPF = CPF, salary = salary) {
    // Utilizei o override para reescrita da propriedade da parent class
    override val bonification: Double
        get() = salary * 0.05
}