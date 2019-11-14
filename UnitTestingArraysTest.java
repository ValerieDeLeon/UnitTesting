import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestingArraysTest
{
    // Test 1: (1D) Combining Two Arrays
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

    // Test 2: (2D) Locate the target word and print out location
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

    // Test 3: (ArrayList) Remove specified word and print list
    @Test
    void ArrayListTest1()
    {
        //ArrayList<String> arrList = new ArrayList<String>();
        //UnitTestingArrays one = new UnitTestingArrays(arrList, "Milk");
        //assertEquals("", one.removeAndPrint());
    }
}
