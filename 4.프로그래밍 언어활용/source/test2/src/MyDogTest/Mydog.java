package MyDogTest;

public class Mydog {
String name;
String type;

    public Mydog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Mydog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
