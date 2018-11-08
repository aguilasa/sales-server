package br.com.furb.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-11-08T15:20:16.713-0200")
@StaticMetamodel(ProdutoEntity.class)
public class ProdutoEntity_ {
	public static volatile SingularAttribute<ProdutoEntity, Integer> id;
	public static volatile SingularAttribute<ProdutoEntity, CategoriaEntity> categoria;
	public static volatile SingularAttribute<ProdutoEntity, String> nome;
}
