package ObserverPattern

class PlaneObserver : Observer {
    override fun update(color: String) {
        println("The plane is " + color)
    }

}