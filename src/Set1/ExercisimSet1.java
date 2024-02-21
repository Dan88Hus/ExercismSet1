
package Set1;


public class ExercisimSet1 {

	public static void main(String[] args) {
		    
		class LogLevels {
		    
		    public static String message(String logLine) {
		      
		        String[] logLineSplit = logLine.split(":");
		        String logLineSplitLastWord = logLineSplit[1].trim();
		        System.out.println(logLineSplitLastWord);
		        return logLineSplitLastWord;
		    }

		    public static String logLevel(String logLine) {
		    	String[] logLineSplit = logLine.split("]");
		    	String logLineSplitLastWord = logLineSplit[0].trim();
		    	String logLineSplitFirst = logLineSplitLastWord.replace("[","").toLowerCase();
		    	return logLineSplitFirst;
		    }

		    public static String reformat(String logLine) {
		     String warningLabel = logLevel(logLine);
		     String[] logLineSplit = logLine.split(":");
		     String logLineTrim = logLineSplit[1].trim();
		     System.out.println(logLineTrim);
		     System.out.println(warningLabel);
		     String joinLogLine = logLineTrim + " " + "(" + warningLabel + ")";
		     System.out.println(joinLogLine);
		     return logLineTrim;
		     
		    }	    
		}
		
		LogLevels.reformat("[ERROR]: Invalid operation");

	}

}

