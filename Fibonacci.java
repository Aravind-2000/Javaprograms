public class Fibonacci
{
    public static void main(String[] args)
    {
        int count = 10, num1=0, num2=1, num3;
        System.out.println("The Fibonacci Series for the count of 10 numbers are ");
        System.out.println(num1+ "\n" + num2);
        for(int i=2; i<count; i++){
            num3 = num2+num1;
            System.out.println(num3+ "");
            num1 = num2;
            num2 = num3;
        }
    }
}
