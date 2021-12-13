package bytebank.models

import bytebank.models.AuthInterface

class InternalSystem {
    fun login(administrator: AuthInterface, password: String) {
        if(administrator.auth(password)) {
            println("Login realizado com sucesso!")
            println("Bem-vindo ao Bytebank!")
        } else {
            println("Falha na autenticação.")
        }
    }
}