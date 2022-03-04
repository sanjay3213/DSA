import java.util.*;

public class Exception {
    public static void main(String[] args) {
        int firstNumber, secondNumber, result;

        Scanner myobj = new Scanner(System.in);
        System.out.println("Entehr the numbers");
        try{

            firstNumber=myobj.nextInt();
            secondNumber=myobj.nextInt();
            myobj.close();
            result=firstNumber/secondNumber;   
            System.out.println("REsult is "+result);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid Input "+e);
        }
        catch(ArithmeticException e){
            System.out.println("Cant divide by zero"+ e);
        }
        finally{
            System.out.println("Something went Wrong");
        }
        System.out.println("Thank You ");


    }
}
