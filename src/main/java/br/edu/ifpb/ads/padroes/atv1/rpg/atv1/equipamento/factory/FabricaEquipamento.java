package br.edu.ifpb.ads.padroes.atv1.rpg.atv1.equipamento.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.atv1.equipamento.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.atv1.equipamento.Armadura;

public interface FabricaEquipamento {

    Arma criarArma();
    Armadura criarArmadura();

}
