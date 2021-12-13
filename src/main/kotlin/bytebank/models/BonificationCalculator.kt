package bytebank.models

import bytebank.models.Employee

class BonificationCalculator {
    var total: Double = 0.0
        private set

    fun register(employee: Any) {
        if(employee is Employee)
            this.total += employee.bonification
    }
}