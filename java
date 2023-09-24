import java.util.Scanner;
class Trail{
	public static void main (String[] args){
		Scanner ram=new Scanner(System.in);
		String a,n,receiver;
		float balance,number,d,bill,rb;
		a="password";
		System.out.println("enter the password");
		n= ram.nextLine();
		if (a.equals(n)){
			System.out.println("welcome");
			balance=1850.2f;
			System.out.print("enter the name of the receiver: ");
			receiver=ram.nextLine();
			System.out.print("enter the number of the receiver: ");
			number=ram.nextFloat();
			System.out.print("enter the amount to be sent: ");
            d=ram.nextFloat();
			rb=balance-d;
			if (d<balance){
				System.out.println(" congatulations! the transaction is complete");
				System.out.println("Do you want to see the balance remaining....?:");
				System.out.print( "if yes type '1' else type'2'");
				bill=ram.nextFloat();
				if(bill==1){
					System.out.println("the remaining balance is"+rb);
				}
				else if(bill==2){
					System.out.print("Thankyou!Have a good day.....");
				}
			}
			else{
				System.out.println("Insufficient balance");
				System.out.println("Do you want to see the balance remaining....?:");
				System.out.print( "if yes type '1' else type'2': ");
				bill=ram.nextFloat();
				if(bill==1){
					System.out.println("the remaining balance is  "+balance);
				}
				else if(bill==2){
					System.out.print("Thankyou!Have a good day.....");
				}
			}
		}
		else{
		System.out.println("invalid password");
		}
	}
}
