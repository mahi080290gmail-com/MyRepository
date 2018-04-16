
public class ComomnNumbers {
	int[] a1={2,4,6,8,5,7};
	int[] a2={3,44,6,88,7};
public  void Comomn()
{
	for(int i=0;i<a1.length;i++)
	{
		for(int j=0;j<a2.length;j++)
		{
			if(a1[i]==a2[j])
			{
				System.out.println("comomn number is:"+a1[i]);
			}
		}
	}
}
	public static void main(String[] args) {
		
ComomnNumbers c=new ComomnNumbers();
c.Comomn();
	}

}
