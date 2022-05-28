package testing.PrototypeTesting

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import prototype.*

class PrototypeTest{

    /*
    Loadcache clone IDs:
    1 - circle
    2 - square
    3 - rectangle
     */

    @Test
    fun testCircleClone(){
        ShapeCache.loadCache()

        //Assert that cloned Circle with ID of 1 is Circle Class
        Assertions.assertTrue(ShapeCache.getShape("1") is Circle)
        Assertions.assertFalse(ShapeCache.getShape("1") is Square)
        Assertions.assertFalse(ShapeCache.getShape("1") is Rectangle)
    }

    @Test
    fun testSquareClone(){
        ShapeCache.loadCache()

        //Assert that cloned Square is Square Class
        Assertions.assertFalse(ShapeCache.getShape("2") is Circle)
        Assertions.assertTrue(ShapeCache.getShape("2") is Square)
        Assertions.assertFalse(ShapeCache.getShape("2") is Rectangle)
    }

    @Test
    fun testRectangleClone(){
        ShapeCache.loadCache()

        //Assert that cloned Rectangle is Rectangle Class
        Assertions.assertFalse(ShapeCache.getShape("3") is Circle)
        Assertions.assertFalse(ShapeCache.getShape("3") is Square)
        Assertions.assertTrue(ShapeCache.getShape("3") is Rectangle)
    }
}