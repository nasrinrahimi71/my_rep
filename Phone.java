import java.util.Scanner;

public class Phone {
	public static void main(String [] args)
	{
		String[] name_user =new String[5];
		String[] phone_user =new String[5];
		for(int i=0;i<3;i++) {
			
			Scanner input=new Scanner(System.in);
			System.out.println("Enter Name "+ i + " : ");
			name_user[i]=input.nextLine();
			System.out.println("Enter Phone " + i + " : ");
			phone_user[i]=input.nextLine();
			
		}
		
		System.out.println("Enter name for search her phone");
		int num;
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		System.out.println("Name And Phone Number is : "+name_user[num]+" : "+ phone_user[num]);
		/*int found=0;
		int fndidx=-1;
		
		for( int i=0;i<3;i++)
		{
			
			if(name==name_user[i])

			{
				//found=1;
				//fndidx=i;
				System.out.println("Phone user: "+ phone_user[i]);
			}
		
		else
		{
			System.out.println("Not found");
		}
	}*/

}
}
