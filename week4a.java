import java.util.*;
class week4a
{
	public static void main(String args[])
	{
		int num1,num2,option,ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Select an option \n1.Add\n2.Sub:");
			option=sc.nextInt();
			System.out.println("Enter values of num1 and num2:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			switch(option)
			{
			case 1: System.out.println("Sum of num1 and num2:"+(num1+num2));
					break;
			case 2: System.out.println("Sub of num1 and num2:"+(num1-num2));
                                        break;
                        default:System.out.println("Input wrong\n Enter any number which is given in options");
                 
			}
			System.out.println("press 'y' or 'Y' to continue:");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}
}
