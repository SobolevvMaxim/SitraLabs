package task1;

public class TankBiathlon implements Biathlon, RifleShooting, PistolShootings {
    @Override
    public int skiAndShoot(int distance) {
        return distance * 1000;
    }

    @Override
    public int fight(int left, int right) {
        return skiAndShoot(left + right);
    }

    @Override
    public int getSkiDistance(String id) {
        return 0;
    }

    @Override
    public int win(int pricePool, double time) {
        return (int) (pricePool + time);
    }

    @Override
    public int pistolShoot(int distance) {
        return 0;
    }

    @Override
    public int rifleShoot(int distance) {
        return skiAndShoot(distance) / 2;
    }

    @Override
    public int shoot(String id) {
        return skiAndShoot(getSkiDistance(id));
    }
}
