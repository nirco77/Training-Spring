package spring.course.exercise_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.course.exercise_1.model.Ship;

/**
 * Created by cohenn3 on 9/7/2016.
 */

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");

        Ship stamShip = ctx.getBean("StamShip", Ship.class);
        stamShip.sayMyName();


        Ship enterShip = ctx.getBean("Enterprise", Ship.class);
        enterShip.sayMyName();

    }

}
