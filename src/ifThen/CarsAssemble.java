package ifThen;

public class CarsAssemble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double productionRatePerHour2 = productionRatePerHour(6);
		System.out.println(productionRatePerHour2);
		
		int productionRatePerMin3 = workingItemsPerMinute(6);
		System.out.println(productionRatePerMin3);
	}
	
    public static double productionRatePerHour(int speed) {
   /*     
   *     At its lowest speed (1), 221 cars are produced each hour. 
   *     The production increases linearly with the speed. 
   *     So with the speed set to 4, it should produce 4 * 221 = 884 cars per hour. 
   */   
    	double carProduced = 0.0;
    	if (speed <= 4 || speed == 1) {
    		return carProduced = speed*221;
    	} else if (speed == 5 || speed <= 8) {
    	  	return carProduced =  (221*speed)*0.90;
    	} else if (speed == 9) {
    		return carProduced = (221*speed)*0.80;
    	} else if (speed == 10) {
    		return carProduced = (221*speed)*0.77;
    	}
	
    	return carProduced;
    }

    public static int workingItemsPerMinute(int speed) {
        int productionRatePerMin2 = (int) (CarsAssemble.productionRatePerHour(speed) / 60) ;
        
        return productionRatePerMin2;
    }

}
