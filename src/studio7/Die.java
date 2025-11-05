public class Die {
    private int sides;

    public Die(int sides) { 
        this.sides = sides;
    }

    public int number() {
        return (int)(Math.random() * sides) + 1;
    }

    public String toString() {
        return "Die with " + sides + " sides";
    }

    public static void main(String[] args) {
        Die d1 = new Die(6);
        Die d2 = new Die(10);

        System.out.println(d1);
        System.out.println("Rolling d1: " + d1.number());
        System.out.println(d2);
        System.out.println("Rolling d2: " + d2.number());

    }

}
