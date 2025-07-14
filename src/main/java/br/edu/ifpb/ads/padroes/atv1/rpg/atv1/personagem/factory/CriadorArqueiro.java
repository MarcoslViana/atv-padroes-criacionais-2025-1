package br.edu.ifpb.ads.padroes.atv1.rpg.atv1.personagem.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.atv1.equipamento.factory.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.atv1.personagem.builder.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.atv1.personagem.*;

public class CriadorArqueiro extends CriadorPersonagem {

    public Personagem criarPersonagem(String nome, String raca) {
        FabricaEquipamento fabrica = new FabricaEquipamentoArqueiro();
        return new PersonagemBuilder()
                .nome(nome)
                .raca(raca)
                .classe("Arqueiro")
                .forca(10)
                .inteligencia(12)
                .agilidade(16)
                .vida(100)
                .mana(70)
                .arma(fabrica.criarArma())
                .armadura(fabrica.criarArmadura())
                .habilidades(new String[]{"Tiro Certeiro", "Chuva de Flechas"})
                .build();
    }

}
