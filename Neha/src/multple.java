
interface A
{
    void text();
}
interface B
{
    void text();
}
class multiple implements A,B
{
    public void text()
    {
        System.out.println("Hello");
        System.out.println("How are you?");
    }
    public static void main(String[] args)
    {
        System.out.println("Name:Aman  Roll_no.:21842");
        multiple c=new multiple();
        c.text();
    }
}