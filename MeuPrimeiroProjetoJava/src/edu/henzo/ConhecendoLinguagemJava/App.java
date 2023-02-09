package edu.henzo.ConhecendoLinguagemJava;

public class App {
    public static void main(String[] args){
        System.out.println("Bem vindos a meu primeiro projeto java >>>");
        String nome1 = "Henzo";
        String nome2 = "Farina";

        String nomeCompletro = nomeCompleto(nome1, nome2);
        System.out.println(nomeCompletro);
        System.out.println(nomeCompletro);
        System.out.println(nomeCompletro);

    }

    public static String nomeCompleto(String nome1, String nome2) {
        return nome1 + " "+ nome2;
    }

    
}
