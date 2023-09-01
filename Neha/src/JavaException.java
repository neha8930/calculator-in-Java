class JavaException{
    public static void main(String args[]){
        System.out.println("Name:diksha    Roll no.:21852");
        try{
            //code that may raise exception
            int data=100/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception occurs..........");
            System.out.println(e);
            //rest code of the program

        }

        catch(NullPointerException e){
            System.out.println("Exception occurs..........");
            System.out.println(e);
        }

        catch(NumberFormatException e){
            System.out.println("Exception occurs..........");
            System.out.println(e);}

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occurs..........");
            System.out.println(e);}
        catch(Exception e){
            System.out.println("Exception occurs..........");
        }
        finally{
            System.out.println("-------End of program-------");}

    }
}