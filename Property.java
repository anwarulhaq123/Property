/* Property Class
Assignment No.-2
Author : Muhammad Anwar Ul Haq
Student Id :L00162311
Module:Software Development
Date: 21/02/2021
* */

public class Property
{
    //instance variables
    private int propertyNum;
    private String address;
    private int noBeds;
    private int noBaths;
    private int noReception;
    private double price;
    private static int nextPropertyNum = 100;

    //Constructors


    public Property(String add)
    {
        propertyNum = nextPropertyNum++;// Get the next property number
        address = add;
    }

    public Property( String add, int numberBeds, int numberBaths, int numberReception, double propertyPrice)
    {
        propertyNum = nextPropertyNum++;// Get the next property number
        address = add;
        noBeds = numberBeds;
        noBaths = numberBaths;
        noReception = numberReception;
        price = propertyPrice;
    }


    //Setter of instance variables

    public void setPropertyNum(int propertyNumber)
    {

        propertyNum = propertyNumber;
    }

    public void setAddress(String add)
    {

        address = add;
    }

    public void setNoBeds(int numberBeds)
    {
        noBeds = numberBeds;
    }

    public void setNoBaths(int numberBaths)
    {
        noBaths = numberBaths;
    }

    public void setNoReception(int numberReception)
    {
        noReception = numberReception;
    }

    public void setPrice(double propertyPrice)
    {
        price = propertyPrice;
    }
    // toString Method
    public String toString()
    {
        return "Property Number: "+ propertyNum + "\tProperty Address: "+ address + "\tNumber of Beds: "+
                noBeds +"\tNumber of Baths: "+ noBaths + "\tNumber of Receptions: " + noReception +
                "\t Price €: "+ price;
    }
    // View address method
    public String viewAddress(String propertyAddress)
    {
        return address;

    };
    //View number of beds Method
    public int viewBeds()
    {
        return noBeds;
    }
    //View number of bath Method
    public int viewBaths()
    {
        return noBaths;
    }
    //View number of receptions Method
    public int viewReceptions()
    {
        return noReception;
    }
    //View price Method
    public double viewPrice()
    {
        return price;
    }

    // Check Mortgage Method

    public String checkMortgage(double salary) 
    {
        salary = salary * 3;
        if (price <= salary)
        {
            return "Customer qualifies for mortgage";
        }
        else
        {
            return "Unfortunately customer does not qualify for mortgage";
        }
    };

    // method calculate repayment
    public double calcRepayment(int termYears)
    {
        double repayment = 0.00;
        double interest = 0.04;
        termYears = termYears * 12 ;//Convert the term years in months
        interest = price * interest;
        price = price + interest;
        repayment = price / termYears;
      
        return repayment;
    };
    
    
    // property Tax method
    public double propertyTax()
    {
        double taxRate = 0.00;

        if(price <= 100000)
        {
           taxRate = 90.00;
        }
        else if(price > 100000 && price <= 200000)
        {
           taxRate = 225.00;
        }
        else if(price > 200000 && price <= 500000)
        {
           taxRate = 405.00;
        }
        else if(price > 500000 && price <= 1000000){
           taxRate = 1500.00;
        }
        else if(price > 1000000){
           taxRate = 3000.00;
        }
      return taxRate;
    };


}//end class