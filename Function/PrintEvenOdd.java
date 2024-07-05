package Function;

public class PrintEvenOdd {
    public static void main(String[] args) {

        System.out.println("Even Number");
        for(int i=1;i<10;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }

        System.out.println("Odd Number");
        for(int i=1;i<10;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }


    }
}
