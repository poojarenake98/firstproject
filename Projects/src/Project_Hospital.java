import java.util.Scanner;

public class Project_Hospital {
	public static String user;
	 public static String user1;
	 public static int pass;
	 public static int pass1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO HEALTHCARE APPLICATION");
		System.out.println("New User??");
		String ch;
		ch=sc.nextLine();
		if(ch.equalsIgnoreCase("yes")==true)
		{
		Register r1=new Register();
		r1.reg();
		
		Login l1=new Login();
		l1.xyz();
		l1.log();
		Cases c=new Cases();
		c.details();
		}
		else if(ch.equalsIgnoreCase("no")==true)
		{
			
			Login l1=new Login();
			l1.log();
			
				System.out.println("Login Successfully");
			
			Cases c=new Cases();
			c.details();
			
			
		}
		
		
		System.out.println("**Specialist available**");
		Specialist s1=new Specialist();
		s1.specialists();
		
		
	System.out.println("-----------------------------------------------------");
		
		
		System.out.println("Which Issue are you  Facing:");
		
		s1.check();
		Mpay m1=new Mpay();
		m1.payment();
	
		m1.methodofPay();
		
	}

}
class Cases
{
	Scanner sc=new Scanner(System.in);
	
	String ch;
	void details() {
	System.out.println("--------------"+"WELCOME TO APOLLO HOSPITAL"+"--------------");
	System.out.println("*******************************************************");
	System.out.print("Please do mention the purpose:"+"  ");
	String pr;
	pr=sc.nextLine();
	if(pr.equalsIgnoreCase("visiting")==true)
	{
		System.out.print("Patient name:"+"  ");
		String pname=sc.nextLine();
		System.out.println("please go to room 201");
		System.exit(0);
	}
	
	
	else
	{
	System.out.println("Patient Details");
	System.out.print("Name:"+"  ");
	String name=sc.nextLine();
	System.out.print("Address:"+"  ");
	String add=sc.nextLine();
	System.out.print("Phone number:"+"  ");
	int phno=sc.nextInt();
	System.out.print("Age:"+"  ");
	int age=sc.nextInt();
	}
	}
	void check()
	{
		String prblm=sc.nextLine();
		
		switch(prblm)
		{
		case "fever":Specialist s1=new Specialist();
					System.out.println("---------------------------------------");
					System.out.println("Doctors Available\n1.VITTAL PETKAR\n2.SHRINIVAS RAO\n3.MADHUSUDHAN RAO");
					ch=sc.nextLine();
					System.out.println("Appointment Done..");
					
					if(ch.equalsIgnoreCase("VITTAL PETKAR")==true)
					{
						System.out.println("Please Go to room number 201\nVisit General Physician");
						
						System.out.println("Doctor charges Rs.200 ");
						s1.general();
					}
					else if(ch.equalsIgnoreCase("SHRINIVAS RAO")==true)
					{
System.out.println("Please Go to room number 202\nVisit General Physician");
						System.out.println("Doctor charges Rs.200 ");
						
						s1.general();
					}
					else if(ch.equalsIgnoreCase("MADHUSUDHAN RAO")==true)
					{
System.out.println("Please Go to room number 203\nVisit General Physician");
						
System.out.println("Doctor charges Rs.200 ");
						s1.general();
					}
					break;
		case "chest pain":Specialist s11=new Specialist();
		System.out.println("Please Go to room number 301\nVisit cardiologist");
		s11.card();
		break;
		
		}
	}
}
class Specialist extends Cases{
	String prblm;
	String s2;
	Scanner sc=new Scanner(System.in);
	void specialists()
	{
	String[] Spec=new String[7];
	Spec[0]="General Physician";
	Spec[1]="cardiologist";
	Spec[2]="orthopedician";
	Spec[3]="ENT specialist";
	Spec[4]="Gynocologist";
	Spec[5]="Pediatrician";
	Spec[6]="Dentist";
	
	for(int i=0;i<=Spec.length-1;i++)
	{
		
		System.out.println(Spec[i]);
	}
	}
	
