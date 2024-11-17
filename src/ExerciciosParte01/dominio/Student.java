package ExerciciosParte01.dominio;

public class Student {
    private String name;
    private int id;
    double grade;

    public Student() {
    }

    public Student(String name, int id, double grade) {
        this();
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Dados do Estudantes: \n"
                +"Nome: "+name+"\n"
                +"Id: "+id+"\n"
                +"Grade: "+grade;
    }
}
