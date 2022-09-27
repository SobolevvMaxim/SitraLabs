package task1;

public abstract class Boxing implements Fighting{
    @Override
    public int fight(int left, int right) {
        return left + right;
    }
}
