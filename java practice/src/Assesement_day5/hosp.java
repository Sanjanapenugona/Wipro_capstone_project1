package Assesement_day5;
interface Doctor
{
	void operation();
	void opd();
}
interface Nurse
{
	void dailycheckup();
	void documentation();
}
interface Accountant
{
	void payment();
	void query();
}
class Patients implements Doctor, Nurse, Accountant {
	
	public void operation() {
		System.out.println("operation");
	}
	public void opd() {
		System.out.println("opd");
	}
	public void dailycheckup() {
		System.out.println("dailycheckup");
	}
	public void documentation() {
		System.out.println("documentation");
	}
	public void payment() {
		System.out.println("payment");
	}
	public void query() {
		System.out.println("query");
	}
}

public class hosp {

	public static void main(String[] args) {
		Patients p=new Patients();
		p.dailycheckup();
		p.operation();
		p.opd();
		p.documentation();
		p.payment();
		p.query();
		
		

	}

}
