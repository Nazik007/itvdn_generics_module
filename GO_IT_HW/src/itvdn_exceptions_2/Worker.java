package itvdn_exceptions_2;

public class Worker {
    String fio;
    String post;
    String year;


    public Worker(String fio, String post, String year) {
        this.fio = fio;
        this.post = post;
        this.year = year;
    }

    @Override
    public String toString() {
        return "ФИО = " + this.fio + "; Должность = " + this.post + "; Год = " + this.year;
    }
}
