public class UnitTestingIfs
{
    String word;
    int num;

    // Test 1
    public UnitTestingIfs(String word)
    {
        this.word = word;
    }
    // Test 2
    public UnitTestingIfs(int num)
    {
        this.num = num;
    }

    public boolean neededSupply(int num)
    {
        if (num >= 15 && num <= 50)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean ifMod()
    {
        if (num % 2 == 0)
            return true;

        return false;
    }

    // Test 1
    public String getNum()
    {
        return word;
    }
}
