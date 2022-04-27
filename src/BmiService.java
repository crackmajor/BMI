public class BmiService {
    public double calculate(double massa, double rost) {
        double index = massa / (rost * rost);
        return index;

    }
}
