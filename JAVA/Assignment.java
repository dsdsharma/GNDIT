import java.lang.Math;
import java.util.*;
public class Assignment{
	public static void main(String args[]){
		Q6();
		
	}
	protected void Q2(){
		System.out.print("Welcome to Java Programming");
	}
	protected static void Q3(){
		Calculator obj1= new Calculator();
		obj1.calc(2,2);
	}
	protected static void Q4(int num){
		System.out.print("Square root of "+num+" is "+Math.sqrt(num));
	}
	protected static void Q5(int length, int breadth){
		System.out.print("Area of room is "+(length*breadth));
	}
	protected static void Q6(){
		Scanner scanner = new Scanner(System.in);
		int num1=scanner.nextInt();
		float num2=scanner.nextFloat();
	}
	
	
	
}
final class Calculator{
			protected void calc(int x, int y){
				System.out.println("Addition of "+ x + " " + y + " is "+(x+y));
				System.out.println("Subtrations of "+x+" "+y+" is "+(x-y));
				System.out.println("Divison of "+x+" "+y+" is "+(x/y));
				System.out.println("Modulus of "+x+" "+y+" is "+(x%y));
				
			}
			
}