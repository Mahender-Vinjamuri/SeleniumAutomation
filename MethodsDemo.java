package coreJava;

public class MethodsDemo {

	public static void main(String[] args) {
		
		MethodsDemo d = new MethodsDemo();
		MethodsDemo2 d2 = new MethodsDemo2();
		d2.getData2();
		String str = d.getData();
		System.out.println(str);
		getData3();
	}

    public String getData()
    {
    	System.out.println("hello world");
    	return "Madhuri";
    }
    
    public static String getData3()
    {
    	System.out.println("hello world");
    	return "Mahender";
    }

}
