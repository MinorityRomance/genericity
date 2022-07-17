import java.util.Scanner;

public class test {
    public static void main(String[] args){
        try{
            System.out.println("计算结果："+in());
        }catch (NumberFormatException e){
            System.out.println(e);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
    public static  double in () throws  NumberFormatException,ArithmeticException{
        System.out.println("计算开始");
        double c = 0;
        try{
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        c = a/b;}
        catch (NumberFormatException e){
            throw e;
        }catch (ArithmeticException e){
            throw e;
        }finally {
            System.out.println("计算结束");
            return c;
        }
    }
}
