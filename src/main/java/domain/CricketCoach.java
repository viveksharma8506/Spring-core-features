package domain;

public class CricketCoach implements Coach {
    //Constructor Injection
    private HappyFortune happyFortune;

   /* public CricketCoach() {
    }*/

    public CricketCoach(HappyFortune happyFortune) {
        this.happyFortune = happyFortune;
    }

    public String getDailyWorkout() {
        return "Play 3 overs ";
    }

    public String getDailyFortune() {
        return  happyFortune.getFortune();
    }
}
