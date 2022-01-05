package bytebank.exceptions

// Criando uma exceção personalizada
class AuthException(message: String = "Falha na autenticação."): Exception(message)