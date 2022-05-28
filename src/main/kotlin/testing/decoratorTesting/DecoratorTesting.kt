package testing.decoratorTesting

import decorator.*
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DecoratorTesting {
    @Test
    fun circleShapeDecorator(){
        val circle: Shape = Circle()
        assertTrue(circle is Shape)
    }

    @Test
    fun circleShapeDecoratorRed() {
        //Checks if redCircle implements both old and new Decorators
        val redCircle: Shape = RedShapeDecorator(Circle())
        assertTrue(redCircle is ShapeDecorator)
        assertTrue(redCircle is RedShapeDecorator)
    }

    @Test
    fun rectangleShapeDecoratorRed() {
        val redRectangle: Shape = RedShapeDecorator(Rectangle())
        assertTrue(redRectangle is ShapeDecorator)
        assertTrue(redRectangle is RedShapeDecorator)
    }
}