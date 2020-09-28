package domain;

public class TrackCoach implements Coach{

    private HappyFortune fortune;

    public HappyFortune getFortune() {
        return fortune;
    }

    public void setFortune(HappyFortune fortune) {
        this.fortune = fortune;
    }

    public TrackCoach() {
    }

    public String getDailyWorkout() {
        return "Track Coach :: Run 5K Hard";
    }

    public String getDailyFortune() {
        return fortune.getFortune();
    }
}
