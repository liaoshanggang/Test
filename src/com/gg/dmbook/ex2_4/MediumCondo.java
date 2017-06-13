package com.gg.dmbook.ex2_4;




public class MediumCondo implements Condo
{
  		private String name;

  		public MediumCondo(String cName)
  		{
    			name = cName;
  		}

  		public String getCondoInfo()
  		{
			return "mediumCondo.html";
	    }

	    public String getCondoFeatures()
		{
			return "Medium Condo ";
  		}

} // End of class