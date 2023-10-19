import java.util.Scanner;

public class PemdasCalculator {
public static void main(String[] args) {

Scanner s = new Scanner(System.in);

double step1Result;
System.out.print("Enter a first number for Step 1:   ");
double num1 = s.nextDouble();
System.out.print("Enter a second number for Step 1:   ");
double num2 = s.nextDouble();
System.out.print("Enter a third number for step 1:   ");
double num3 = s.nextDouble(); 
step1Result = (num1 + num2) * num3;
System.out.println("( " + num1 + " + " + num2 + " )" + " * " + num3  + " = " + step1Result);

double step2Result;
System.out.print("Enter a number for Step 2:  ");
double num4 = s.nextDouble();
System.out.print("Enter a number to be raised:   ");
double num5 = s.nextDouble();
step2Result = Math.pow(num4,num5);
System.out.println(num4 + " ^ " + num5 + " = " + step2Result);

double step3Result;
System.out.print("Enter the result of Step 2:   ");
double step2Result2 = s.nextDouble();
System.out.print("Enter another number for step for Step 3:   ");
double num6 = s.nextDouble();
 step3Result = step2Result2 / num6;
System.out.println(step2Result2 + " / " + num5 + " = " + step3Result);

double finalResult;
System.out.print("Enter the result of Step 1:   ");
double step1Result2 = s.nextDouble();
System.out.print("Enter the result of step 3:  ");
double step3Result2 = s.nextDouble();
finalResult = step1Result2 - step3Result2;

System.out.println(step1Result2 + " - " + step3Result2 + " = " + finalResult);
   }
}