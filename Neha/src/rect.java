import java.util.*;
public class rect {
    int length, breadth;
    rect(int a,int b)
    {
        length=a;
        breadth=b;
    }
    rect()
    {
        length=3;
        breadth=3;
    }
    public void get_detail(int x,int  y)
    {
        length=x;
        breadth=y;
    }
    public int area()
    {
        return length*breadth;
    }
}
   class rectangle {
    public static void main (String args[])
    {

        int area1,area2,area3,area4;
        rect obj1=new rect();
        rect obj2=new rect();
        rect obj3=new rect();
        rect obj4=new rect();
        obj1.get_detail(3,4);
        obj2.get_detail(5,6);


        area1=obj1.area();
        area2=obj2.area();
        area3=obj3.area();
        area4=obj4.area();
        System.out.println("Aman , 21842");
        System.out.println("area of obj1:="+area1);
        System.out.println("area of obj2:="+area2);
        System.out.println("area of obj3:="+area3);
        System.out.println("area of obj4:="+area4);
    }
}

