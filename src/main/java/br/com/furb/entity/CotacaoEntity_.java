package br.com.furb.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-11-08T15:20:16.596-0200")
@StaticMetamodel(CotacaoEntity.class)
public class CotacaoEntity_ {
	public static volatile SingularAttribute<CotacaoEntity, CotacaoId> id;
	public static volatile SingularAttribute<CotacaoEntity, String> descricao;
	public static volatile SetAttribute<CotacaoEntity, ProdutoCotacaoEntity> produtocotacaos;
}
