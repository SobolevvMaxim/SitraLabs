package task2;

public class Psychiatrist extends Prevention implements Pharmacy, Therapist{
    @Override
    public String getDiagnosis(String symptom) {
        return "get diagnosis from base...";
    }

    @Override
    public int carryOperation(int patientID, int doctorID) {
        return 1;
    }

    @Override
    public int getDiseaseID(int patientID, int symptomID) {
        return patientID;
    }

    @Override
    public void treat(String diagnosis) {
        System.out.println("Treating...");
    }
}
