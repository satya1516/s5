package epam3;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int result=0;
		System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");
		int ch=sc.nextInt();
		while(ch!=0)
		{
			System.out.println("enter number1");
			int n1=sc.nextInt();
			System.out.println("enter number2");
			int n2=sc.nextInt();

		if(ch==1)
		{
			Add add=new Add();
			result=add.cal(n1,n2,result);
			System.out.println("n1+"+"n2="+result);
		}
		else if(ch==2)
		{
			Subtract sub=new Subtract();
			result=sub.cal(n1,n2,result);
			System.out.println("n1-"+"n2="+result);	
		}
		else if(ch==3)
		{
			Multiply mul=new Multiply();
			result=mul.cal(n1,n2,result);
			System.out.println("n1*"+"n2="+result);	
		}
		else if(ch==4)
		{
			Divide div=new Divide();
			result=div.cal(n1,n2,result);
			System.out.println("n1/"+"n2="+result);	

		}
		System.out.println("enter choice(or) to exit enter 0 :");
		ch=sc.nextInt();
			}
	}
}