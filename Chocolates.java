package com.epam.NewYearGift;
import java.util.*;

public class Chocolates extends Gift 
{
	static ArrayList<Chocolates> choco = new ArrayList<Chocolates>();
	Chocolates(String Name,float sugar,int energy,String dateOfExpiry,int weightc)
	{
		super(Name,sugar,energy,dateOfExpiry,weightc);
	}
}
