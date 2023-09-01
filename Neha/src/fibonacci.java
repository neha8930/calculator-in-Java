public class fibonacci {
    public static void main(String[] args) {
        int a=0,c,b=1,n=10,i;
        System.out.println("NEHA , 21834");
        System.out.println(a);
        System.out.println(b);
        for(i=1;i<=n-2;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
