import java.lang.*;
public class addeven {
   public static void main(String args[])
    {
        System.out.println("aman , 21842");
        StringBuffer sh1 = new StringBuffer("object programming");
        System.out.println(sh1);
        sh1.append(" language");
        String str2= new String(sh1.toString());
        int loc= str2.indexOf(" programming");
        sh1.insert(loc," oriented");
        sh1.setCharAt(loc,'-');
        System.out.println(sh1);
    }

}
