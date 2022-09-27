package task1;

public class MuayThai extends Boxing{
    @Override
    public int fight(int left, int right) {
        return super.fight(left, right) * 3;
    }

    @Override
    public int win(int pricePool, double time) {
        return (int) (pricePool * time * 3);
    }
}
