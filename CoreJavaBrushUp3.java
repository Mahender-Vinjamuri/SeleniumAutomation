package coreJava;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		
		//Print the Strings with NO spaces
		String str = "Mahender Madhuri Aaradhya";
		String[] Splitstr = str.split(" ");
		System.out.println(Splitstr[0].trim());
		System.out.println(Splitstr[2].trim());
		System.out.println("************************");
		for(int i=0; i<Splitstr.length;i++)
		{
			System.out.println(Splitstr[i]);
		}
		
		//Print the String in reverse order
		for(int i=str.length()-1; i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
		
		for(int i= Splitstr.length-1;i>=0;i--)
		{
			System.out.println(Splitstr[i]);
		}
	}

}
