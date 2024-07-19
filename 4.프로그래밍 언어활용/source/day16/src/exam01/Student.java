package exam01;

public class Student {
    private int ban;
    private String name;
    private int score;

    public Student(int ban, String name, int score) {
        this.ban = ban;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Ex08{" +
                "ban=" + ban +
                ", name='" + name + '\'' +
                '}';
    }
    public int getBan(){
        return ban;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
