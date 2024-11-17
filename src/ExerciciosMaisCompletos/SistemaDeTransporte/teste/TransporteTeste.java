package ExerciciosMaisCompletos.SistemaDeTransporte.teste;

import ExerciciosMaisCompletos.SistemaDeTransporte.dominio.*;

public class TransporteTeste {
    public static void main(String[] args) {
        Transporte transporte = new Onibus(50, "Urupiara");
        Transporte transporte1 = new Aviao(300, "São Paulo");
        Transporte transporte2 = new Trem(200, "Osasco");
        Transporte transporte3 = new Onibus(250, "São Paulo");
        CompanhiaTransporte companhiaTransporte = new CompanhiaTransporte();
        companhiaTransporte.adicionarTransporte(transporte);
        companhiaTransporte.adicionarTransporte(transporte1);
        companhiaTransporte.adicionarTransporte(transporte2);
        companhiaTransporte.adicionarTransporte(transporte3);
        companhiaTransporte.listarTransportes();
        System.out.println("---------------------------");
        companhiaTransporte.listarViegensComOMesmoDestino("São Paulo");
        System.out.println("----------------------------");
        transporte1.iniciarViagem();
        System.out.println("----------------------------");
        transporte.iniciarViagem();
        System.out.println("----------------------------");
        transporte2.iniciarViagem();
        System.out.println("----------------------------");
        companhiaTransporte.calcularCapacidadeTotal();
    }
}
