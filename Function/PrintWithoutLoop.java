package Function;

public class PrintWithoutLoop {


    public static void PrintWithoutLoop1(int n)
    {
        if(n>10)
        {
            return;
        }
        System.out.println(n);
        PrintWithoutLoop1(n+1);
    }

    public static void main(String[] args) {


     PrintWithoutLoop1(1);
    }
}
