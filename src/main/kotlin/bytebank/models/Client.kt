package bytebank.models

class Client(
    val name: String,
    val CPF: String,
    val adress: Adress = Adress(),
    private val password: String
) : AuthInterface {
    override fun auth(password: String): Boolean {
        if(this.password == password) {
            return true
        }

        return false
    }
}