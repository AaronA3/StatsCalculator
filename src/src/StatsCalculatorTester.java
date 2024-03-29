public class StatsCalculatorTester {

    public static void main(String[] args){
        double[] list = {10.0, 20.0, 5.0, 15.0, 25.0, 30.0, 8.0};
        StatsCalculator statCal = new StatsCalculator(list);
        statCal.print();
        statCal.printSorted();
        statCal.printFiveNumberSummary();

        System.out.println();

        double[] list2 = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0 };
        StatsCalculator statCal2 = new StatsCalculator(list2);
        statCal2.print();
        statCal2.printSorted();
        statCal2.printFiveNumberSummary();

        System.out.println();

        double[] list1 = {10.0, 20.0, 5.0, 15.0, 12.0, 25.0, 30.0, 8.0};
        StatsCalculator statCal1 = new StatsCalculator(list1);
        statCal1.print();
        statCal1.printSorted();
        statCal1.printFiveNumberSummary();

        System.out.println();

        double[] list4 = {10.5, 20.4, 54.5, 15.2, 12.0, 25.15, 31.67, 8.1, 0.45, 1.25};
        StatsCalculator statCal4 = new StatsCalculator(list4);
        statCal4.print();
        statCal4.printSorted();
        statCal4.printFiveNumberSummary();

        System.out.println();

        double[] list5 = {10.5, 11.5};
        StatsCalculator statCal5 = new StatsCalculator(list5);
        statCal5.print();
        statCal5.printSorted();
        statCal5.printFiveNumberSummary();
        System.out.println(statCal5.calculateMean());

        System.out.println();

        double[] list6 = {15.555, 26.295, 58.343, 77.507, 98.342, 4.694, 38.320, 15.653, 74.374, 93.381, 33.596, 40.496,
                39.576, 5.034, 27.797};
        StatsCalculator statCal6 = new StatsCalculator(list6);
        statCal6.print();
        statCal6.printSorted();
        statCal6.printFiveNumberSummary();

        System.out.println();

        double[] list7 = {31.715, 42.361, 79.493, 10.176, 19.038, 64.356, 24.688, 19.369, 60.172, 23.066, 18.576,
                50.688};
        StatsCalculator statCal7 = new StatsCalculator(list7);
        statCal7.print();
        statCal7.printSorted();
        statCal7.printFiveNumberSummary();
        System.out.println(statCal7.calculateMean());

        System.out.println();

        double[ ] data = {1,2,3,4,5,6};

        //create a StatsCalculator object
        StatsCalculator myCalculator = new StatsCalculator(data);

        myCalculator.print();
        myCalculator.sortData();
        myCalculator.printSorted();
        myCalculator.printFiveNumberSummary();
        System.out.println(myCalculator.calculateMean());

        System.out.println();

        StatsCalculator statCal3 = new StatsCalculator();
        statCal3.print();
        statCal3.printSorted();
        statCal3.printFiveNumberSummary();
    }

}
