package ExerciciosParte02.dominio;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<ContaBancaria> contaBancarias;


    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contaBancarias = new ArrayList<>();
    }

    public void adicionarContaBancaria(ContaBancaria contaBancaria) {
        if (!contaBancarias.contains(contaBancaria)) {
            contaBancarias.add(contaBancaria);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<ContaBancaria> getContaBancarias() {
        return contaBancarias;
    }

    public void imprime() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Cpf: "+this.cpf);
        if (!contaBancarias.isEmpty()) {
            System.out.println(contaBancarias);
        }
    }

    @Override
    public String toString() {
        return "Nome: "+this.nome+"\n"
                +"Cpf: "+this.cpf+"\n";
    }
}
