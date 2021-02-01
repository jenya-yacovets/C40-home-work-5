public class Main {
    public static void main(String[] args) {
        Rocket myRocket = new Rocket("Starship", 7000);
        Cosmodrome myCosmodrome = new Cosmodrome(myRocket);

        myCosmodrome.start();
    }
}
