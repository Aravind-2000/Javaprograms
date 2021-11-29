public class StringMethods
{
    public static void main(String[] args)
    {
        String empName = "Aravind";
        String empName2 = "vimal";
        System.out.println("This charAt() method will return the value at the specified index " + empName.charAt(0));
        System.out.println(empName.length()+ " is the length of the string empName");
        System.out.println(empName.toUpperCase());
        System.out.println(empName.toLowerCase());
        System.out.println(empName.equals(empName2));

    }
}
