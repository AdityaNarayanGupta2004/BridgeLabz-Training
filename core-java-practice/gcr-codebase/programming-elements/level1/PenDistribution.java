public class PenDistribution {
    public static void main(String[] args) {
        int pen = 14;
        int student = 3;
        int penDist = pen/student;
        int rem = pen-(penDist*student);
        System.out.println(" The Pen Per Student is "+ penDist+" and the remaining pen not distributed is "+ rem) ;

    }
}
