package epam5;

public abstract class Construction_abstract {
double amount;
public abstract double getAmount();

public double Bill(double amount,double area){  
    return (amount*area);  
}
}
