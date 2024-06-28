import java.util.*;
public class switchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String = ");
//        String option = sc.next();
          int day = sc.nextInt();
//        switch (option) {
//            case "mango" -> System.out.println("Mango is king of fruits");
//            case "apple" -> System.out.println("Apple is Sweet Red Fruit");
//            case "graphes" -> System.out.println("Graphes are small juicy fruits");
//            case "banana" -> System.out.println("Banana is Yellow Long Fruit");
//        }

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tueday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thurday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

    }

}
