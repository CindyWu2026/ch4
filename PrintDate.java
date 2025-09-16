public class PrintDate
{
    public static void printAmerican(String day, String Month, int date, int year)
    {
        System.out.println("American format: "+day+", "+Month+" "+date+", "+year);
    }
    public static void printEuropean(String day, String Month, int date, int year)
    {
        System.out.println("European format: "+day+" "+date+" "+Month+" "+year);
    }
    public static void main(String[] args)
    {
        printAmerican("Tuesday","September",16,2025);
        printEuropean("Tuesday","September",16,2025);
    }
}