package ExerciciosParte01.dominio;

public class Estudantes {
    private String name;
    private int age;

    public Estudantes(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return STR."Nome: \{name}\n" +
                STR."Idade: \{age}\n";
    }
}


