public class UnitTestingArrays
{
    int[] arr1;
    int[] arr2;

    public UnitTestingArrays(int[] arr1, int[]arr2)
    {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

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
}
