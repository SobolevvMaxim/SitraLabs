package task2;

public class Psychologist implements Psychology, Therapy{

    @Override
    public int getDiseaseID(int patientID, int symptomID) {
        return patientID;
    }

    @Override
    public void treat(String diagnosis) {
        System.out.println("Treating...");
    }
}
