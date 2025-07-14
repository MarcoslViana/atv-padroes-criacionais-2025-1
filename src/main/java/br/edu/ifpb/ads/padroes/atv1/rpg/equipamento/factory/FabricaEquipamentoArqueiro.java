package br.edu.ifpb.ads.padroes.atv1.rpg.equipamento.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.equipamento.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamento.Armadura;

public class FabricaEquipamentoArqueiro implements FabricaEquipamento {

    public Arma criarArma() { return new Arma("Arco Élfico", 20, "Arco"); }
    public Armadura criarArmadura() { return new Armadura("Armadura de Couro", 12, "Média"); }

}
