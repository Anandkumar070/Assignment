package phase1.mp;
import java.util.*;
public class ArithmeticCalculator {
	public int Addition(int a,int b){
		int A=(a+b);
		return A;
	}
	public int Subraction(int c,int d){
		int A=(c-d);
		return A;
	}
	public int Multiplication(int e,int f){
		int A=(e*f);
		return A;
	}
	public int Division(int x,int y){
		int A=(x/y);
		return A;
	}
	public static void main(String args[])
	{
		ArithmeticCalculator ob = new ArithmeticCalculator();
		int no1;
		int no2;
		
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of no1 : ");
		no1=sc.nextInt();
		System.out.print("Enter the value of no2 : ");
		no2=sc.nextInt();
		System.out.print("Enter the Character to be performed between two value : ");
		char operator=sc.next().charAt(0);
		if(operator=='+'){
			result=ob.Addition(no1,no2);
			System.out.print("The Addition of two values are : "+ result);
		}
		else if(operator=='-'){
			result = ob.Subraction(no1,no2);
			System.out.print("The Subraction of two values are : "+ result);
		}
		else if(operator=='/'){
			
			result=ob.Division(no1,no2);
			System.out.print("The Division of two values are : "+ result);
			
			
		}
		else{
			result = ob.Multiplication(no1,no2);
			System.out.print("The Multiplication of two values are : "+ result);
			
		}
		
		
		
	}

}
