/*
String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).

*/
public class CompressedString{
	public static void main(String[] args){
		String s1 = "abcdefghijklmnop";
		String s2 = "aabcccccaaa";
		String s3 = "ddeeff";
		String s4 = "aaaaaaaaaaaaaaaaaa";
		String s5 = "addfffgggg";
		String s6 = "a";
		Test t1 = new Test();
		System.out.println(t1.compString(s1));
		System.out.println(t1.compString(s2));
		System.out.println(t1.compString(s3));
		System.out.println(t1.compString(s4));
		System.out.println(t1.compString(s5));
		System.out.println(t1.compString(s6));
	}
}

class Test{

	public String compString(String s){
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for(int i = 0 ; i < s.length() ; i++){
			char c = s.charAt(i);
			if(i+1 >= s.length() || (c != s.charAt(i+1))){
				sb.append(c).append(count);
				count = 1;
			}
			else{
				
				count++;
			}			
		}
		 return (sb.length() > s.length()) ? s : sb.toString();
	}
}

	

