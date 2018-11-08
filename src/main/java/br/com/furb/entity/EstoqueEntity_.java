package br.com.furb.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-11-08T15:20:16.624-0200")
@StaticMetamodel(EstoqueEntity.class)
public class EstoqueEntity_ {
	public static volatile SingularAttribute<EstoqueEntity, EstoqueId> id;
	public static volatile SingularAttribute<EstoqueEntity, ProdutoEntity> produto;
	public static volatile SingularAttribute<EstoqueEntity, RepresentanteEntity> representante;
	public static volatile SingularAttribute<EstoqueEntity, Integer> quantidade;
}
