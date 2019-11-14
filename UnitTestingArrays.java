import java.util.ArrayList;
import java.util.List;

public class UnitTestingArrays
{
    int[] arr1;
    int[] arr2;
    String[][] twoArr;
    String target;
    List<String> arrList;

    public UnitTestingArrays(int[] arr1, int[]arr2)
    {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public UnitTestingArrays(String[][] twoArr, String target)
    {
        this.twoArr = twoArr;
        this.target = target;
    }

    public UnitTestingArrays(List<String> arrList, String target)
    {
        this.arrList = arrList;
        this.target = target;
    }

    // Test 1: (1D) Combining Two Arrays
    public String combineArr()
    {
        int[] result = new int[arr1.length + arr2.length];
        String done = "";

        result[0] = arr1[0];
        result[1] = arr1[1];
        result[2] = arr2[0];
        result[3] = arr2[1];

        for (int j = 0; j < result.length; j++)
        {
            done += result[j] + " ";
        }

        return done;
    }

    // Test 2: (2D) Locate the target word and print it out
    public String locateWord()
    {
        for (int row = 0; row < twoArr.length; row++)
        {
            for (int col = 0; col < twoArr[0].length; col++)
            {
                if (twoArr[row][col].equals(target))
                {
                   return "[" + row + ", " + col + "]";
                }
            }
        }

        return "false";
    }

    public String removeAndPrint()
    {
        return "";
    }
}
