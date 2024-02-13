package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int printGreatest = 0;
        printGreatest = (first > second && first > third) ? first :(second > first && second > third) || (third > first && third > second)? second : third;
        System.out.println(printGreatest);
    }
}
