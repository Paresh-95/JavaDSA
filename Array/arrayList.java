package Array;
import java.util.*;

public class arrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        for(int i=0;i<5;i++)
        {
            list.add(sc.nextInt());
        }
        //input
        for(int i=0;i<5;i++)
        {
            System.out.print(list.get(i)+" ");
        }


    }

}
