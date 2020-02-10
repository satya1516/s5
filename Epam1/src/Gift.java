import java.util.*;

public class Gift{
	static Scanner sc=new Scanner(System.in);
	static ArrayList<Chocolate> chocos=new ArrayList<Chocolate>();
	static ArrayList<Chocolate> bar_choco=new ArrayList<Chocolate>();
	static ArrayList<Sweet> sweets=new ArrayList<Sweet>();
	static HashMap<String,Integer> wt=new HashMap<String,Integer>();
	static HashMap<String,Integer> pr=new HashMap<String,Integer>();
	static int swt_weight,swt_price;
	public static void main(String[] args)
	{
		cal_choco();
		cal_sweet();
		System.out.println("Total weight of the gift:"+total_weight());
		System.out.println("Choose the way to sort(enter the number): 1. By Price 2. By Weight");
		int sortType=sc.nextInt();
		if(sortType==1)
		{
			Comparator<Chocolate> compareByPrice=(Chocolate c1,Chocolate c2)->((Integer)c1.getPrice()).compareTo(c2.getPrice());
			Collections.sort(chocos,compareByPrice);
		}
		else
		{
			Comparator<Chocolate> compareByWeight=(Chocolate c1,Chocolate c2)->((Integer)c1.getWeight()).compareTo(c2.getWeight());
			Collections.sort(chocos,compareByWeight);
		}
		System.out.println("The sort result:");
		for(Chocolate chocolate: chocos)
		{
			System.out.println(chocolate.getPrice());
		}
		calcRange(sortType);
	}
	
	public static void cal_sweet()
	{
		
		System.out.println("Enter the number of sweets:\n");
		int sweets_count=sc.nextInt();
		for(int sweetCount=1; sweetCount<=sweets_count;sweetCount++)
		{
			//System.out.println("Enter the sweet type(Enter the number): 1.Barfi 2. gilebi");
			System.out.println("Enter the weight of the sweet");
			int swt_weight=sc.nextInt();
			System.out.println("Enter the price of the sweet");
			int swt_price=sc.nextInt();
			Sweet sweet=new Sweet(swt_weight,swt_price);
			sweets.add(sweet);
		}
	}
	public static int total_weight()
	{
		int total_weight=0;
		for(Chocolate choco: chocos)
		{
			total_weight+=choco.getWeight();
		}
		for(Sweet sweet:sweets)
		{
			total_weight+=sweet.getWeight();
		}
		return total_weight;
	}
	public static void cal_choco()
	{
		System.out.println("Enter the nummber of chocos :\n");
		int chocos_count=sc.nextInt();
		for(int chocoCount=1; chocoCount<=chocos_count;chocoCount++)
		{
			System.out.println("Enter the chocolate type(Enter the number): 1. MilkChocolate 2.Dark chocolate");
			int choco_type=sc.nextInt();
			System.out.println("Enter the weight of the choclate");
			int choco_weight=sc.nextInt();
			System.out.println("Enter the price of the chocolate");
			int choco_price=sc.nextInt();
			if(choco_type==1)
			{
				System.out.println("Enter the name of the candy");
				String choco_name=sc.next();
				if(wt.containsKey(choco_name))
				{
					wt.put(choco_name,(int)wt.get(choco_name)+choco_weight);
				}
				else 
					wt.put(choco_name,choco_weight);
				if(pr.containsKey(choco_name))
				{
					pr.put(choco_name,(int)pr.get(choco_name)+choco_price);
				}
				else
					pr.put(choco_name,choco_price);
			}
			Chocolate choco =new Chocolate(choco_weight,choco_price);
			chocos.add(choco);
			if(choco_type==1)
			{
				bar_choco.add(choco);
			}
		}
	}
	public static void calcRange(int sortType)
	{
		Scanner sc=new Scanner(System.in);
	   System.out.println("Let's find the range:");
	   int ll,hl;
	   if(sortType==1)
	   {
		   System.out.println("Enter the ll of the price:");
		   ll=sc.nextInt();
		   
		   System.out.println("Enter the hl of the price");
		   hl=sc.nextInt();
		   
		   Set<Map.Entry<String,Integer>> candySet=pr.entrySet();
		   Iterator<Map.Entry<String,Integer>> candyIterator=candySet.iterator();
		   while(candyIterator.hasNext())
		   {
			   Map.Entry candyElement=(Map.Entry)candyIterator.next();
			   int price_present=(int)candyElement.getValue();
			   if(price_present>= ll && price_present<=hl)
				   System.out.println(candyElement.getKey());
		   }
	   }
	   else
	   {
		   System.out.println("Enter the ll of the weight:");
		   ll=sc.nextInt();
		   System.out.println("Enter the hl of the weight:");
		   hl=sc.nextInt();
		   Set<Map.Entry<String,Integer>> candySet=wt.entrySet();
		   Iterator<Map.Entry<String,Integer>> candyIterator=candySet.iterator();
		   while(candyIterator.hasNext())
		   {
			   Map.Entry candyElement=(Map.Entry)candyIterator.next();
			   int weight_present=(int)candyElement.getValue();
			   if(weight_present>= ll && weight_present<=hl)
				   System.out.println(candyElement.getKey());
		   }
		   
	   }
	}
}
