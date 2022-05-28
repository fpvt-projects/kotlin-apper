package composite

import java.util.ArrayList

class Employee(private val name: String, private val dept: String, private val salary: Int) {
    private val subordinates: MutableList<Employee>

    // constructor
    init {
        subordinates = ArrayList()
    }

    fun add(e: Employee) {
        subordinates.add(e)
    }

    fun remove(e: Employee) {
        subordinates.remove(e)
    }

    fun getSubordinates(): List<Employee> {
        return subordinates
    }

    override fun toString(): String {
        return "Employee :[ Name : $name, dept : $dept, salary :$salary ]"
    }
}