
public class Prime {
	boolean func(int n)
	{
		int flag=1;
		if(n==1)
		{
		 return false;
		}
		else
		{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
			 flag=0;
			 break;
			}
		}
			
		if(flag==0)
		{
			return false;
		}
		else return true;
		
	}

}
}
