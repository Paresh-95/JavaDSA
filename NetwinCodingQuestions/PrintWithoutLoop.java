package NetwinCodingQuestions;

public class PrintWithoutLoop {

    public static void main(String[] args) {
        printwithoutloop(1);

    }


    public static void printwithoutloop(int n){
        if(n>10)
        {
            return;
        }
        System.out.println(n);
        printwithoutloop(n+1);
    }
}
