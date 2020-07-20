import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] Shopping=new String[5];
		System.out.println("---------------Welcome to Shri Shopping!!-------------"
				+ "");
		Shopping[0]="Electronics";
		Shopping[1]="Cloths";
		Shopping[2]="Sports";
		Shopping[3]="Books";
		System.out.println("************************MENU***********************");
		int sum;
		for(int i=0;i<Shopping.length-1;i++)
		{
			
			System.out.println(Shopping[i]);
			
		}
		System.out.println("---------------------------------------");
		System.out.println("Which category you want");
		
		
		Connection c=new Connection();
		c.abc();
		Int i=new Int();
		i.cases();
		Retrival r=new Retrival();
		r.payment();
		
		 
	}
	
}
class Accessories
{
	Scanner sc=new Scanner(System.in);
	
	int x;
	
	
	void samsung_mob()
	{	
		
		
		
			System.out.println("---------------------------------------");
			System.out.println("Bill Details:\n-----------\nSamsung\nActual Price:35k\nDiscount Price:32k");
			System.out.println("Order delivery expected within 5 working days");
	}
		void vivo()
		{
			System.out.println("---------------------------------------");
			System.out.println("Bill Details:\n-----------\nVivo\nActual Price:40k\nDiscount Price:37k");
			System.out.println("Order delivery expected within 5 working days");
		}
		void oppo()
		{
			System.out.println("---------------------------------------");
			System.out.println("Bill Details:\n-----------\nOPPO\nActual Price:40k\nDiscount Price:37k");
			System.out.println("Order delivery expected within 5 working days");
		}
		void redmi()
		{
			System.out.println("---------------------------------------");
			System.out.println("Bill Details:\n-----------\nRedmi Xiomi\nActual Price:40k\nDiscount Price:37k");
			System.out.println("Order delivery expected within 5 working days");
		}
		void nokia()
		{
			System.out.println("---------------------------------------");
			System.out.println("Bill Details:\n-----------\nNokia\nActual Price:40k\nDiscount Price:37k");
			System.out.println("Order delivery expected within 5 working days");
		
		}
	void whirlPool()
	{
		
			System.out.println("---------------------------------------");
			System.out.println("----------WhirlPool\nActual Price:33000\nDiscount upto 10& off");
			System.out.println("Order delivery expected within 5 working days");
		}
		void lG()
		{
			System.out.println("---------------------------------------");
			System.out.println("Bill Details:\n-----------\nLG\nActual Price:45k\nDiscount Price:43k");
			System.out.println("Order delivery expected within 5 working days");
		}
		
	void bosch()
	{
		System.out.println("---------------------------------------");
		System.out.println("Bill Details:\n-----------\nBosch\nActual Price:45k\nDiscount Price:43k");
		System.out.println("Order delivery expected within 5 working days");
	}
	void sony()
	{
		System.out.println("---------------------------------------");
			System.out.println("-----------------\nSony\nActual Price Rs:50000\nDiscount upto 20% off");
			System.out.println("Order delivery expected within 5 working days");
		}
	void lg()	
		{
			System.out.println("---------------------------------------");
			System.out.println("-----------------\nLG\nActual Price Rs:55000\nDiscount upto 10% off");
			System.out.println("Order delivery expected within 5 working days");
		}
	void samsung()
	{
		System.out.println("---------------------------------------");
		System.out.println("Bill Details:\n-----------------\nSamsung\nActual Price:50k\nDiscount Price:48kk");
		System.out.println("Order delivery expected within 5 working days");
	}
	void onida()
	{
		System.out.println("---------------------------------------");
		System.out.println("Bill Details:\n-----------------\nOnida\nActual Price:50k\nDiscount Price:48kk");
		System.out.println("Order delivery expected within 5 working days");
	}
	
	void JeanM()
	{
		
		
			System.out.println("---------------------------------------");
			System.out.println("Bill Details:\n--------------\nJeanPant\nActual Price:500\nDiscount Price:399");
			System.out.println("Order delivery expected within 5 working days");
		}
		void shirt()
		{
			System.out.println("---------------------------------------");
			System.out.println("Bill Details:\n------------\nT-shirt Men\n Actual Price:350\nDiscount Price:280");
			System.out.println("Order delivery expected within 5 working days");
		}
		void menKurta()
		{
			System.out.println("---------------------------------------");
			System.out.println("Bill Details:\n------------\nMen Kurta\n Actual Price:350\nDiscount Price:280");
			System.out.println("Order delivery expected within 5 working days");
		}
	
