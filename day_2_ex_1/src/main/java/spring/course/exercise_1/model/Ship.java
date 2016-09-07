package spring.course.exercise_1.model;

import lombok.Data;

/**
 * Created by cohenn3 on 9/5/2016.
 */

@Data
public class Ship {

    private Engine engine;

    public void happyInit() {
        System.out.println("I'm Alive !");
    }

    public void sadInit() {
        System.out.println("Oh No !");
    }

    public void sayMyName() {
        System.out.println("my engine is : " + engine.sayMyName());
    }
}
