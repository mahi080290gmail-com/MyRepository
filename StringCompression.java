import javax.xml.transform.Templates;


public class StringCompression {
	String s1="aaabccddd";
	char temp=s1.charAt(0);
	int count=0;
	public void Compression()
	{
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==temp)
			{
			count++;	
			}
			else
			{
				System.out.print(temp+""+count);
				count=1;
				temp=s1.charAt(i);
			}
		}
	
	}

	public static void main(String[] args) {
StringCompression s=new StringCompression();
s.Compression();

	}

}
