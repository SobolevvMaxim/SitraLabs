package task1;

public class Paintball extends Running implements Biathlon {
    @Override
    public int getDistance(String runnerID) {
        return 1000;
    }

    @Override
    int run(int runnerID) {
        System.out.println(runnerID + " is running");
        return getDistance(String.valueOf(runnerID));
    }

    @Override
    public int skiAndShoot(int distance) {
        return distance * 100;
    }

    @Override
    public int getSkiDistance(String id) {
        return getDistance(id);
    }

    @Override
    public int win(int pricePool, double time) {
        return (int) ((pricePool + time) * 2);
    }

    @Override
    public int shoot(String id) {
        return skiAndShoot(getSkiDistance(id));
    }
}
