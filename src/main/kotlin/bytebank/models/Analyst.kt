package bytebank.models

class Analyst(
    name: String,
    CPF: String,
    salary: Double
): Employee(
    name = name,
    CPF = CPF,
    salary = salary
) {
    // Utilizei o override para reescrita da propriedade da parent class
    override val bonification: Double
        get() {
            return salary * 0.1
        }
}