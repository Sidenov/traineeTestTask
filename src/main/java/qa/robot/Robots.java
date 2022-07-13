package qa.robot;

public class Robots {
    private String move;

    public Robots() {
    }

    public Robots(String move) {
        this.move = move;

    }

    public String walk() {return "Ходить";}

    public String drive() {
        return "Ездить";
    }

    public String fly() {
        return "Летать";
    }

}

