package br.edu.ifpb.ads.padroes.atv1.rpg.personagem.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.Personagem;

public abstract class CriadorPersonagem {

    public abstract Personagem criarPersonagem(String nome, String raca);

}
