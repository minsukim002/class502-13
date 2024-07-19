package exam01;

public class Ex08 {
    private int isnn; //도서 번호
    private String title;
    private String author;

    @Override
    public String toString() {
        return "Ex08{" +
                "isnn=" + isnn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Ex08(int isnn, String title, String author) {
        this.isnn = isnn;
        this.title = title;
        this.author = author;



    }
}
