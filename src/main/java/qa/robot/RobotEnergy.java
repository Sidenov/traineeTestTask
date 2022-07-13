package qa.robot;

public class RobotEnergy extends Robots {

    public RobotEnergy(String move) {
        super(move);
    }

    public void nuclearPower(int year) {
        if (year < 50) {
            System.out.println("бак заправлен");
        } else {
            System.out.println("Заправка не требуется");
        }
    }

    public void gasoline(int volume) {
        if (volume < 10) {
            System.out.println("бак заправлен");
        } else {
            System.out.println("Заправка не требуется");
        }
    }

    public void electricPower(int charge) {
        if (charge < 20) {
            System.out.println("Зарядка произведена");
        } else {
            System.out.println("Подзарядка не требуется");
        }
    }
}
