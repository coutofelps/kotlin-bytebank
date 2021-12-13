package bytebank.models

abstract class Employee(
    val name: String,
    val CPF: String,
    val salary: Double
) {
    abstract val bonification: Double
}