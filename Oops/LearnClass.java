//CODE =>\
package Oops;
public class LearnClass {

    public static void main(String[] args) {

        Student student1 = new Student() ;
        Student student2 = new Student("vanmala",123,90.2f);
        Student student3 = new Student(student2);
        Student student4 = new Student();

        //printing
        System.out.println(student3.name+" "+student3.rNo+" "+student3.marks);
        System.out.println(student1.name+" "+student1.rNo+" "+student1.marks);
        System.out.println(student2.name+" "+student2.rNo+" "+student2.marks);

    }
}



class Student {
    String name;
    int rNo;
    float marks;

    //default constrcutor
    //non parametrized constrcutor
//    Student()
//    {
//        this.name ="paresh";
//        this.rNo = 133;
//        this.marks = 7.04f;
//    }


    //parametrized constrcutor
    Student(String name,int rNo,float marks)
    {
        this.name = name;
        this.rNo = rNo;
        this.marks = marks;
    }

    //copy constructor
    Student(Student other)
    {
        this.name = other.name;
        this.rNo = other.rNo;
        this.marks = other.marks;
    }

    //calling constructor from other constructor
    Student (){
        this("yash",134,92.4f);
    }

}











/*                NOTES
CLASS ->
Class is a template or blueprint of object
Class is named Group of Properties,variables and functions
Class is a logical Construct
Class creates a datatype that you can use to create a object
Class is a logical Construct does not exist physically
eg - Car , Human

Class or reference variable are stored in stack memory


OBJECT =>
Object is instance of a Class    instance = something physical thing/stuff
Object is a physical Reality. It is a thing that occupy space in ram or memory
When you declare an object of a class you creating an instance of a class
eg - Class = Car Object = Audi,Maruti

Object are covered in heap memory

PROPERTIES OF OBJECT =>
 1. State of the Object = value from its datatype
 2. Identity of the Object = Whether one object is different from other //where the object is stored in the memory
 3. Behaviour of the Object = Effect of the datatype operations

Dot (.) Operator => also called as Seperator in technical langauge

OBJECT CREATION SYNTAX =>

        //object created
        //student1 is reference variable of the object
        //Student is the custom Datatype created by us

                 Student student1 = new student();

        //new keyword dynamically allocate memory to the object during runtime
        //Student() = constructor it is used to instainate the object or assign values to the varibale of the object

CONSTRUCTOR =>

3 types of constructor
 1.default =>  //if the constructor is not defined by java will load defualt constructor which will set all values of the varibale to default values
 2.parametrized =>
 3. copy

*/
