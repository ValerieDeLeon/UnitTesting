import org.junit.jupiter.api.Test;
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

    // Test 2: (2D)
    @Test
    void Array2DTest2()
    {

    }

    // Test 3: (ArrayList)
    @Test
    void ArrayListTest1()
    {

    }
}
