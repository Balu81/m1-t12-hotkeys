public class Ai95Calculator {
    double ai92Price = 46.35;
    double tax = 0.14;
    double fullPrice = ai92Price * (1 + tax);

    public double calculateLoop(double volume) {
        return volume * fullPrice;
    }
}
