import java.util.*;
  class bca {
      public void java()
      {
          System.out.println("you can learn java in bca");
      }

      public void cn()
      {
          System.out.println("you can learn cn in bca");
      }

      public void linux()
      {
          System.out.println("you can learn linux in bca");
      }
  }

    class mca extends bca {
        public void c()
        {
            System.out.println("you can learn c in mca");
        }

        public void ds()
        {

            System.out.println("you can learn ds in mca");
        }

        public void linux()
        {
            System.out.println("you can learn linux in mca");
        }
    }

          class bca2
          {
             public static void main(String args[]) {
                 System.out.println("aman, 21842");
                 bca neha = new bca();
                 neha.java();
                 neha.linux();
                 mca aman = new mca();
                 aman.c();
                 aman.ds();
                 aman.linux();
                 aman.java();
             }
         }




