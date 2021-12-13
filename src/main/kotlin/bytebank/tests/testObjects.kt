import bytebank.models.AuthInterface
import bytebank.models.InternalSystem

fun testObjects() {
    val client = object : AuthInterface {
        val name: String = "Marcos Felipe"
        val CPF: String = "111.111.111-11"
        val password: String = "1000"

        override fun auth(password: String) = this.password == password
    }

    val internalSystem = InternalSystem()
    internalSystem.login(client, "1000")
}