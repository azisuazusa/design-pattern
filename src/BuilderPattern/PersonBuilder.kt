package BuilderPattern
/**
 * Created by azisuazusa on 7/21/17.
 */
class PersonBuilder {
    var firstName: String? = null
    var middleName: String? = null
    var lastName: String? = null

    fun setFirstName(firstName: String) : PersonBuilder {
        this.firstName = firstName
        return this
    }

    fun setMiddleName(middleName: String) : PersonBuilder {
        this.middleName = middleName
        return this
    }

    fun setLastName(lastName: String) : PersonBuilder {
        this.lastName = lastName
        return this
    }

    fun build() : Person {
        val person = Person()
        person.firstName = this.firstName
        person.middleName = this.middleName
        person.lastName = this.lastName
        return person
    }
}