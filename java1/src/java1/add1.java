package java1;
import java.util.Scanner; 
public class add1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Hii Welcome to my calculator");
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter value 1");
		  int a = sc.nextInt();
		  System.out.println("Enter value 2");
		  int b = sc.nextInt();
		  System.out.println("Enter Operation ");
    	 
    	  char val1=sc.next().charAt(0);
		 
		  switch (val1) {
		    case '+':
		    int sum=a+b;
		    System.out.println("Sum = "+ sum);
		    break;
		    case '-':
		    int sub=a-b;
			System.out.println("Sub = "+ sub);
		    break;
		    case '*':
		    int mul=a*b;
			System.out.println("Mul = "+ mul);
		    break;
		    case '/':
		    int div=a/b;
		    System.out.println("Div = "+ div);
		    break;
		    case '%':
			int mod=a%b;
		    System.out.println("Mod = "+ mod);
			break;
		  }
		  
//		  
//		  // int val = sc.nextInt();
//		  switch (val) {
//		    case 1:
//		    int sum=a+b;
//		    System.out.println("Sum="+ sum);
//		    break;
//		    case 2:
//		    int sub=a-b;
//			System.out.println("Sub="+ sub);
//		    break;
//		    case 3:
//		    int mul=a*b;
//			System.out.println("Mul="+ mul);
//		    break;
//		    case 4:
//		    int div=a/b;
//		   System.out.println("Div="+ div);
//		      break;
//		  }
	}

}
