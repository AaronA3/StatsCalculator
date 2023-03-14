import java.util.Arrays;

/**
 * @file StatsCalculator.java
 * @date 3/10/2023
 * @author Aaron Abrahamsen
 *
 * @description takes an array of values inputed by user or a default array then provides methods to calculate
 * statistical values for an array of numbers.
 */
public class StatsCalculator {

    private final double[] values;  // array of values to be analyzed
    private double[] sortedValues;  // array of sorted values

    /**
     * Constructs a new StatsCalculator object with a default array of size 20
     */
    public StatsCalculator(){
        values = new double[20];
        sortData();
    }

    /**
     * Constructs a new StatsCalculator with a given array of doubles
     *
     * @param values the array of doubles
     */
    public StatsCalculator(double[] values){
        this.values = values;
        sortData();
    }

    /**
     * Sorts the array of values in ascending order.
     */
    public void sortData(){
        sortedValues = values;
        Arrays.sort(sortedValues);
    }

    /**
     * Returns the maximum value in the sorted array
     *
     * @return the maximum value in the array
     */
    public double calculateMax() {
        return sortedValues[sortedValues.length -1];
    }

    /**
     * Returns the minimum value in the sorted array
     *
     * @return the minimum value in the array
     */
    public double calculateMin() {
        return sortedValues[0];
    }

    /**
     * Determines if the length of an array of doubles is even
     *
     * @param list an array of doubles
     * @return true if the length is even, false otherwise
     */
    public boolean isEven(double[] list){
        if (list.length % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns the median value of the sorted array
     *
     * @return the median value of the array
     */
    public double calculateMedian(){
        boolean even = isEven(sortedValues);
        int indexMedian = (int) sortedValues.length / 2;
        double out = 0;
        if (even){
            out = (sortedValues[indexMedian] + sortedValues[indexMedian-1]) / 2;
        } else {
            out = sortedValues[indexMedian];
        }
        return out;
    }

    /**
     * Returns the median value of the given array of doubles
     *
     * @param list the array of doubles
     * @return the median value of the given array
     */
    public double calculateMedian(double[] list) {
        boolean even = isEven(list);
        int indexMedian = list.length / 2;
        double out = 0;
        if (even) {
            out = (list[indexMedian] + list[indexMedian - 1]) / 2;
        } else {
            out = list[indexMedian];
        }
        return out;
    }

    /**

     Calculates the first quartile of the sorted array
     @return the first quartile
     */
    public double calculateFirstQuartile() {
        int indexMedian = (sortedValues.length / 2);
        double[] tempList = new double[indexMedian];
        for (int i = 0; i < indexMedian; i++) {
            tempList[i] = sortedValues[i];
        }
        double out = calculateMedian(tempList);
        return out;
    }

    /**
     Calculates the third quartile of the sorted array
     @return the third quartile
     */
    public double calculateThirdQuartile() {
        boolean even = isEven(sortedValues);
        int indexMedian = (sortedValues.length / 2);
        int j = 0;

        if (even) {
            indexMedian += 0;
        }

        double[] tempList = new double[indexMedian];

        if (even) {
            for (int i = indexMedian; i < sortedValues.length; i++) {
                tempList[j] = sortedValues[i];
                j++;
            }
        } else {
            for (int i = indexMedian + 1; i < sortedValues.length; i++) {
                tempList[j] = sortedValues[i];
                j++;
            }
        }

        double out = calculateMedian(tempList);
        return out;
    }

    /**
     Calculates the sum of the array
     @return the sum
     */
    public double calculateSum() {
        double out = 0;
        for (double a : sortedValues) {
            out += a;
        }
        return out;
    }

    /**
     Calculates the mean of the array
     @return the mean
     */
    public double calculateMean() {
        double sum = calculateSum();
        return sum / sortedValues.length;
    }

    /**
     Prints the original array
     */
    public void print() {
        System.out.print("Your data is: ");
        for (double a : values) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    /**
     Prints the sorted array
     */
    public void printSorted() {
        System.out.print("Your sorted data is: ");
        for (double a : sortedValues) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    /**
     Prints the values of the array. which is the minimum, first quartile, median,
     third quartile, and then maximum
     */
    public void printFiveNumberSummary(){
        System.out.println("The five number summary is: ");
        System.out.println("\t" + "Minimum: " + calculateMin());
        System.out.println("\t" + "First Quartile: " + calculateFirstQuartile());
        System.out.println("\t" + "Median: " + calculateMedian());
        System.out.println("\t" + "Third Quartile: " + calculateThirdQuartile());
        System.out.println("\t" + "Maximum: " + calculateMax());
    }
}