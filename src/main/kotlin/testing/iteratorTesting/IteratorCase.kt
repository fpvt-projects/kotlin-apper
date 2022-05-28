package testing.iteratorTesting

import iterator.Iterator
import iterator.NameRepository
import javax.naming.Name

object IteratorCase {

    fun getName(thisName: String): Boolean {
        val namesRepository = NameRepository()
        val iter = namesRepository.iterator
        var found = false
        while (iter.hasNext()) {
            var name =  iter.next() as String?
            if(name.equals(thisName)){
                found = true
            }
        }
        return found
    }

    fun getNumberOfIteration(): Boolean {
        val namesRepository = NameRepository()
        val iter = namesRepository.iterator
        var result = false
        var index = 0
        while(iter.hasNext()) {
            var name =  iter.next() as String?
            index++
        }

        if(index == namesRepository.names.size){
            result = true
        }
        return result
    }
}