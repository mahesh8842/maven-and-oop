package com.epam.NewYearGift;
import java.util.*;

public class NewGift {

	public static void main(String[] args) 
	{
		
		Gift.al2.add("orangeCandy");
		Gift.al2.add("mangoCandy");
		Gift.al2.add("colaCandy");
		
		Sweets kalakand = new Sweets("kalakand",78,100,"10-Feb-2020",450);
		Sweets doodhPeda = new Sweets("doodhPeda",80,150,"06-Feb-2020",500);
		Sweets rasmalai =  new Sweets("rasmalai",85,200,"20-Feb-2020",980);
		Sweets gulabJamun = new Sweets("gulabJamun",90,300,"14-Feb-2020",750);
		
		Chocolates kitkat = new Chocolates("kitkat",40,50,"10-Dec-2022",10);
		Chocolates diaryMilk = new Chocolates("diaryMilk",20,75,"25-Mar-2021",15);
		Chocolates munch = new Chocolates("munch",30,30,"21-Jun-2023",19);
		Chocolates orangeCandy = new Chocolates("orangeCandy",90,5,"09-Sep-2020",2);
		
		
		Gift.add(kalakand);
		Gift.add(doodhPeda);
		
		Gift.add(kitkat);
		Gift.add(diaryMilk);
		Gift.add(orangeCandy);
		
		
		System.out.println("\nTotal weight of Gift is "+Gift.weighth(Gift.al)+"\n");
		
		Collections.sort(Chocolates.choco,new ChocolateSort());
		
		System.out.println("Sorting chocolates in gift by name ");
		for(Chocolates i:Chocolates.choco)
			System.out.println(i.Name);
		
		System.out.println("\nCandies in the gift are");
		System.out.println(Gift.CandyList);
		

	}

}
