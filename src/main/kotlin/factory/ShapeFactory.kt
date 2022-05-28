package factory

class ShapeFactory {
    //use getShape method to get object of type shape
    fun getShape(shapeType: String?): Shape? {
        if (shapeType == null) {
            return null
        }
        if (shapeType.equals("CIRCLE", ignoreCase = true)) {
            return Circle()
        } else if (shapeType.equals("RECTANGLE", ignoreCase = true)) {
            return Rectangle()
        } else if (shapeType.equals("SQUARE", ignoreCase = true)) {
            return Square()
        }
        return null
    }
}