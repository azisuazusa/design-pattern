import BuilderPattern.PersonBuilder
import DecoratorPattern.Runner
import DecoratorPattern.RunnerDecorator
import ObserverPattern.CarObserver
import ObserverPattern.PlaneObserver
import SingletonPattern.Singleton
import ObserverPattern.Subject

/**
 * Created by azisuazusa on 7/22/17.
 */
fun main(args: Array<String>) {
    
}

fun singletonPattern() {
    val firstObject = Singleton.instance
    firstObject.obj = "First Assign"
    val secondObject = Singleton.instance
    print(secondObject) // the result still 'First Assign'
}

fun builderPattern() {
    val person = PersonBuilder().setFirstName("Azis").setMiddleName("Abdul").build()
    print(person.firstName + " " + person.middleName + " " + person.lastName)
}

fun decoratorPattern() {
    val runner = Runner()
    runner.walk()
    val runnerSkill = RunnerDecorator(runner)
    runnerSkill.walk()
}

fun observerPattern() {
    val subject = Subject()
    subject.registerObserver(arrayOf(CarObserver(), PlaneObserver()))
    println("Set color to Red")
    subject.setColor("Red")
    println("Set color to Blue")
    subject.setColor("Blue")
}