	void saree()
	{
		
			System.out.println("---------------------------------------");
			System.out.println("Bill Details:\n------------\nSaree\n Actual price:550\nDiscount Price:499");
			System.out.println("Order delivery expected within 5 working days");
		}
		void top()
		{
			System.out.println("---------------------------------------");
			System.out.println("Bill Details:\n--------------\nTop\n Actual price:350\nDiscount Price:299");
			System.out.println("Order delivery expected within 5 working days");
		}
		void JeanW()
		{
			System.out.println("---------------------------------------");
			System.out.println("Bill Details:\n--------------\nWomen's Denim\n Actual price:350\nDiscount Price:299");
			System.out.println("Order delivery expected within 5 working days");
		}
		void kurta()
		{
			System.out.println("---------------------------------------");
			System.out.println("Bill Details:\n--------------\nWomen Kurta\n Actual price:350\nDiscount Price:299");
			System.out.println("Order delivery expected within 5 working days");
		}
	void frock()
	{
		
			System.out.println("---------------------------------------");
			System.out.println("Bill Details:\n---------------\nfrock\nActual Price:500\nDiscount Price:350");
			System.out.println("Order delivery expected within 5 working days");
			
		}
		void kidPant()
		{
			System.out.println("---------------------------------------");
			System.out.println("Bill Details:\n-----------\nKids Pant\nActual Price:350Discount Price:250");
			System.out.println("Order delivery expected within 5 working days");
		}
		void chudidhaar()
		{
			System.out.println("---------------------------------------");
			System.out.println("Bill Details:\n-----------\nChudidhaar\nActual Price:350Discount Price:250");
			System.out.println("Order delivery expected within 5 working days");
		}
		void kidTop()
		{
			System.out.println("---------------------------------------");
			System.out.println("Bill Details:\n-----------\nKid Top\nActual Price:350Discount Price:250");
			System.out.println("Order delivery expected within 5 working days");
		}
	void badminton()
	{
		
			System.out.println("---------------------------------------");
			System.out.println("Bill Details:\n--------------\nBat\nActual Price:1000\nDiscount Price:699\nball Actual price:200\nDiscount Price:165");
			System.out.println("Order delivery expected within 5 working days");
			
		}
		void cricket()
		{
			System.out.println("---------------------------------------");
			System.out.println("Bill Details\n--------------------\nCricket Bat Actual Price:2000\nDiscount Price:1699\nBall Actual price:200Discount Price:175");
			System.out.println("Order delivery expected within 5 working days");
		}
	
	void carrom() {

		
			System.out.println("---------------------------------------");
			System.out.println("Bill Details:\n-----------\nCarrom Board\nActual Price:350\nDiscount Price:321");
			System.out.println("Order delivery expected within 5 working days");
	}
	void chess()
	{
			System.out.println("---------------------------------------");
			System.out.println("Bill Details:\n-------------\nChess Board Actual Price:250\nDiscount Price:230");
			System.out.println("Order delivery expected within 5 working days");
		}
		
	
	
	
	
}

class Connection
{
	Scanner sc=new Scanner(System.in);
	
	
	String s2;
	
	void abc()
	{
		s2=sc.nextLine();
		if(s2.equalsIgnoreCase("Electronics")==true)
		{
		System.out.println("TV\nWashing Machine\nMobile Phone");
		System.out.println("---------------------------------------");
		System.out.println("Select category type:");
		String b;
		b=sc.nextLine();
		if(b.contentEquals("TV"))
		{
			System.out.println("1.Sony\n2.LG\n3.Onida\n4.Samsung");
		}
		if(b.contentEquals("Washing Machine"))
		{
			System.out.println("5.WhirlPool\n6.Bosch\n7.LG");
		}
		else if(b.contentEquals("Mobile Phone"))
		{
			System.out.println("8.Vivo\n9.Samsung\n10.OPPO\n11.Redmi\n12.Nokia");
		}
	}
	
	else if(s2.equalsIgnoreCase("Cloths")==true)
	{
		System.out.println("Men\nWomen\nKids");
		System.out.println("---------------------------------------");
		String c;
		c=sc.nextLine();
		if(c.contentEquals("Men"))
		{
			System.out.println("13.JeanPant\n14.Shirt\n15.Men's_Kurta");
			
		}
		if(c.contentEquals("Women"))
		{
			System.out.println("16.Saree\n17.Top\n18.Jean\n19.Kurta");
			
		}
		if(c.contentEquals("Kids"))
		{
			System.out.println("20.Frock\n21.Pants\n22.Chudidaar\n23.Kids_Top");
			
		}
		
	}
	if(s2.equalsIgnoreCase("Sports")==true)
	{
		
		System.out.println("Outdoor\nIndoor");
		System.out.println("---------------------------------------");
		String d;
		d=sc.nextLine();
		if(d.contentEquals("Indoor"))
		{
			System.out.println("24.Carrom\n25.Chess");
		}
		if(d.contentEquals("Outdoor"))
		{
			System.out.println("26.Cricket\n27.Badminton");
		}
	}
	}
}


