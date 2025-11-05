public class Rectangle {
    private double height;
    private double width;

    // constructor 
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;  
    }  

    public double area() {
        double area = this.height * this.width;
        return area;
    }

    public double perimeter() {
        double perimeter =  2 * this.height + 2 * this.width;
        return perimeter;
    }

    public boolean isSquare() {
        if (this.height == this.width) {
            return true;
        } else {
            return false;
        }
    }

    public boolean sizeCheck(Rectangle other) {
        if (this.area() > other.area()){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(3, 3);

        System.out.println(r1);
        System.out.println("Perimeter: " + r1.perimeter());
        System.out.println("Is r1 smaller than r2? " + r1.sizeCheck(r2));
        System.out.println("Is r2 a square? " + r2.isSquare());
    }

    
}
