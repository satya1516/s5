package epam5;

public class Intrest_calculation extends Intrest_abstract{
public double simpleintrest(double principal_amount,double intrest,double time_period)
	{
	            double result;
				result=((principal_amount*intrest*time_period)/100);
				return result;
	}
    
public double compoundintrest(double principal_amount,double intrest,double time_period)
	{
	double result;    
    result= principal_amount *(Math.pow((1 + intrest/ 100), time_period));
    return result;
	}

	

}
