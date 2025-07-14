package br.edu.ifpb.ads.padroes.atv1.rpg.personagem.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.equipamento.factory.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.builder.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.*;

public class CriadorMago extends CriadorPersonagem {

    public Personagem criarPersonagem(String nome, String raca) {
        FabricaEquipamento fabrica = new FabricaEquipamentoMago();
        return new PersonagemBuilder()
                .nome(nome)
                .raca(raca)
                .classe("Mago")
                .forca(6)
                .inteligencia(18)
                .agilidade(8)
                .vida(80)
                .mana(150)
                .arma(fabrica.criarArma())
                .armadura(fabrica.criarArmadura())
                .habilidades(new String[]{"Bola de Fogo", "Cura"})
                .build();
    }

}
