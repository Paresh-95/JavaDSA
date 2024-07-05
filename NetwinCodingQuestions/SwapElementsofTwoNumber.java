package NetwinCodingQuestions;

public class SwapElementsofTwoNumber {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println("Before Swapping");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("*************************");
        Swap(a,b);
    }

    public static void Swap(int a , int b){
        int temp = b;
        b = a;
        a = temp;
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    }
}
