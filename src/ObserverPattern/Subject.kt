package ObserverPattern

/**
 * Created by azisuazusa on 7/22/17.
 */
class Subject {
    val observers: MutableList<Observer> = ArrayList()

    fun setColor(color: String) {
        notifyAllObservers(color)
    }
    fun registerObserver(observer: Array<Observer>) {
        observers.addAll(observer)
    }

    fun notifyAllObservers(color: String) {
        for (observer in observers) {
            observer.update(color)
        }
    }
}