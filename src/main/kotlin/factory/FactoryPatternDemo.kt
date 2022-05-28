package factory

object FactoryPatternDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val shapeFactory = ShapeFactory()

        //get an object of Circle and call its draw method.
        val shape1 = shapeFactory.getShape("CIRCLE")

        //call draw method of Circle
        shape1!!.draw()

        //get an object of Rectangle and call its draw method.
        val shape2 = shapeFactory.getShape("RECTANGLE")

        //call draw method of Rectangle
        shape2!!.draw()

        //get an object of Square and call its draw method.
        val shape3 = shapeFactory.getShape("SQUARE")

        //call draw method of square
        shape3!!.draw()
    }
}