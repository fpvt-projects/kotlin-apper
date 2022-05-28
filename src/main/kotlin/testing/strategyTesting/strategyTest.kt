package testing.strategyTesting

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import strategy.*

class StrategyTest{

    @Test
    fun testOperationAdd(){
        //Tests if OperationAdd is working

        var num1: Int = 10
        var num2: Int = 5

        var context = Context(OperationAdd())
        Assertions.assertEquals(15,context.executeStrategy(num1, num2))
    }

    @Test
    fun testOperationSubtract(){
        //Tests if OperationSubtract is working

        var num1: Int = 10
        var num2: Int = 5

        var context = Context(OperationSubtract())
        Assertions.assertEquals(5,context.executeStrategy(num1, num2))
    }

    @Test
    fun testOperationMultiply(){
        //Tests if OperationMultiply is working

        var num1: Int = 10
        var num2: Int = 5

        var context = Context(OperationMultiply())
        Assertions.assertEquals(50,context.executeStrategy(num1, num2))
    }

    @Test
    fun testMultipleStrategy(){
        //Tests if Various strategies are working

        var num1: Int = 10
        var num2: Int = 5

        var context1 = Context(OperationAdd())
        var context2 = Context(OperationSubtract())
        var context3 = Context(OperationMultiply())

        // (10 + 5) * (10 - 5) = 75
        Assertions.assertEquals(75,
            context3.executeStrategy(
                context1.executeStrategy(num1, num2),
                context2.executeStrategy(num1, num2)
            )
        )
    }
}