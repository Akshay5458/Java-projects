package stringprgms;

public class Stringprgmss {

	public static void main(String[] args) {

		String s="  hey antony";
		String s1="das&co";
		String s2="DAS&CO";
		
		//concat
		
		System.out.println(s.concat(s1));
		System.out.println(s+s1);
		System.out.println(1+2+s+5+6);
		System.out.println();
		
		//equals
		
		System.out.println(s.equals(s1));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s.equals(s2));
		
		//toUpper and toLower
		
		System.out.println(s.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		//length
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		//startswith and endswith
		
		System.out.println(s.startsWith("h"));
		System.out.println(s1.startsWith("antony"));
		
		//trim
		
		System.out.println(s.trim());
		
		//replace
		
		String s3="Harold antony";
		System.out.println(s3.replace("antony","das"));
		
		//substring
		
		System.out.println(s3.substring(4));
		System.out.println(s3.substring(0, 4));
		
		//split
		
		String s4="hello luminar technolab";
		String[] sc=s4.split(" ");
		for(String e:sc)
		{
			System.out.println(e);
		}
		
		//tocharArray
		
		String s5="hello";
		char[] c=s5.toCharArray();
		for(char ele:c)
		{
			System.out.println(ele);
		}
		
		
	}
	

}
