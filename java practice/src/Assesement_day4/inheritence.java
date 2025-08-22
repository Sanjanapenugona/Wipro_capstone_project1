package Assesement_day4;
class hospital
{
	void hospitalDetails()
	{
		System.out.println("This is our hospital");
	}	
}
class doctor extends hospital
{
	void doctorDetails()
	{
		System.out.println("doctor specialist");
	}
}
class gynoc extends doctor
{
	void gynocDetails()
	{
		System.out.println("gynoc");
	}
}

class endo extends doctor
{
	void endoDetals()
	{
		System.out.println("endo");
	}
}
class cardic extends doctor
{
	void cardicDetals()
	{
		System.out.println("cardic");
	}
}
class operation extends cardic
{
	void operationDetals()
	{
		System.out.println("operation");
	}
}
class opd extends cardic
{
	void opdDetals()
	{
		System.out.println("opd");
	}
}
class nurse extends hospital
{
	void nurseDetals()
	{
		System.out.println("nurse");
	}
}
class accountant extends hospital
{
	void accountantDetals()
	{
		System.out.println("accountant");
	}
}
class payments extends accountant
{
	void paymentsDetals()
	{
		System.out.println("payments");
	}
}
class documantation extends accountant
{
	void documantationDetals()
	{
		System.out.println("documantation");
	}
}
public class inheritence {

	public static void main(String[] args) {
		System.out.println("Gynac");
		gynoc g=new gynoc();
		g.hospitalDetails();
		g.doctorDetails();
	}

}
