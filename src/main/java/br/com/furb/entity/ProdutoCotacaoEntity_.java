package br.com.furb.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-11-08T15:20:16.693-0200")
@StaticMetamodel(ProdutoCotacaoEntity.class)
public class ProdutoCotacaoEntity_ {
	public static volatile SingularAttribute<ProdutoCotacaoEntity, ProdutoCotacaoId> id;
	public static volatile SingularAttribute<ProdutoCotacaoEntity, CotacaoEntity> cotacao;
	public static volatile SingularAttribute<ProdutoCotacaoEntity, ProdutoEntity> produto;
	public static volatile SingularAttribute<ProdutoCotacaoEntity, Float> valor;
}
