package exam01;

public class Student {
    int id;
    String name;
    String subject;

    public Student(int _id, String _name, String _subject) {
      id = _id;
       name = _name;
       subject = _subject;
    }

    void study() {
        System.out.printf("%d%s가 %s를 공부한다.%n", id, name , subject);
    }
}
