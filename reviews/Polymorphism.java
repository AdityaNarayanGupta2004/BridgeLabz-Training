public class Polymorphism {
    int s ;
    int d;

    void display(){
        System.out.println("a");
    }
    // applying overloading
    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }

    public float add(float a, float b){
        return a+b;
    }

    // Applying overriding

    static class ridding extends Polymorphism{
        void display(){
            System.err.println("here s is sum and d is divide");
        }
    }

    public static void main(String[] args) {
        Polymorphism poly = new Polymorphism();
        poly.display();

        ridding  obj = new ridding();
        obj.display();

        int x = poly.add(2, 3);
        double y = poly.add(2.5, 3.5);
        float z = poly.add(2.5f, 3.5f);

        System.out.println(x + " " + y + " " + z);
    }
}
