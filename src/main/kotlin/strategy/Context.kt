package strategy

class Context(private val strategy: Strategy) {
    fun executeStrategy(num1: Int, num2: Int): Int {
        return strategy.doOperation(num1, num2)
    }
}