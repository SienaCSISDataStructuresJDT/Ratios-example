/**
 * Example Ratios -- the Ratio class
 *
 * This class encapsulates a numerator and denominator and
 * includes the capability to set the numerator or denominator,
 * retrieve the numerator or denominator, retrieve the decimal
 * equivalent of the ratio, and return a "pretty" String 
 * representation of the ratio
 *
 * This version adds a static (class) variable that counts the number
 * of Ratio objects that have been constructed.
 *
 * @author Jim Teresco
 *
 * @version Fall 2020
 */

public class Ratio {

    // instance variables for the numerator and denominator
    private int numerator;
    private int denominator;
    
    // class variable: exactly one copy is in existence, shared among
    // all instances of the class
    private static int countRatiosUsed = 0;

    /**
       Construct a new Ratio object with the given numerator and denominator.

       @param num the numerator
       @param den the denominator
    */
    public Ratio(int num, int den) {
        
        numerator = num;
        denominator = den;

	// update the class variable to indicate we have constructed
	// a Ratio
	countRatiosUsed++;
    }

    /**
       Return the number of Ratio objects ever constructed.

       @return the number of Ratio objects ever constructed.
    */
    public int getCountRatiosUsed() { 
        return countRatiosUsed; 
    };

    /**
       Change the numerator.

       @param num the new numerator
    */
    public void setNumerator(int num) {
        
        numerator = num;
    }

    /**
       Change the denominator.

       @param den the new denominator
    */
    public void setDenominator(int den) {
        
        denominator = den;
    }
    
    /**
       Get the numerator of the Ratio

       @return the numerator
    */
    public int getNumerator() {
        
        return numerator;
    }
    
    /**
       Get the denominator of the Ratio

       @return the denominator
    */
    public int getDenominator() {
        
        return denominator;
    }
    
    /*
      Get the decimal value represented by the Ratio.

      @return the decimal value represented by the Ratio
    */
    public double getDecimalValue() {
        
        return 1.0 * numerator / denominator;
    }
    
    /**
       Return string representation of the Ratio.

       @return the string representation of the Ratio
    */
    public String toString() {
        
        return numerator + "/" + denominator;
    }
}
