import java.util.*;
public class aman {
    int rollno,java,pov;
    void putdetail() {
        System.out.println("Enter your rollno=" + rollno);
        System.out.println("Enter your marks in java=" + java);
        System.out.println("Enter your marks in pov=" + pov);
    }

        public static void main(String args[])
    {
        System.out.println("NEHA, 21834");
        Scanner input = new Scanner(System.in);
        System.out.println("Data of star is:");
        aman star = new aman();
        star.rollno = input.nextInt();
        star.java = input.nextInt();
        star.pov = input.nextInt();

        System.out.println("Data of singh is:");

        aman singh = new aman();
        singh.rollno = input.nextInt();
        singh.java = input.nextInt();
        singh.pov = input.nextInt();

        star.putdetail();
        singh.putdetail();
    }
}
