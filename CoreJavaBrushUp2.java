package coreJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		
   ArrayList<String> names = new ArrayList<String>();
   names.add("Mahender");
   names.add("Madhuri");
   names.add("Aaradhya");
   System.out.println("Name which is in 2nd index is "+names.get(2));
   
   for(int i=0; i<names.size();i++)
   {
	   System.out.println(names.get(i));
	   if(names.get(i).contains("Madhuri"))
	   {
		   System.out.println("Madhuri is Present in the list");
		   break;
	   }
	   else
	   {
		   System.out.println("Not present in the list");
	   }
   }
   System.out.println("****************");   
   for(String name : names)
   {
	   System.out.println(name);
   }
   System.out.println("#################################");
   String[] geeks = {"Mahender","Madhuri", "Aaradhya"};
   for(int i=0; i<geeks.length;i++)
   {
	   if(geeks[i].equalsIgnoreCase("Madhuri"))
	   {
		   System.out.println("Madhuri is Present in the List");
		   continue;
	   }
	   else
	   {
		   System.out.println("Madhuri is not present in the List");
	   }
   }
   System.out.println("*****************************************");
   for(int i=0; i<geeks.length;i++)
   {
	   if(geeks[i].equalsIgnoreCase("Madhuri"))
	   {
		   System.out.println("Madhuri is Present in the List");
		   break;
	   }
	   else
	   {
		   System.out.println("Madhuri is not present in the List");
	   }
   }
   System.out.println("*****************************************");
   List<String> convertedList = Arrays.asList(geeks);
   if(convertedList.contains("Aaradhya"))
   
	   {
		   System.out.println("Aaradhya is Present in the list");
		
	   }
	   else
	   {
		   System.out.println("Not present in the list");
	   }
   
   
	}

}
