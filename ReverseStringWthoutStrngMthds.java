import java.util.Scanner;


public class ReverseStringWthoutStrngMthds {
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your number");
	String rev=sc.nextLine();
	StringBuilder sb=new StringBuilder(rev);
	System.out.println(sb.reverse());

}
}

