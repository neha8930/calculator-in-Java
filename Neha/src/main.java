import java.util.*;
 class Main
{
    public static void main(String arg[])
    {
        String acc_no;
        boolean found;
        Scanner input=new Scanner(System.in);

        System.out.println("aman , 21842");
        System.out.print("How many number of customers do you want to input? ");
        int n = input.nextInt();
        bankapp C[] = new bankapp[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new bankapp();
        }



        int choice;
        do
        {
            System.out.println("\n *Banking System Application*");
            System.out.println("1. Display account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter account no. you want to search: ");
                    acc_no=input.next();
                    found=false;
                    for (int i = 0; i < C.length; i++) {
                        found=C[i].search(acc_no);
                        if(found)
                        {
                            C[i].getdetail();
                        }
                    }




                case 2:
                    System.out.print("Enter account no. you want to search: ");
                    acc_no=input.next();
                    found=false;
                    for (int i = 0; i < C.length; i++) {
                        found=C[i].search(acc_no);
                        if(found)
                        {
                            C[i].deposit();
                        }
                    }
                case 3:
                    System.out.print("Enter account no. you want to search: ");
                    acc_no=input.next();
                    found=false;
                    for (int i = 0; i < C.length; i++) {
                        found=C[i].search(acc_no);
                        if(found)
                        {
                            C[i].Withdraw();
                        }
                    }
            }
        }

        while(choice!=5);

    }

}


class bankapp
{
    String accno;
    int amount;
    String name;
    int amnt;
    Scanner input=new Scanner(System.in);
    bankapp()
    {
        System.out.println("enter your name");
        name=input.next();
        System.out.println("your account no is");
        accno=input.next();

        System.out.println("your initial amount is"+amount);

    }
    public void getdetail()
    {
        System.out.println("your name is:"+name);
        System.out.println("your accno is:"+accno);
        System.out.println("your amount is:"+amount);
    }
    public void deposit()
    { int amnt;
        System.out.println("enter amount: ");
        amnt=input.nextInt();
        amount=amount+amnt;
        System.out.println("new balance is "+amount);
    }
    public void Withdraw(){
        System.out.println("enter amount to widthraw");
        amnt=input.nextInt();
        if(amnt<amount){
            amount-=amnt;
            System.out.println("now your balance is"+amount);

        }
        else
            System.out.println("insufficient balance");

    }

    public boolean search(String ac_no) {
        if (accno.equals(ac_no)) {
            return (true);
        }
        return (false);
    }
}
