import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestingLoopsTest
{
    // Test 1: (While) Printing a word backwards
    @Test
    void WhileLoopTest1()
    {
        UnitTestingLoops one = new UnitTestingLoops("tree");
        assertEquals("eert", one.backwardString());
    }

    @Test
    void WhileLoopTest2()
    {
        UnitTestingLoops two = new UnitTestingLoops("vibranium");
        assertEquals("muinarbiv", two.backwardString());
    }

    @Test
    void WhileLoopTest3()
    {
        UnitTestingLoops three = new UnitTestingLoops("cRaZy");
        assertEquals("yZaRc", three.backwardString());
    }

    // Test 2: (For) Cookie Giving
    @Test
    void ForLoopTest1()
    {
        UnitTestingLoops one = new UnitTestingLoops(5);
        assertEquals("Cookie Cookie Cookie Cookie Cookie ", one.cookies());
    }

    @Test
    void ForLoopTest2()
    {
        UnitTestingLoops two = new UnitTestingLoops(-3);
        assertEquals("false", two.cookies());
    }

    @Test
    void ForLoopTest3()
    {
        UnitTestingLoops three = new UnitTestingLoops(15);
        assertEquals("Cookie Cookie Cookie Cookie Cookie Cookie Cookie Cookie Cookie Cookie Cookie Cookie Cookie Cookie Cookie ", three.cookies());
    }
}
