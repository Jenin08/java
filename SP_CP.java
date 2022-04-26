import java.util.Scanner;

public class SP_CP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your selling price");
		num1=sc.nextInt();
		System.out.println("enter your cost prie");
		num2=sc.nextInt();
		res=num1-num2;
		if(res>num2)
		{
			System.out.println("You have done profit of "+res);
		}
		else if(res<num2)
		{
			System.out.println("your have made a losss of "+res);
			
		}
		else
		{
			System.out.println("NO Profit NO Loss");
			
		}
		

	}

}
