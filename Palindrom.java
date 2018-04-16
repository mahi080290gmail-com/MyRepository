import java.util.Scanner;


public class Palindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		String temp="";
		String x=sc.nextLine();
		for(int i=0;i<x.length();i++)
		{
			temp=x.charAt(i)+temp;
			System.out.println(temp);
			
		}
		System.out.println(temp);
		if(temp.equals(x))
		{
			System.out.println(x+":is palindrom");
		}
		else
		{
			System.out.println(x+":is not palindrom");
		}

	}

}
