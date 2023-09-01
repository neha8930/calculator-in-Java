public class overload {
    int length,breadth,height;
    public void area(int a,int b) {
        int area1;
        length = a;
        breadth = b;
        area1 = length * breadth;
        System.out.println("area required is" +area1);
    }
    public void area(int a,int b,int c)
    {
        int area2;
        length=a;
        breadth=b;
        height=c;
        area2 = length*breadth*height;
        System.out.println("area required is"+area2);
    }
}
 class over{
    public static void main(String args[])
    {
        System.out.println("aman , 21842");
        int area1 , area2;
        overload obj1= new overload();
        overload obj2= new overload();
        obj1.area(5,6);
        obj1.area(2,3,4);
    }
}
