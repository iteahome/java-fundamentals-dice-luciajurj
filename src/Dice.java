
public class Dice {
    static int findGirls(int[] myIntArray, int s)
    {
        int cnt = 0;
        for (int i = 0; i < myIntArray.length; i++)
        {
            if (myIntArray[i] != s)
            {
                cnt++;
            }
           // if (myIntArray[i]  == s) {
           //     System.out.println(+(-1));
            //}
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] myIntArray = {1, 2, 3, 6, 6, 5};
        int s = 6;
        if ((myIntArray.length-1) == s) {
            System.out.println(+ (-1));
        }
        else
            {
            System.out.println("Number of girls is: " + findGirls(myIntArray, s));
        }
    }
}
