import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestingArraysTest
{
    // Test 1: (1D) Charlie is doing some number crunching for hotel funds. There are a few receipts but she needs to
    // combine the prices. Combine the two arrays to create one list.
    @Test
    void Array1DTest1()
    {
        int[] arr1 = {3, 4};
        int[] arr2 = {5, 6};
        UnitTestingArrays one = new UnitTestingArrays(arr1, arr2);
        assertEquals("3 4 5 6 ", one.combineArr());
    }

    @Test
    void Array1DTest2()
    {
        int[] arr1 = {-3, 4};
        int[] arr2 = {5, -6};
        UnitTestingArrays two = new UnitTestingArrays(arr1, arr2);
        assertEquals("-3 4 5 -6 ", two.combineArr());
    }

    @Test
    void Array1DTest3()
    {
        int[] arr1 = {-6, 5};
        int[] arr2 = {4, -3};
        UnitTestingArrays three = new UnitTestingArrays(arr1, arr2);
        assertEquals("-6 5 4 -3 ", three.combineArr());
    }

    @Test
    void Array1DTest4()
    {
        int[] arr1 = {6, 5};
        int[] arr2 = {4, 3};
        UnitTestingArrays four = new UnitTestingArrays(arr1, arr2);
        assertEquals("6 5 4 3 ", four.combineArr());
    }

    // Test 2: (2D) Using a list, you need to remove one to clean up your messy list. Find the value you need
    // to remove and give its location.
    @Test
    void Array2DTest1()
    {
        String[][] twoArr = {{"One", "Two", "Three"},
                            {"Four", "Five", "Six"}};
        UnitTestingArrays one = new UnitTestingArrays(twoArr, "Four");
        assertEquals("[1, 0]", one.locateWord());
    }

    @Test
    void Array2DTest2()
    {
        String[][] twoArr = {{"1", "2", "3"},
                            {"4", "5", "6"}};
        UnitTestingArrays two = new UnitTestingArrays(twoArr, "2");
        assertEquals("[0, 1]", two.locateWord());
    }

    @Test
    void Array2DTest3()
    {
        String[][] twoArr = {{"1", "Two", "3"},
                            {"Four", "5", "Six"}};
        UnitTestingArrays three = new UnitTestingArrays(twoArr, "Six");
        assertEquals("[1, 2]", three.locateWord());
    }

    @Test
    void Array2DTest4()
    {
        String[][] twoArr = {{"true", "false", "true"},
                           {"false", "true", "false"}};
        UnitTestingArrays four = new UnitTestingArrays(twoArr, "true");
        assertEquals("[0, 0]", four.locateWord());
    }

    // Test 3: (ArrayList) Your grocery list is in your head, but you need to write it down.
    // Use an ArrayList to make the list real!
    @Test
    void ArrayListTest1()
    {
        UnitTestingArrays one = new UnitTestingArrays("Grain Sponge", "Moo Juice", "Cloud Tears");
        assertEquals("Grain Sponge Moo Juice Cloud Tears ", one.createAndDisplay());
    }

    @Test
    void ArrayListTest2()
    {
        UnitTestingArrays two = new UnitTestingArrays("1", "2", "3");
        assertEquals("1 2 3 ", two.createAndDisplay());
    }

    @Test
    void ArrayListTest3()
    {
        UnitTestingArrays three = new UnitTestingArrays("-1", "-2", "-3");
        assertEquals("-1 -2 -3 ", three.createAndDisplay());
    }

    @Test
    void ArrayListTest4()
    {
        UnitTestingArrays four = new UnitTestingArrays("One", "Two", "Three");
        assertEquals("One Two Three ", four.createAndDisplay());
    }
}
