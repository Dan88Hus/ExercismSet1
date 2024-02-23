package booleaN;

public class AnnalynsInfiltration {

	public static void main(String[] args) {
//		boolean knightIsAwake = true;
//		boolean result = canFastAttack(knightIsAwake);
//		System.out.println("result: "+ result);
		
		boolean knightIsAwake = false;
		boolean archerIsAwake = true;
		boolean prisonerIsAwake = false;
		boolean result = canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);
		System.out.println("result: "+ result);
		
	}
		
	    public static boolean canFastAttack(boolean knightIsAwake) {
	    	return !knightIsAwake;
	        
	     }

	    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
//	        Spy: the group can be spied upon if at least one of them is awake.
			return knightIsAwake || archerIsAwake || prisonerIsAwake;
	    }

	    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
//	    	if the prisoner is awake and the archer is sleeping, 
	    	
	    	 return prisonerIsAwake && !archerIsAwake;
	    }

	    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
/*
If Annalyn has her pet dog with her she can rescue the prisoner if the archer is asleep. 
The knight is scared of the dog and the archer will not have time to get ready before Annalyn and the prisoner can escape.
*/
	    	/*
	    	 * If Annalyn does not have her dog then she and the prisoner must be very sneaky! 
	    	 * Annalyn can free the prisoner 
	    	 * if the prisoner is awake and the knight and archer are both sleeping, 
	    	 * but if the prisoner is sleeping they can't be rescued: the prisoner would be startled by Annalyn's sudden appearance and wake up 
	    	 * the knight and archer
	    	 * 
	    	 */
	    	
	    	
	    	   if (!petDogIsPresent && prisonerIsAwake) {
	    	        // Annalyn does not have her dog, she and the prisoner must be very sneaky
	    	        return !knightIsAwake && !archerIsAwake;
	    	    } else if (petDogIsPresent) {
	    	        // Annalyn has her dog, she can rescue the prisoner if the archer is asleep
	    	        return !archerIsAwake;
	    	    } else {
	    	        // Pet dog is absent and prisoner is sleeping, prisoner cannot be freed
	    	        return false;
	    	    }
	    	   
	    	   /*
	    	    *     return (!petDogIsPresent && prisonerIsAwake) ? (!knightIsAwake && !archerIsAwake) : 
	    	    *     (petDogIsPresent ? !archerIsAwake : false);
	    	    */
	    }
	    


}
