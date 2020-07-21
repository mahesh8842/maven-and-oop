package com.epam.NewYearGift;
import java.util.*;

public class ChocolateSort implements Comparator<Chocolates>
{
	public int compare(Chocolates a,Chocolates b)
	{
		return a.Name.compareTo(b.Name);
	}
}
