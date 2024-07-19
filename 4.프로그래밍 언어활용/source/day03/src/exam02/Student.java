package exam02;

public class Student {
    public static int id;
    private String name;
    private String subject;

    public Student(int id, String name, String subject){
        this.id = id;
        this.name = name;
        this.subject = subject;
    }


    @Override
    public String toString() {
        return "Student{" +
                "subject='" + subject + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
