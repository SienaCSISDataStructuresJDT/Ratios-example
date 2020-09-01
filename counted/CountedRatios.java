/**
 * Example Ratios -- a main method that demonstrates the use of
 * the Ratio class (also provided in this project)
 *
 * Testing the "counted" version.
 *
 * @author Jim Teresco, based on an example by Prof. White
 * @version Fall 2020
 */

public class CountedRatios {

    public static void main(String[] args) {
        Ratio[] ratioArr = new Ratio[3];
        ratioArr[0] = new Ratio(1, 2);
        ratioArr[1] = new Ratio(3, 4);
        
        System.out.println(ratioArr[0].getCountRatiosUsed());
        System.out.println(ratioArr[1].getCountRatiosUsed());        
    }
}
