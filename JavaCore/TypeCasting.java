package JavaCore;

public class TypeCasting {

    public static void main(String[] args) {

        byte b = 127;
        int a = 267;
        b= (byte) a;  //converting interger into bye => explicit casting
        a=b;   // converting byte into integer => implicit casting
//        System.out.println(b);
        int c = 257;


        //type Promotion

        byte a1 = 10;
        byte b1 = 20;
        int result = a*b;   //here a and b is type promoted to save in int
        System.out.println(result);


    }
}
