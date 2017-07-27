package ObserverPattern

/**
 * Created by azisuazusa on 7/22/17.
 */
abstract class Observer {
    protected lateinit var subject: Subject
    abstract fun update()
}