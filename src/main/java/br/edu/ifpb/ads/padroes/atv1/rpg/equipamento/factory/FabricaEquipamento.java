package br.edu.ifpb.ads.padroes.atv1.rpg.equipamento.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.equipamento.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamento.Armadura;

public interface FabricaEquipamento {

    Arma criarArma();
    Armadura criarArmadura();

}
