package coreJava;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		//Array Declaration
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[4] = 5;
		int[] nums = {1,2,3,4,5,8,10,14,80,100};
		System.out.println("Array value in 4th Index is "+numbers[4]);
		//check if it has multiple of 2
		for(int i=0; i<nums.length;i++)
		{
			if(nums[i] % 2== 0)
			{				
				System.out.println("Numbers which are multiple by 2 are "+nums[i]);
				break;
			}
			else
			{
				System.out.println("Numbers which are not multiple by 2 are "+nums[i]);
			}
		}
		//Print all the names in reverse order
		String[] names = {"Mahender","Madhuri","Aaradhya"};
		for(int j=names.length-1;j>=0;j--)
		{
			System.out.println(names[j]);
		}
		//Print all the names using For-each loop
		for(String name: names)
		{
			System.out.println(name);
		}

	}

}
