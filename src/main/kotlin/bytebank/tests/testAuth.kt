import bytebank.models.Client
import bytebank.models.Director
import bytebank.models.InternalSystem
import bytebank.models.Manager

fun testAuth() {
    val manager = Manager(name = "Marcos Felipe", CPF = "111.111.111-11", salary = 1000.0, password = "123456", PLR = 2.0)
    val director = Director(name = "Marcos Felipe", CPF = "111.111.111-11", salary = 1000.0, password = "123456", PLR = 2.0)
    val client = Client(name = "Marcos Felipe", CPF = "111.111.111-11", password = "123456")
    val system = InternalSystem()

    system.login(manager, "123456")
    system.login(director, "111111")
    system.login(client, "111111")
}