package day1.basics;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1 = "Hello Java";
        System.out.println("s1: "+s1);
       String temp = " ";
       for(int i= s1.length()-1;i>=0;i--);
        {
        	temp=temp + s1.charAt(i);
         }
      System.out.println("Reverse String: "+temp);
        
	}

}
