package br.edu.ifpb.ads.padroes.atv1.rpg.personagem;

import br.edu.ifpb.ads.padroes.atv1.rpg.equipamento.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamento.Armadura;

public class Personagem implements Cloneable {

    private String nome;
    private String raca;
    private String classe;
    private int forca;
    private int inteligencia;
    private int agilidade;
    private int vida;
    private int mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    public Personagem(String nome, String raca, String classe, int forca, int inteligencia, int agilidade, int vida, int mana, Arma arma, Armadura armadura, String[] habilidades) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.agilidade = agilidade;
        this.vida = vida;
        this.mana = mana;
        this.arma = arma;
        this.armadura = armadura;
        this.habilidades = habilidades;
    }

    public Personagem clone() {
        try {
            Personagem clone = (Personagem) super.clone();
            clone.habilidades = habilidades.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return String.format("%s - %s %s (F:%d, I:%d, A:%d, V:%d, M:%d) Arma:%s Armadura:%s",
                nome, raca, classe, forca, inteligencia, agilidade, vida, mana,
                arma.getNome(), armadura.getNome());
    }
}
