package bytebank.models

import bytebank.models.Administrator

class Manager(
    name: String,
    CPF: String,
    salary: Double,
    password: String,
    val PLR: Double
): Administrator(
    name = name,
    CPF = CPF,
    salary = salary,
    password = password
) {
    override val bonification: Double // Utilizei o override para reescrita da propriedade da parent class
        get() {
            return salary
        }

    /*
    // Aqui, indiquei que quero utilizar o método auth proveniente da interface, e não da classe Adminstrator
    override fun auth(password: String): Boolean {
        return super<models.AuthInterface>.auth(password)
    }
    */
}