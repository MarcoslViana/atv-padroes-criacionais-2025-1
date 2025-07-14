package br.edu.ifpb.ads.padroes.atv1.rpg.equipamento.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.equipamento.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamento.Armadura;

public class FabricaEquipamentoGuerreiro implements FabricaEquipamento {

    public Arma criarArma() { return new Arma("Espada de Ferro", 25, "Espada"); }
    public Armadura criarArmadura() { return new Armadura("Armadura de Placas", 20, "Pesada"); }

}
