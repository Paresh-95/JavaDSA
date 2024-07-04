package Oops.LearnInheritance;

public class Box {

    double l;
    double h;
    double w;

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    //cube
    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    //
    Box(double l , double w,double h)
    {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    //copy
    Box(Box old)
    {
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }

    public void information()
    {
        System.out.println("Running the box"    );
    }


}

