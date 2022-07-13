package qa.robot;


public class RobotType extends Robots{
    private String skill;


    public RobotType(String move, String skill) {
        super(move);
        this.skill = skill;
    }

    public void battleRobot() {
        System.out.println("Боевой робот");
    }

    public void welderRobot() {
        System.out.println("Сварщик");
    }

    public void cookRobot() {
        System.out.println("Повар");
    }

    public void shoot() {
        System.out.println("Выстрел");
    }

    public void weldParts() {
        System.out.println("Сваривает детали");
    }

    public void cookFood() {
        System.out.println("Готовить");
    }

}
