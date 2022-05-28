package iterator

object IteratorPatternDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val namesRepository = NameRepository()
        val iter = namesRepository.iterator
        while (iter.hasNext()) {
            val name = iter.next() as String?
            println("Name : $name")
        }
    }
}