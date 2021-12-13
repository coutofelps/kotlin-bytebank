package bytebank.models

class Adress (
    var publicPlace: String = "",
    var number: Int = 0,
    var district: String = "",
    var city: String = "",
    var provincy: String = "",
    var CEP: String = "",
    var complement: String = ""
) {
    override fun toString(): String {
        return "Endereço: '$publicPlace', número: '$number', bairro: '$district', cidade: '$city', estado: '$provincy', CEP: '$CEP', complemento: '$complement'"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Adress

        if (publicPlace != other.publicPlace) return false
        if (number != other.number) return false
        if (district != other.district) return false
        if (city != other.city) return false
        if (provincy != other.provincy) return false
        if (CEP != other.CEP) return false
        if (complement != other.complement) return false

        return true
    }

    override fun hashCode(): Int {
        var result = publicPlace.hashCode()
        result = 31 * result + number
        result = 31 * result + district.hashCode()
        result = 31 * result + city.hashCode()
        result = 31 * result + provincy.hashCode()
        result = 31 * result + CEP.hashCode()
        result = 31 * result + complement.hashCode()
        return result
    }
}