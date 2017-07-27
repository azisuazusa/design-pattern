package ObserverPattern

/**
 * Created by azisuazusa on 7/22/17.
 */
class Subject {
    val observers: List<Observer> = ArrayList()
    private var state: Int = 0

}