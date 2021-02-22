package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie16;

public enum Runner {

    BEGINNER(1200, 2500),
    INTERMEDIATE(800, 1100),
    ADVANCED(240, 400);

    private final int minMarathonRunningTime;
    private final int maxMarathonRunningTime;

    Runner(int minMarathonRunningTime, int maxMarathonRunningTime) {
        this.minMarathonRunningTime = minMarathonRunningTime;
        this.maxMarathonRunningTime = maxMarathonRunningTime;
    }

    public static Runner getFitnessLevel(int time) {

        if (time >= BEGINNER.minMarathonRunningTime) {
            return BEGINNER;
        }
        if (time >= INTERMEDIATE.minMarathonRunningTime
                && time <= INTERMEDIATE.maxMarathonRunningTime) {
            return INTERMEDIATE;
        }
        if (time <= ADVANCED.maxMarathonRunningTime) {
            return ADVANCED;
        } else {
            return INTERMEDIATE;
        }
    }
}
