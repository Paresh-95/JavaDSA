package Oops;
import java.lang.Object;

public class LearnWrapperClass {

    public static void main(String[] args) {
        //primitive datatype
        int arr = 10;

        //wrapper class/datatypes
        //converting primitive into objects
        Integer a = 45;

        //once a varibale is declared final you cannot change its value
//        final variable has to be initaized {Always initialize while declaring it }
        final int bonus = 12;

       final A paresh = new A("Paresh bhamare");

//        when a non primitive is final you can change the values/varibale of the object but cannot reassign it
        paresh.name = "Other name";

        //when a non primitive is final you cannot reassign it
//        paresh = new A("new object");

        A obj ;
        for(int i=0;i<1000000000;i++)
        {
            obj = new A("Paresh");
        }

    }

}

class A {
    final int num = 10;
        String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is Destoryed");
    }
}
