package edu.quinnipiac.workout;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener", "5 Handstand Push-Ups\n10 1-Legged Squats\n15 Pull-Ups"),
            new Workout("Core Agony", "100 Pull-Ups\n100 Push-Ups\n100 Sit-Ups\n100 Squats"),
            new Workout("The Wimp Special", "5 Pull-Ups\n10 Push-Ups\n15 Squats"),
            new Workout("Strength & Length", "500M Run\n21 x 1.5 Pood KettleBall Swing\n21 Pull-Ups")
    };

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return this.name;
    }

    private Workout(String name, String description){
        this.name = name;
        this.description = description;
    }
}
