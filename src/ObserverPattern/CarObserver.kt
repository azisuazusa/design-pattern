package ObserverPattern

class CarObserver : Observer {
    override fun update(color: String) {
        println("The car is " + color)
    }
}