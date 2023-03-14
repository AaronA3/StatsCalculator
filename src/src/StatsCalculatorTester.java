public class StatsCalculatorTester {

    public static void main(String[] args){
        double[] list = {10.0, 20.0, 5.0, 15.0, 25.0, 30.0, 8.0};
        StatsCalculator statCal = new StatsCalculator(list);
        statCal.print();
        statCal.printSorted();
        statCal.printFiveNumberSummary();

        System.out.println();

        double[] list1 = {10.0, 20.0, 5.0, 15.0, 12.0, 25.0, 30.0, 8.0};
        StatsCalculator statCal1 = new StatsCalculator(list1);
        statCal1.print();
        statCal1.printSorted();
        statCal1.printFiveNumberSummary();

        System.out.println();

        double[] list2 = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0 };
        StatsCalculator statCal2 = new StatsCalculator(list2);
        statCal2.print();
        statCal2.printSorted();
        statCal2.printFiveNumberSummary();

        System.out.println();

        StatsCalculator statCal3 = new StatsCalculator();
        statCal3.print();
        statCal3.printSorted();
        statCal3.printFiveNumberSummary();
    }

}
