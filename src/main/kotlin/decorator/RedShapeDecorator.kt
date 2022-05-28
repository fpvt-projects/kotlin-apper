package decorator

class RedShapeDecorator(decoratedShape: Shape?) : ShapeDecorator(decoratedShape!!) {
    override fun draw() {
        decoratedShape.draw()
        setRedBorder(decoratedShape)
    }

    private fun setRedBorder(decoratedShape: Shape) {
        println("Border Color: Red")
    }
}