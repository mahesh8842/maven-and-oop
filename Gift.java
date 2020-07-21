package com.epam.NewYearGift;
import java.util.*;

public class Gift 
{
	int weight ;
	String Name;
	float sugarPercent;
	int energy;
	String dateOfExpiry;
	static String CandyList="" ;
	static ArrayList<Gift> al=new ArrayList<Gift>();
	
	static ArrayList<String> al2 = new ArrayList<String>();
		
	Gift(String Name,float sugar,int energy,String dateOfExpiry,int weight)
	{
		this.Name = Name;
		sugarPercent = sugar;
		this.energy = energy;
		this.dateOfExpiry = dateOfExpiry;
		this.weight=weight;
	}
	
	static void isCandy(String s)
	{
		
		if(Gift.al2.contains(s))
		{
			Gift.CandyList+=s;
		}
		
	}
	
	
	static void add(Sweets s)
	{
		al.add((Gift)s);
	}
	static void add(Chocolates ch)
	{
		al.add((Gift)ch);
		Chocolates.choco.add(ch);
		isCandy(ch.Name);
	}
	
	public static int weighth(ArrayList<Gift> al)
	{
		int w=0;
		for(int i=0;i<al.size();i++)
		{
			w=w+al.get(i).weight;
		}
		return w;
	}
}
