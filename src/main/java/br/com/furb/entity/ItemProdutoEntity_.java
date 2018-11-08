package br.com.furb.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-11-08T15:20:16.660-0200")
@StaticMetamodel(ItemProdutoEntity.class)
public class ItemProdutoEntity_ {
	public static volatile SingularAttribute<ItemProdutoEntity, ItemProdutoId> id;
	public static volatile SingularAttribute<ItemProdutoEntity, PedidoEntity> pedido;
	public static volatile SingularAttribute<ItemProdutoEntity, ProdutoEntity> produto;
	public static volatile SingularAttribute<ItemProdutoEntity, Integer> quantidade;
	public static volatile SingularAttribute<ItemProdutoEntity, Float> preco;
}
