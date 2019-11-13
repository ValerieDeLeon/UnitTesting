public class UnitTestingLoops
{
    int num;
    String str;

    public UnitTestingLoops(String str)
    {
        this.str = str;
    }
    public UnitTestingLoops(int num)
    {
        this.num = num;
    }

    // Test 1: (While) Print String backwards
    public String backwardString()
    {
        int count = str.length();
        String result = "";
        while (count > 0)
        {
            result += str.charAt(count-1);
            count--;
        }

        return result;
    }

    // Test 2: (For) Giving people cookies
    public String cookies()
    {
        String result = "";
        if (num < 0)
        {
            return "false";
        }
        for (int i = 0; i < num; i++)
        {
            result += "Cookie ";
        }
        return result;
    }
}
