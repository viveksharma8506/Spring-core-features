import domain.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyCricketApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Coach theCoach= applicationContext.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
    }
}
