public class Race {
    String name;
    int distance;
    Race () {
        name = "";
        distance = 0;
    }

    void checkLeader (Car car) {
        int distance = 24 * car.speed;
        if (distance > this.distance) {
            this.distance = distance;
            this.name = car.name;
        }
    }
}
