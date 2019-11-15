import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class UnitTestingArrays
{
    int[] arr1;
    int[] arr2;
    String[][] twoArr;
    String target;
    String data1;
    String data2;
    String data3;
    ArrayList<String> arrList;


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

    public UnitTestingArrays(String data1, String data2, String data3)
    {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
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

    public String createAndDisplay()
    {
        String result = "";
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add(data1);
        arrList.add(data2);
        arrList.add(data3);

        ListIterator iterator = arrList.listIterator();
        while (iterator.hasNext())
        {
            result += iterator.next() + " ";
        }

        return result;
    }
}
