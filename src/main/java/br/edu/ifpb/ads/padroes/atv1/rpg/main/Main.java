package br.edu.ifpb.ads.padroes.atv1.rpg.main;

import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.factory.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.*;

public class Main {
    public static void main(String[] args) {

        CriadorPersonagem criadorGuerreiro = new CriadorGuerreiro();
        CriadorPersonagem criadorMago = new CriadorMago();
        CriadorPersonagem criadorArqueiro = new CriadorArqueiro();

        Personagem guerreiro = criadorGuerreiro.criarPersonagem("Arthur", "Humano");
        Personagem mago = criadorMago.criarPersonagem("Merlin", "Elfo");
        Personagem arqueiro = criadorArqueiro.criarPersonagem("Legolas", "Elfo");
        Personagem guerreiro2 = criadorGuerreiro.criarPersonagem("Gerald", "Orc");

        System.out.println(guerreiro);
        System.out.println(mago);
        System.out.println(arqueiro);
        System.out.println(guerreiro2);

        Personagem clone = guerreiro.clone();
        Personagem clone2 = mago.clone();

        System.out.println("Clone1: " + clone);
        System.out.println("Clone2: " + clone2);

    }

}
