package task2;

public abstract class AbdominalSurgery implements Surgery{
    @Override
    public int carryOperation(int patientID, int doctorID) {
        return 1;
    }
}
