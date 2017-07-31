package DecoratorPattern

/**
 * Created by azisuazusa on 7/21/17.
 */
class RunnerDecorator(personInterface: PersonInterface) : Decorator(personInterface) {
    fun grantRunSkill() {
        println("can run...")
    }

    override fun walk() {
        personInterface.walk()
        grantRunSkill()
    }
}