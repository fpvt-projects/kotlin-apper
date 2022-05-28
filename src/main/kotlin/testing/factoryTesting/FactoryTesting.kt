package testing.factoryTesting

import factory.Circle
import factory.Rectangle
import org.junit.jupiter.api.Test
import factory.ShapeFactory
import factory.Square
import org.junit.jupiter.api.Assertions.*
import kotlin.io.path.createTempDirectory


class FactoryTesting {
    private val shapeFactory = ShapeFactory()

    @Test
    fun factoryNotNullShapes() {
        //Checks if its not returning null
        val rectangleShape = shapeFactory.getShape("Rectangle")
        val circleShape = shapeFactory.getShape("Circle")
        val squareShape = shapeFactory.getShape("Square")

        assertNotNull(rectangleShape)
        assertNotNull(circleShape)
        assertNotNull(squareShape)
    }

    @Test
    fun factoryShapeCheckCircle(){
        //Test if it matches to Circle
        val shape1 = shapeFactory.getShape("CIRCLE")

        assertTrue(shape1 is Circle)
    }

    @Test
    fun factoryShapeCheckRectangle(){
        //Test if it matches to Rectangle
        val shape2 = shapeFactory.getShape("Rectangle")

        assertTrue(shape2 is Rectangle)
    }

    @Test
    fun factoryShapeCheckSquare(){
        //Test if it matches to Square
        val shape3 = shapeFactory.getShape("Square")

        assertTrue(shape3 is Square)
    }

    @Test
    fun factoryShapeCheckUnknown(){
        //Test if it returns false when shapeType is not found or Typo
        val unknownShape = shapeFactory.getShape("0ctagon")

        assertFalse(unknownShape is Circle)
        assertFalse(unknownShape is Rectangle)
        assertFalse(unknownShape is Square)
    }

    @Test
    fun factoryShapeIsNull(){
        //Test if its returns null
        val nullShape = shapeFactory.getShape(null)

        assertNull(nullShape)
    }
}