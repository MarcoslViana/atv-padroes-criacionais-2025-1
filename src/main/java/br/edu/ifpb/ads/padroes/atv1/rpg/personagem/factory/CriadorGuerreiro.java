package br.edu.ifpb.ads.padroes.atv1.rpg.personagem.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.equipamento.factory.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.builder.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.*;

public class CriadorGuerreiro extends CriadorPersonagem {

    public Personagem criarPersonagem(String nome, String raca) {
        FabricaEquipamento fabrica = new FabricaEquipamentoGuerreiro();
        return new PersonagemBuilder()
                .nome(nome)
                .raca(raca)
                .classe("Guerreiro")
                .forca(15)
                .inteligencia(8)
                .agilidade(10)
                .vida(120)
                .mana(30)
                .arma(fabrica.criarArma())
                .armadura(fabrica.criarArmadura())
                .habilidades(new String[]{"Investida", "Bloqueio"})
                .build();
    }

}
