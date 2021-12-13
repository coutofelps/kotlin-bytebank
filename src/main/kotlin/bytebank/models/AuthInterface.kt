package bytebank.models

// As interfaces "obrigam" as classes que a instanciam a terem certas propriedades e/ou funções.
interface AuthInterface {
    fun auth(password : String) : Boolean
}