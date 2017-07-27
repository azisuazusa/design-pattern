package DecoratorPattern
/**
 * Created by azisuazusa on 7/21/17.
 */
abstract class Decorator(personInterface: PersonInterface) : PersonInterface {
    protected var personInteface: PersonInterface = personInterface
    override fun walk(){

    }
}