package testing.compositeTesting

import composite.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions


class CompositeTest {

    @Test
    fun testHeadSales(){

        val CEO = Employee("John", "CEO", 30000)
        val headSales = Employee("Robert", "Head Sales", 20000)
        val headMarketing = Employee("Michel", "Head Marketing", 20000)
        val clerk1 = Employee("Laura", "Marketing", 10000)
        val clerk2 = Employee("Bob", "Marketing", 10000)
        val salesExecutive1 = Employee("Richard", "Sales", 10000)
        val salesExecutive2 = Employee("Rob", "Sales", 10000)

        CEO.add(headSales)
        CEO.add(headMarketing)
        headSales.add(salesExecutive1)
        headSales.add(salesExecutive2)
        headMarketing.add(clerk1)
        headMarketing.add(clerk2)

        //Checks if HeadSales is a direct subordinate of CEO
        Assertions.assertTrue(headSales in CEO.getSubordinates())
    }

    @Test
    fun testHeadMarketing(){

        val CEO = Employee("John", "CEO", 30000)
        val headSales = Employee("Robert", "Head Sales", 20000)
        val headMarketing = Employee("Michel", "Head Marketing", 20000)
        val clerk1 = Employee("Laura", "Marketing", 10000)
        val clerk2 = Employee("Bob", "Marketing", 10000)
        val salesExecutive1 = Employee("Richard", "Sales", 10000)
        val salesExecutive2 = Employee("Rob", "Sales", 10000)

        CEO.add(headSales)
        CEO.add(headMarketing)
        headSales.add(salesExecutive1)
        headSales.add(salesExecutive2)
        headMarketing.add(clerk1)
        headMarketing.add(clerk2)

        //Checks if HeadMarketing is a direct subordinate of CEO
        Assertions.assertTrue(headMarketing in CEO.getSubordinates())
    }

    @Test
    fun testSalesExecutives(){

        val CEO = Employee("John", "CEO", 30000)
        val headSales = Employee("Robert", "Head Sales", 20000)
        val headMarketing = Employee("Michel", "Head Marketing", 20000)
        val clerk1 = Employee("Laura", "Marketing", 10000)
        val clerk2 = Employee("Bob", "Marketing", 10000)
        val salesExecutive1 = Employee("Richard", "Sales", 10000)
        val salesExecutive2 = Employee("Rob", "Sales", 10000)

        CEO.add(headSales)
        CEO.add(headMarketing)
        headSales.add(salesExecutive1)
        headSales.add(salesExecutive2)
        headMarketing.add(clerk1)
        headMarketing.add(clerk2)

        //Checks if BOTH Sales Executive are direct subordinates of Head Sales
        Assertions.assertTrue(salesExecutive1 in headSales.getSubordinates())
        Assertions.assertTrue(salesExecutive2 in headSales.getSubordinates())
    }

    @Test
    fun testClerks(){

        val CEO = Employee("John", "CEO", 30000)
        val headSales = Employee("Robert", "Head Sales", 20000)
        val headMarketing = Employee("Michel", "Head Marketing", 20000)
        val clerk1 = Employee("Laura", "Marketing", 10000)
        val clerk2 = Employee("Bob", "Marketing", 10000)
        val salesExecutive1 = Employee("Richard", "Sales", 10000)
        val salesExecutive2 = Employee("Rob", "Sales", 10000)

        CEO.add(headSales)
        CEO.add(headMarketing)
        headSales.add(salesExecutive1)
        headSales.add(salesExecutive2)
        headMarketing.add(clerk1)
        headMarketing.add(clerk2)

        //Checks if BOTH Clerks are direct subordinates of Head Marketing
        Assertions.assertTrue(clerk1 in headMarketing.getSubordinates())
        Assertions.assertTrue(clerk2 in headMarketing.getSubordinates())
    }

    @Test
    fun testClerksWrongHead(){

        val CEO = Employee("John", "CEO", 30000)
        val headSales = Employee("Robert", "Head Sales", 20000)
        val headMarketing = Employee("Michel", "Head Marketing", 20000)
        val clerk1 = Employee("Laura", "Marketing", 10000)
        val clerk2 = Employee("Bob", "Marketing", 10000)
        val salesExecutive1 = Employee("Richard", "Sales", 10000)
        val salesExecutive2 = Employee("Rob", "Sales", 10000)

        CEO.add(headSales)
        CEO.add(headMarketing)
        headSales.add(salesExecutive1)
        headSales.add(salesExecutive2)
        headMarketing.add(clerk1)
        headMarketing.add(clerk2)

        //Checks if BOTH Clerks are NOT subordinates of Head Marketing
        Assertions.assertFalse(clerk1 in headSales.getSubordinates())
        Assertions.assertFalse(clerk2 in headSales.getSubordinates())
    }

    @Test
    fun testClerksNotDirectSubordianteOfCEO(){

        val CEO = Employee("John", "CEO", 30000)
        val headSales = Employee("Robert", "Head Sales", 20000)
        val headMarketing = Employee("Michel", "Head Marketing", 20000)
        val clerk1 = Employee("Laura", "Marketing", 10000)
        val clerk2 = Employee("Bob", "Marketing", 10000)
        val salesExecutive1 = Employee("Richard", "Sales", 10000)
        val salesExecutive2 = Employee("Rob", "Sales", 10000)

        CEO.add(headSales)
        CEO.add(headMarketing)
        headSales.add(salesExecutive1)
        headSales.add(salesExecutive2)
        headMarketing.add(clerk1)
        headMarketing.add(clerk2)

        //Checks if BOTH Clerks are NOT DIRECT subordinates of CEO
        Assertions.assertFalse(clerk1 in CEO.getSubordinates())
        Assertions.assertFalse(clerk2 in CEO.getSubordinates())
    }
}