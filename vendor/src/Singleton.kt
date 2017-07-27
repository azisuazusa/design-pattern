/**
 * Created by azisuazusa on 7/27/17.
 */
class Singleton private constructor() {
    companion object {
        val instance: Singleton by lazy { Singleton() }
    }
    var props:String? = null
}
