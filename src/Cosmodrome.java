public class Cosmodrome {
    private Rocket rocket;

    public Cosmodrome(Rocket rocket) {
        this.rocket = rocket;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public void start() {
        if(this.rocket.check()) {
            for (int i=9; i >= 0; i--) {
                System.out.println(i);
            }
            this.rocket.start();
        } else {
            System.out.println("Предстартовая проверка ракеты " + this.rocket.getName() + " не пройдена");
        }
    }
}
