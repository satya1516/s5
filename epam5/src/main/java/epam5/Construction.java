package epam5;

public class Construction {
public Construction_abstract materials(String material)
{
	if(material.equalsIgnoreCase("Standard")) {
		return new Standards();
	}
	else if(material.equalsIgnoreCase("AboveStandards"))
	{
		return new AboveStandards();
	}
	else if(material.equalsIgnoreCase("HighStandards"))
	{
		return new HighStandards();
	}
	else if(material.equalsIgnoreCase("ExcellentStandards"))
	{
		return new ExcellentStandards();
	}
	return null;
}
}
