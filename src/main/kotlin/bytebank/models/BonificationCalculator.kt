package bytebank.models

import bytebank.models.Employee

class BonificationCalculator {
    var total: Double = 0.0
        private set

    fun register(employee: Employee) {
        this.total += employee.bonification
    }
}