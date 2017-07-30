import BuilderPattern.PersonBuilder
import DecoratorPattern.PersonInterface
import DecoratorPattern.Runner
import DecoratorPattern.RunnerDecorator
import SingletonPattern.Singleton

/**
 * Created by azisuazusa on 7/22/17.
 */
fun main(args: Array<String>) {

}

fun singletonPattern() {
    val firstObject = Singleton.instance
    firstObject.obj = "First Assign"
    val secondObject = Singleton.instance
    print(secondObject) // the result still First Assign
}

fun builderPattern() {
    val person = PersonBuilder().setFirstName("Azis").setMiddleName("Abdul").build()
    print(person.firstName + " " + person.middleName + " " + person.lastName)
}

fun decoratorPattern() {
    val runner = Runner()
    runner.walk()
    val runnerSkill: PersonInterface = RunnerDecorator(runner)
    runnerSkill.walk()
}