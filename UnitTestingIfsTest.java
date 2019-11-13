import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UnitTestingIfsTest
{

    // Test 1: Getting a String
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

    // Test 2: If number is even
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

    // Test 3: Making sure a number is within a certain range for company supply (15 - 50)
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
