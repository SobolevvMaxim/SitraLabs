package task2;

public class Psychotherapist extends Psychologist implements Therapist{

    @Override
    public String getDiagnosis(String symptom) {
        return "...";
    }

    @Override
    public void treat(String diagnosis) {
        System.out.println("Treating...");
    }
}
