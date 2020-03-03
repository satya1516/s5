package epam5;

public class Complete_House {
public double construction(String material,double area)
{
	Construction con=new Construction();
	Construction_abstract ca=con.materials(material);
	double amount=ca.getAmount();
	double bill=ca.Bill(amount,area);
    return bill;
	
}
}