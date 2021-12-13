package bytebank.models

import bytebank.models.Administrator
import bytebank.models.AuthInterface

class Director(
    name : String,
    CPF : String,
    salary : Double,
    password : String,
    val PLR : Double
): Administrator(
    name = name,
    CPF = CPF,
    salary = salary,
    password = password
), AuthInterface {
    // Utilizei o override para reescrita da propriedade da parent class
    override val bonification: Double
        get() {
            return salary + PLR
        }
}