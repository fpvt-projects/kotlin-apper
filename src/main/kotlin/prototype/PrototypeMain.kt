import prototype.*

object PrototypeDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        ShapeCache.loadCache()
        println("Shape : " + ShapeCache.getShape("1").type)
        println("Shape : " + ShapeCache.getShape("2").type)
        println("Shape : " + ShapeCache.getShape("3").type)
    }
}







