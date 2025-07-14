package br.edu.ifpb.ads.padroes.atv1.rpg.atv1.personagem.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.atv1.personagem.Personagem;

public abstract class CriadorPersonagem {

    public abstract Personagem criarPersonagem(String nome, String raca);

}
