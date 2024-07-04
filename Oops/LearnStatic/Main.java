package Oops.LearnStatic;

public class Main {
    public static void main(String[] args) {
//        Human paresh = new Human(21,"Paresh",15000,false);
//        Human rahul = new Human(28,"Rahul",25000,true);
          fun();
          Main funn  =  new Main();
          funn.fun2();

          //System.out.println(Human.population);
    }

    static void fun(){
        Main obj = new Main();
        obj.greeting();
    }

    void fun2()
    {
        greeting();
    }

    void greeting(){
        System.out.println("Hi Paresh");
    }

}
