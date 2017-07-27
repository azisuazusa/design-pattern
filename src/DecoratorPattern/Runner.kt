package DecoratorPattern

/**
 * Created by azisuazusa on 7/21/17.
 */
class Runner : PersonInterface {
    override fun walk(){
        println("Walk very slow...")
    }
}