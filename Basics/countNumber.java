package Basics;

public class countNumber {

    public static void main(String[] args) {

        int num = 1331;
        int temp =num;
        int count = 0;
        while(num!=0)
        {
            int rem =num%10;
            num=num/10;
            if(rem>0 && temp%rem==0)
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
