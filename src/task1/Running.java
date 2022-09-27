package task1;

public abstract class Running implements Race{
    @Override
    public int getDistance(String runnerID) {
        return 100;
    }

    abstract int run(int runnerID);
}
