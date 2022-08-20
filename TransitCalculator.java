public class TransitCalculator {
	
	int numDays;
	int numRides;
		
	public static String[] options = {"Pay-per-ride(single ride)", "7-day Unlimited Rides", "30-day Unlimited Rides"};
	public static double[] prices = {2.75, 33.00, 127.00};
	
	public double calculate(int passLength, double priceOption){
	    int days = numDays;
	    double price = 0;
	    while (days > passLength){
	      price = price + priceOption;
	      days = days - passLength;
	    }
	    if (days != passLength){
	      price = price + priceOption;
	    }
	    return price;
	  }
	  
	  public double unlimited30Price(){
	    double price = calculate(30, prices[2]);
	    return price / numRides;
	  }

	  public double unlimited7Price(){
	    double price = calculate(7, prices[1]);
	    return price / numRides;
	  }

	  public void getBestFare(double a, double b, double c){
	    double[] listOfPrices = {a, b, c};
	    double cheapestPrice = a; int cheapestFareOption = 0;
	      for (int i=1; i!=3; i++){
	        if (listOfPrices[i] < cheapestPrice){
	          cheapestPrice = listOfPrices[i];
	          cheapestFareOption = i;
	        }
	      }
	      cheapestPrice = ((double)(int)(cheapestPrice*100))/100.0;
	      System.out.println("You should get the " + options[cheapestFareOption] + " option at $" + cheapestPrice + " per ride.");
	  }

	  public static void main(String[] args){
		TransitCalculator results = new TransitCalculator();
	    results.getBestFare(prices[0], results.unlimited7Price(), results.unlimited30Price());
	  }
	}