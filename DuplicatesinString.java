import java.util.HashSet;


public class DuplicatesinString {
static String s1="malayalam";
	public static void main(String[] args) {
String s="indonesiain";
		
		char[] ch=s.toCharArray();
		
		HashSet<Character>hash=new HashSet<Character>();
		
		for(Character c: ch){
			if(hash.add(c)==false)
				System.out.println("Duplicates are:"+" "+c);
		}

	}


	}


