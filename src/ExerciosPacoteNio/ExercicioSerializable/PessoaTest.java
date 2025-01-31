package ExerciosPacoteNio.ExercicioSerializable;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PessoaTest {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa pessoa = new Pessoa("Henrique", 20);
        Pessoa pessoa2 = new Pessoa("José", 28);
        Pessoa pessoa3 = new Pessoa("Lucas", 25);

        pessoas.add(pessoa);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        try {
            serializar(pessoas);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(pessoa);
        System.out.println(" ");

        try {
            deserializar();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    private static void serializar(List<Pessoa> pessoas) throws IOException {
        Path path = Paths.get("pasta/pessoa.ser");

        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(pessoas);
            System.out.println("Serialização concluída");
        }
    }

    private static void deserializar() throws IOException, ClassNotFoundException {
        Path path = Paths.get("pasta/pessoa.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            List<Pessoa> pessoas = (List<Pessoa>) ois.readObject();

            System.out.println(pessoas);
        }
    }
}
