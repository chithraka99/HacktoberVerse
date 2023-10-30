import java.util.Scanner;

public class Pp
{ 
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int i = sc.nextint();
		
		for(; i>0; i--){
			for(int j=1; j<=i; j++){
				System.out.println(i);
			}
			
			System.out.println();
		}
	}
}