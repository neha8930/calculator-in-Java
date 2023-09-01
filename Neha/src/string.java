import java.lang.*;
public class string {
    static String name[] = {"madras","calcutta","bombay","goa"};
    public static void main(String args[])
    {
        int size= name.length;
        int i,j,s;
        System.out.println("aman , 21842");

        String temp=null;
        for (i=0;i<=size;i++) {
            for (j = i + 1; j < size; j++) {
                if (name[j].compareTo(name[i])<0) {
                    temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
            for (i=0;i<size;i++)
            {
                System.out.println(name[i]);
            }
        }
    }

