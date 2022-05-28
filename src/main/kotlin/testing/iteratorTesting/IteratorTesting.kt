package testing.iteratorTesting

import iterator.NameRepository
import org.junit.jupiter.api.Assertions.*
import testing.iteratorTesting.IteratorCase
import org.junit.jupiter.api.Test

class IteratorTesting {

    @Test
    fun iteratorIterate() {
        //Checks if iteration is not giving null
        val namesRepository = NameRepository()
        val iter = namesRepository.iterator

        assertNotNull(iter.hasNext())
    }


    @Test
    fun findIterateName() {
        //Checks if given name can be found with iteration
        val nameGiven = IteratorCase.getName("Lora")

        assertTrue(nameGiven)
    }

    @Test
    fun numberOfIteration() {
        //Checks if number of iterations in the same with size of collection
        val numberGiven = IteratorCase.getNumberOfIteration()

        assertTrue(numberGiven)
    }
}