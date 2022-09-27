package task1;

public class KickBoxing extends Boxing{
    @Override
    public int fight(int left, int right) {
        return super.fight(left, right) * 2;
    }

    @Override
    public int win(int pricePool, double time) {
        return (int) (pricePool * time * 2);
    }
}
