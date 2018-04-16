
public class PyramidPattren1 {
	public void Print(int n)
	{
		int k=2*n-2;
		for(int i=0;i<n;i++)//outer loop iteration
		{
			for(int j=0;j<k;j++)//inner loop iteration
			{
				System.out.print(" ");//print spaces until inner loop fails
			}
			k=k-2;//decriment the k value with 2spaces
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");//print star
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PyramidPattren1 p=new PyramidPattren1();
		p.Print(5);

	}

}
