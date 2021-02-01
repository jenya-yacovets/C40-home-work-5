import java.util.Random;

public class Rocket {
    private String name;
    private int weight;

    public Rocket(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean check() {
        Random random = new Random();
        return random.nextInt() % 2 == 0;
    }

    public void start() {
        System.out.println("Ракета " + this.name + " успешно стартанула с грузом в " + this.weight + "т.");
    }
}
