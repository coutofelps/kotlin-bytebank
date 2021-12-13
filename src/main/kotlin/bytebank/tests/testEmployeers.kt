import bytebank.models.Analyst
import bytebank.models.Manager

fun testEmployeers() {
    val empOne = Analyst(
        name = "Marcos Felipe",
        CPF = "111.111.111-11",
        salary = 1000.0
    )

    println("Nome do funcionário: ${empOne.name}")
    println("CPF do funcionário: ${empOne.CPF}")
    println("Salário do funcionário: ${empOne.salary}")

    val empTwo = Manager(
        name = "Marcos Felipe",
        CPF = "111.111.111-11",
        salary = 1000.0,
        password = "123456",
        PLR = 1000.0
    )

    println("Nome do funcionário: ${empTwo.name}")
    println("CPF do funcionário: ${empTwo.CPF}")
    println("Salário do funcionário: ${empTwo.salary}")
    println("PLR do funcionário: ${empTwo.PLR}")
}