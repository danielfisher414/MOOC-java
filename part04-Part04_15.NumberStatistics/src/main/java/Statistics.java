
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        count = 0;
        sum = 0;
    }

    public void addNumber(int number) {
        this.sum += number;
        count++;
        
    }

    public int getCount() {
        double countAverage = 0.0;
        countAverage += count;
        return count;
    }

    public int sum() {
        double sumAverage = 0.0;
        sumAverage += sum;

        return sum;
    }

    public double average() {
        double average = 0.0;
        double sumAverage = Double.valueOf(sum);
        double countAverage = Double.valueOf(count);
        if (sumAverage > 0 || countAverage > 0) {
            average = sumAverage / countAverage;
        }

        return average;
    }
}
