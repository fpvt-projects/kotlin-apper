package decorator

abstract class ShapeDecorator(protected var decoratedShape: Shape) : Shape {
    override fun draw() {
        decoratedShape.draw()
    }
}