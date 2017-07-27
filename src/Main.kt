import BuilderPattern.PersonBuilder
import DecoratorPattern.PersonInterface
import DecoratorPattern.Runner
import DecoratorPattern.RunnerDecorator

/**
 * Created by azisuazusa on 7/22/17.
 */
fun main(args: Array<String>) {

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