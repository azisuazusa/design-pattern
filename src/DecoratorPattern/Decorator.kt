package DecoratorPattern
/**
 * Created by azisuazusa on 7/21/17.
 */
abstract class Decorator(protected val personInterface: PersonInterface) : PersonInterface {
    override fun walk(){

    }
}