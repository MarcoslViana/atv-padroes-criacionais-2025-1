package br.edu.ifpb.ads.padroes.atv1.rpg.equipamento.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.equipamento.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamento.Armadura;

public class FabricaEquipamentoMago implements FabricaEquipamento {

    public Arma criarArma() { return new Arma("Cajado Mágico", 15, "Cajado"); }
    public Armadura criarArmadura() { return new Armadura("Vestes Mágicas", 8, "Leve"); }

}
