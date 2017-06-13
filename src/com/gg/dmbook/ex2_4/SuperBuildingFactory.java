package com.gg.dmbook.ex2_4;






public class SuperBuildingFactory extends BuildingFactory {


   public House getHouse()
   {
	   return new SuperHouse("Super house");

   }
   public Condo getCondo()
   {
	   return new SuperCondo("Super condo");
   }

} // End of class
