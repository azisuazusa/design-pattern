import BuilderPattern.PersonBuilder
import DecoratorPattern.PersonInterface
import DecoratorPattern.Runner
import DecoratorPattern.RunnerDecorator
/**
 * Created by azisuazusa on 7/22/17.
 */
fun main(args: Array<String>) {
    val singleton1 = Singleton.instance
    singleton1.prop = "111111"
    val singleton2 = Singleton.instance
    print(singleton2.prop)
}

fun builderPattern() {
    val person = PersonBuilder().setFirstName("Azis").build()
    print(person.firstName)
}

fun decoratorPattern() {
    val runner = Runner()
    runner.walk()
    val runnerSkill: PersonInterface = RunnerDecorator(runner)
    runnerSkill.walk()
}