import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestingLoopsTest
{
    // Test 1: (While) Your making a word search and some words need to be a bit scrambled.
    // Take some words and return them backwards.
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

    @Test
    void WhileLoopTest4()
    {
        UnitTestingLoops four = new UnitTestingLoops("WOWIE");
        assertEquals("EIWOW", four.backwardString());
    }

    // Test 2: (For) Your grandma is giving out cookies. Print out "Cookie" for each
    // cookie your grandma gives. <3
    @Test
    void ForLoopTest1()
    {
        UnitTestingLoops one = new UnitTestingLoops(5);
        assertEquals("CookieCookieCookieCookieCookie", one.cookies());
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
        assertEquals("CookieCookieCookieCookieCookieCookieCookieCookieCookieCookieCookieCookieCookieCookieCookie", three.cookies());
    }

    @Test
    void ForLoopTest4()
    {
        UnitTestingLoops four = new UnitTestingLoops(-84385);
        assertEquals("false", four.cookies());
    }
}
