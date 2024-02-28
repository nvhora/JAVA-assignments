class bank{
	double getIntreast(){
		return 0.2;
	}
}

class sbi extends bank{
	double getIntreast(){
		return 4.0;
	}
}

class icici extends bank{
	double getIntreast(){
		return 7.0;
	}
}
public class ORideBank {

	public static void main(String[] args) {
		bank b=new bank();
		sbi s=new sbi();
		icici i=new icici();
		
		System.out.println("bank intreast rate = "+b.getIntreast());
		System.out.println(" SBI intreast rate = "+s.getIntreast());
		System.out.println(" ICICI intreast rate ="+i.getIntreast());
	}

}
