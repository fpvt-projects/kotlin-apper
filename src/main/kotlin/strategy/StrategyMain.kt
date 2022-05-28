import strategy.Context
import strategy.OperationAdd
import strategy.OperationMultiply
import strategy.OperationSubtract
import kotlin.jvm.JvmStatic

object StrategyPatternDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        var context = Context(OperationAdd())
        println("10 + 5 = " + context.executeStrategy(10, 5))
        context = Context(OperationSubtract())
        println("10 - 5 = " + context.executeStrategy(10, 5))
        context = Context(OperationMultiply())
        println("10 * 5 = " + context.executeStrategy(10, 5))
    }
}