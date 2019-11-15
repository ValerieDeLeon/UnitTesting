import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UnitTestingIfsTest
{

    // Test 1: You need to print out some interesting words, pick some and display them!
    @Test
    void simpleOutputTest1()
    {
        UnitTestingIfs one = new UnitTestingIfs("Code");
        assertEquals("Code", one.getNum());
    }

    @Test
    void simpleOutputTest2()
    {
        UnitTestingIfs two = new UnitTestingIfs("");
        assertEquals("", two.getNum());
    }

    @Test
    void simpleOutputTest3()
    {
        UnitTestingIfs three = new UnitTestingIfs("pneumonoultramicroscopicsilicovolcanoconiosis");
        assertEquals("pneumonoultramicroscopicsilicovolcanoconiosis", three.getNum());
    }

    @Test
    void simpleOutputTest4()
    {
        UnitTestingIfs four = new UnitTestingIfs("Elephant");
        assertEquals("Elephant", four.getNum());
    }

    // Test 2: For your math assignment, you need list some even numbers, check to see if their even!
    @Test
    void modNumTest1()
    {
        UnitTestingIfs one = new UnitTestingIfs(4);
        assertEquals(true, one.ifMod());
    }

    @Test
    void modNumTest2()
    {
        UnitTestingIfs two = new UnitTestingIfs(942);
        assertEquals(true, two.ifMod());
    }

    @Test
    void modNumTest3()
    {
        UnitTestingIfs three = new UnitTestingIfs(-6);
        assertEquals(true, three.ifMod());
    }

    @Test
    void modNumTest4()
    {
        UnitTestingIfs four = new UnitTestingIfs(3);
        assertEquals(false, four.ifMod());
    }

    @Test
    void modNumTest5()
    {
        UnitTestingIfs five = new UnitTestingIfs(939);
        assertEquals(false, five.ifMod());
    }

    // Test 3: A company is shipped material, but their can only have 15 to 50 items at a time.
    // Make sure their is an appropriate amount of material.
    @Test
    void SupplyTest1()
    {
        UnitTestingIfs one = new UnitTestingIfs(1);
        assertEquals(false, one.neededSupply(1));
    }

    @Test
    void SupplyTest2()
    {
        UnitTestingIfs two = new UnitTestingIfs(-1);
        assertEquals(false, two.neededSupply(-1));
    }

    @Test
    void SupplyTest3()
    {
        UnitTestingIfs three = new UnitTestingIfs(15);
        assertEquals(true, three.neededSupply(15));
    }

    @Test
    void SupplyTest4()
    {
        UnitTestingIfs four = new UnitTestingIfs(20);
        assertEquals(true, four.neededSupply(20));
    }

    @Test
    void SupplyTest5()
    {
        UnitTestingIfs five = new UnitTestingIfs(50);
        assertEquals(true, five.neededSupply(50));
    }

    @Test
    void SupplyTest6()
    {
        UnitTestingIfs six = new UnitTestingIfs(100);
        assertEquals(false, six.neededSupply(100));
    }
}
