package org.example;





import java.util.Scanner;

public class Shapes {
    float shape;
    double radius;
    float length;
    float breadth;
    float base;
    float height;
    float width;
    float side1;
    float side2;
    float peri;
    float area;
    double Cir_Peri;
    double Cir_Area;
    Scanner s=new Scanner(System.in);

    Shapes()
    {
        System.out.println("select the shape by Entering the number: \n 1.circle \n 2.triangle \n 3.rectangle" );
        float a =s.nextFloat();
        shape=a;
        if (shape==1)
        {
            System.out.println("enter the radius:");
            double r=s.nextInt();
            radius=r;
            System.out.println("shape Circle Has Been created");
        }
        if (shape==2)
        {
            System.out.println("enter the base:");
            float b=s.nextFloat();
            base=b;
            System.out.println("enter the side1:");
            float c=s.nextFloat();
            side1=c;
            System.out.println("enter the side1:");
            float d=s.nextFloat();
            side2=d;
            System.out.println("enter the height:");
            float h=s.nextFloat();
            height=h;
            System.out.println("shape Triangle Has Been created");

        }
        if (shape==3)
        {
            System.out.println("enter the length:");
            int f=s.nextInt();
            length=f;
            System.out.println("enter the width:");
            int g=s.nextInt();
            width=g;
            System.out.println("shape Rectangle Has Been created");
        }
    }
    void perimeter()
    {
        if (shape==1)
        {

            Cir_Peri =2*3.14*radius;
            System.out.println("the perimeter of circle is:" + Cir_Peri);
        }
        if (shape==2)
        {

            peri =base+side1+side2;
            System.out.println("the perimeter of triangle is:" + peri);
        }
        if (shape==3)
        {

            peri =2 * (length+width);
            System.out.println("the perimeter of rectangle is:" + peri);
        }
    }
    void areas()
    {
        if (shape==1)
        {
            Cir_Area =3.14*radius*radius;
            System.out.println("The area of circle is :" + Cir_Area);
        }
        if (shape==2)
        {
            area =(base*height)/2;
            System.out.println("The area of Triangle is : " + area);

        }
        if (shape==3)
        {
            area =length*breadth;
            System.out.println("The area of Rectangler is : " + area);

        }
    }

    public static void main(String[] args) {
        Shapes a1=new Shapes();
        a1.perimeter();
        a1.areas();
    }

}