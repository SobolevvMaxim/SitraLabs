package task1;

public class JiuJitsu implements Fighting{
    @Override
    public int fight(int left, int right) {
        return (left + right) * (left + right);
    }

    @Override
    public int win(int pricePool, double time) {
        return (int) (pricePool * time);
    }
}
