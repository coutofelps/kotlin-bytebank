package bytebank.exceptions

// Criando uma exceção personalizada
class InsufficientFundsException(message: String = "O saldo é insuficiente."): Exception(message)