class Int
{
	Scanner sc=new Scanner(System.in);
	int x;
	
	void cases()
	{
		
		System.out.println("---------------------------------------");
		
		System.out.println("Enter ur choice:");
		x=sc.nextInt();
		switch(x)
		{
		case 1: Accessories ac=new  Accessories();
				if(x==1)
				{
						ac.sony();
				}
		case 2:Accessories ac1=new  Accessories();
		if(x==2)
		{
			ac1.lg();
		}
		case 3:Accessories ac2=new  Accessories();
		if(x==3)
		{
			ac2.onida();
		}
		case 4:Accessories ac3=new  Accessories();
		if(x==4)
		{
			ac3.samsung();
		}
		case 5:Accessories ac4=new  Accessories();
		if(x==5)
		{
			ac4.whirlPool();
		}
		case 6:Accessories ac5=new  Accessories();
		if(x==6)
		{
			ac5.bosch();
		}
		case 7:Accessories ac6=new  Accessories();
		if(x==7)
		{
			ac6.lG();
		}
		case 8:Accessories ac7=new  Accessories();
		if(x==8)
		{
			ac7.vivo();
		}
		case 9:Accessories ac8=new  Accessories();
		if(x==9)
		{
			ac8.samsung_mob();
		}
		case 10:Accessories ac9=new  Accessories();
		if(x==10)
		{
			ac9.oppo();
		}
		case 11:Accessories ac10=new  Accessories();
		if(x==11)
		{
			ac10.redmi();
		}
		case 12:Accessories ac11=new  Accessories();
		if(x==12)
		{
			ac11.nokia();
		}
		
		case 13:Accessories aa=new Accessories();
		if(x==13)
		{
			aa.JeanM();
		}
		case 14:Accessories aa1=new Accessories();
		if(x==14)
		{
			aa1.shirt();
		}
		case 15:Accessories aa2=new Accessories();
		if(x==15)
		{
			aa2.menKurta();
		}
		case 16:Accessories aa3=new Accessories();
		if(x==16)
		{
			aa3.saree();
		}
		case 17:
			Accessories aa4=new Accessories();
			if(x==17)
			{
				aa4.top();
			}
		case 18:Accessories aa5=new Accessories();
		if(x==18)
		{
			aa5.JeanW();
		}
		case 19:Accessories aa6=new Accessories();
		if(x==19)
		{
			aa6.kurta();
		}
		case 20:Accessories aa7=new Accessories();
		if(x==20)
		{
			aa7.frock();
		}
		case 21:Accessories aa8=new Accessories();
		if(x==21)
		{
			aa8.kidPant();
		}
		case 22:Accessories aa9=new Accessories();
		if(x==22)
		{
			aa9.chudidhaar();
		}
		case 23:Accessories aa10=new Accessories();
		if(x==23)
		{
			aa10.kidTop();
		}
		case 24:Accessories aa11=new Accessories();
		if(x==24)
		{
			aa11.carrom();
		}
		case 25:Accessories aa12=new Accessories();
		if(x==25)
		{
			aa12.chess();
		}
		case 26:Accessories aa13=new Accessories();
		if(x==26)
		{
			aa13.cricket();
		}
		case 27:Accessories aa14=new Accessories();
		if(x==27)
		{
			aa14.badminton();
		}
		}
	}
}

class Retrival
{
	Scanner sc=new Scanner(System.in);
	