	void general()
	{
		System.out.println("***************************************************");
		System.out.println("Checking Process");
		System.out.println("***************************************************");
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e5)
		{
			System.out.println("Sleeping");
		}
		System.out.println("What symptoms your facing w.r.t disease:");
		s2=sc.nextLine();
		try {
		if(s2.equalsIgnoreCase("headache")==true)
		{
			System.out.println("You can take acetaminophen");
			
			Thread.sleep(3000);
			System.out.println("You can take paracetamol");
			Thread.sleep(3000);
		}
		
		
		else
		{
			System.out.println("You need to admit and we have to check what level of fever");
		}
	}
		catch(Exception e1)
		{
			System.out.println("handled");
		}
		System.out.println("Thank you Doctor");
		System.out.println("***************************************************");
		
	}
	void card()
	{
		System.out.println("***************************************************");
		String s3;
		System.out.println("Checking Process");
		System.out.println("***************************************************");
		System.out.println("What symptoms your facing:");
		s2=sc.nextLine();
		if(s2.equalsIgnoreCase("chest pain")==true)
		{
			System.out.println("Checks whether it can be solved using treatment\nRecommend to take cardace 2.5mg");
		}
		else
		{
			System.out.println("suggest to undergo surgery");
		}
		System.out.println("Thank you Doctor");
		System.out.println("***************************************************");
		
	}
	
	
}
class Pay
{
	Scanner sc=new Scanner(System.in);
	String s4;
	String s5;
	String cash;
	String card;
	String online;
	int cvv;
	String s8;
	String yes;
	String no;
	int pin;
	void payment()
	{
		System.out.println("*****Welcome to Maruti Medicals*****");
		System.out.println("You want to purchase prescription!!");
		s8=sc.nextLine();
		if(s8.equalsIgnoreCase("yes")==true)
		{
			System.out.println("Which medicine");
		s4=sc.nextLine();
		if(s4.equalsIgnoreCase("paracetamol")==true||s4.equalsIgnoreCase("acetaminophen")==true)
		{
			int a=20;
			System.out.println("Medicine:"+" "+a);
			System.out.println("Total:250");

Mpay m2=new Mpay();
			m2.methodofPay();
		}
		
		else if(s4.equalsIgnoreCase("cardace")==true)
		{
			int b=500;
			System.out.println("Total:"+" "+b);
		}
		
	
	}
	
	else if(s8.equalsIgnoreCase("no")==true)
	{
		System.out.println("OK");
		System.exit(0);
	}
		System.exit(0);
}

}
class Mpay extends Pay
{
	void methodofPay()
	{
	System.out.println("----------------------Mode of payment-----------------");
	s5=sc.nextLine();
	if(s5.equalsIgnoreCase("cash")==true)
	{
		System.out.println("Payment done successfully!!");
	}
	else if(s5.equalsIgnoreCase("card")==true)
	{
		System.out.print("CVV Number:"+"  ");
		cvv=sc.nextInt();
		System.out.print("PIN:"+"  ");
		pin=sc.nextInt();
		System.out.println("Payment done successfully!!");
	}
	else
	{
		System.out.println("Scan QR code\nPayment Success!!");
	}
	System.out.println("**Thank You**");
}
}
class Register
{
	
	Scanner sc=new Scanner(System.in);
	public  static String user;
	public static int pass;
	String re;
	String Signup;
	
	public void reg()
	{
		
		System.out.println("Sign Up"+"                  "+"Login");
		re=sc.nextLine();
		if(re.equalsIgnoreCase("Signup")==true)
		{
			System.out.print("Username"+" ");
			user=sc.nextLine();
			System.out.print("Password"+" ");
			pass=sc.nextInt();
			System.out.println("Registered successfully");
		}
		else
		{
			System.out.println("Need to register!");
		}
		
			
	}
		
}
class Login extends Register
{
	String login;
	
	Scanner sc=new Scanner(System.in);
	int pass1;
	String user1;
	void xyz()
	{
		System.out.println("Please login!");
	}
	void log()
	{
		
	Register r2=new Register();
	System.out.print("Enter username:"+" ");
	
	user1=sc.nextLine();
	System.out.print("Enter password:"+" ");
	pass1=sc.nextInt();
	Register r1=new Register();
	if(user1.contentEquals(r1.user)==true && pass1==r1.pass)
	{
		System.out.println("Login Successfully");
	}
	else if(user1.contentEquals(r1.user)==true && pass1!=r1.pass)
	{
		System.out.println("Please enter valid details!");
		 Login l2=new  Login();
		 l2.log();
	}
	
	
}
}
