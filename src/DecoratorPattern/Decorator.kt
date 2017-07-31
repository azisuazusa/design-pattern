package DecoratorPattern
/**
 * Created by azisuazusa on 7/21/17.
 */
abstract class Decorator(personInterface: PersonInterface) : PersonInterface {
    protected var personInterface: PersonInterface = personInterface
    override fun walk(){

    }
}