	String name;
	int ph;
	String addr;
	String mail;
	int card_no;
	int pin;
	String ch;
	String s4;
	int a;
	int b;
	int c;
	String s5;
	int sum;
	String cash;
	String card;
	String pay;
	int y;
	void payment()
	{
		
		BillD bd=new BillD();
		String yes;
		String ok;
		System.out.println("Want to add to cart");
		s4=sc.nextLine();
		
		BillD bd1=new BillD();
		BillD bd2=new BillD();
		BillD bd3=new BillD();
		if(s4.equalsIgnoreCase("sony")==true) {
		System.out.println(bd1.cart(a));
		}
		if(s4.equalsIgnoreCase("lg")==true) {
		System.out.println(bd2.cart1(b));
		}
		if(s4.equalsIgnoreCase("whirlpool")==true) {
			System.out.println(bd3.cart2(c));
		}
		
		System.out.println("Want to purchase");
		s5=sc.nextLine();
		System.out.println("Bill details");
		System.out.println("----------------");
		
		
		if(s5.equalsIgnoreCase("sony")==true)
		{
			
			bd.bil_tv();
			
		}
		else if(s5.equalsIgnoreCase("lg")==true)
		{
			
			bd.bil_tv1();
		}
		else if(s5.equalsIgnoreCase("whirlpool")==true)
		{
			bd.bil_washing();
		}
		System.out.println("Wish to Continue! Press 0");
		int key;
		key=sc.nextInt();
		if(key==0)
		{
			System.out.println("Select category you want");
	         Connection cn=new Connection();
		cn.abc();
		
		Int i=new Int();
		i.cases();
		Retrival r=new Retrival();
		Ran ra=new Ran();
		r.payment();
		bd.bil_tv();
		ra.recpt();
		}
		else if(key==55)
		{
			System.out.println("Want to pay");
			ok=sc.nextLine();
			if(ok.equalsIgnoreCase("yes")==true)
			{
			
				System.out.println("Which method you prefer:\n**CARD**  **CASH**");
				
				pay=sc.nextLine();
				System.out.println("Enter your details:");
				System.out.println("------------------------------");
				System.out.println("Enter name:");
				name=sc.nextLine();
				System.out.println("Enter address");
				addr=sc.nextLine();
				System.out.println("Enter phone number");
				ph=sc.nextInt();
				
			}
				else if(pay.equalsIgnoreCase("cash")==true)
				{
					System.out.println("Payment successfull");
					
					
				}
				else
				{
						Scanner sc1=new Scanner(System.in);
						System.out.println("Enter your mail:");
						mail=sc1.nextLine();
						System.out.println("Enter cvv number:");
						card_no=sc1.nextInt();
						System.out.println("Enter pin:");
						pin=sc1.nextInt();
						System.out.println("Payment Successfull");
				}
				
		}
		
		System.out.println("You want Receipt\nYES Press 1 else Press 2 ");
		
		y=sc.nextInt();
		Ran ra=new Ran();
				if(y==1)
				{
				
					System.out.println("Receipt details");
					System.out.println("*************************************");
					ra.recpt();
				
					
				}
		
				
		else
		{
				System.out.println("Thank you for shopping!");
				System.exit(0);
		}
	
		
	}

class Ran 
{
	
	double in=0;
	Retrival r=new Retrival();
	void recpt()
	{
		Retrival r=new Retrival();
		System.out.println("Invoice Number"+" "+getRandomNumber());
		
		System.out.println("Name:"+" " +name);
		System.out.println("address:"+" "+addr);
		System.out.println("Phone:"+" "+ph);
		
		System.out.println("----------------------------------------");
	}
	public double getRandomNumber()
	{
		double in=Math.random();
		return in;
	}
	
}	
}
class BillD
{
	
	Scanner sc1=new Scanner(System.in);
	
	int a;
	
	Retrival r=new Retrival();
	void bil_tv()
	{
		
		System.out.println("--------------\nItem:Sony TV\nActual Price Rs:50000\nDiscount 20%\nGST:5%\nTotal Rs:37500");
		
	}
	void bil_tv1()
	{
		System.out.println("--------------\nItem:LG TV\nActual Price Rs:55000\nDiscount 10%\nGST:5%\nTotal Rs:46750");
	}
	void bil_washing()
	{
		System.out.println("--------------\nItem:WhirlPool Machine\nActual Price Rs:33000\nDiscount 10%\nGST:5%\nTotal Rs:28050");
	}
	int cart(int a)
	{
		a=37500;
		
		System.out.print("Total amount"+" ");
		return a;
	}
	int cart1(int b)
	{
		b=46750;
		System.out.println("Total amount"+" ");
		return b;
	}
	int cart2(int c)
	{
		c=28050;
		
		System.out.println("Total amount"+" ");
		return c;
	}
}

		

