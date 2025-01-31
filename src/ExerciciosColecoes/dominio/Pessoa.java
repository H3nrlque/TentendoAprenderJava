package ExerciciosColecoes.dominio;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    @Override
    public int compareTo(Pessoa o) {
        return Integer.compare(idade, o.getIdade());
    }

    @Override
    public int hashCode() {
        return this.cpf.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Pessoa pessoa = (Pessoa) obj;
        return cpf != null && cpf.equals(pessoa.cpf);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
               // ", cpf='" + cpf + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    //public String getCpf() {
      //  return cpf;
    //}

    //public void setCpf(String cpf) {
     //   this.cpf = cpf;
    //}
}
