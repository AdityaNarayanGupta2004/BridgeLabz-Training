public class TemperatureAnalyzer {
    public static void main(String[] args) {
        float[][] tempsData = new float[7][24];
        for(int d = 1; d < 6; d++){
            for(int h = 0; h < 24; h++){
                tempsData[d][h] = 20.0f;
            }
        }
        for(int h = 0; h < 24; h++){
            tempsData[0][h] = 30.0f;
        }
        for(int h = 0; h < 24; h++){
            tempsData[6][h] = 10.0f;
        }
        analyze(tempsData);
    }

    public static void analyze(float[][] temp) {
        int days = temp.length;
        double[] avg = new double[days];
        int hotD = 0;
        int coldD = 0;
        double maxAvg = 0.0;
        double minAvg = 0.0;
        boolean first = true;
        for(int d = 0; d < days; d++) {
            double sum = 0.0;
            for(int h = 0; h < 24; h++) {
                sum = sum + temp[d][h];
            }
            avg[d] = sum / 24.0;
            if(first || avg[d] > maxAvg){
                maxAvg = avg[d];
                hotD = d;
                first = false;
            }
            if(first || avg[d] < minAvg){
                minAvg = avg[d];
                coldD = d;
                first = false;
            }
        }
        System.out.println("Hottest day is at index is: " + hotD);
        System.out.println("Coldest day is at index is: " + coldD);
        System.out.print("Average temperatures per day is : ");
        for(int i = 0; i < avg.length; i++){
            System.out.print(avg[i] + " ");
        }
        System.out.println();
    }
}
