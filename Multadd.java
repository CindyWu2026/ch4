public class Multadd
{
    public static void main(String[]args)
    {
        double a=1.0,b=2.0,c=3.0;
        System.out.println(multadd(a,b,c));
        System.out.println(multadd(0.5,Math.cos(Math.PI/4.0),Math.cos(Math.PI*0.5-Math.PI/4.0)));
        System.out.println(expSum(1.2));
        
    }
    public static double multadd(double a, double b, double c)
    {
        return a*b+c;
    }
    public static double expSum(double x)
    {
        double num=Math.exp(-1*x);
        return multadd(x,num,Math.sqrt(1-num));
    }
}