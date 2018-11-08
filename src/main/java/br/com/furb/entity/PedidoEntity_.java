package br.com.furb.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-11-08T15:20:16.682-0200")
@StaticMetamodel(PedidoEntity.class)
public class PedidoEntity_ {
	public static volatile SingularAttribute<PedidoEntity, Integer> id;
	public static volatile SingularAttribute<PedidoEntity, ClienteEntity> cliente;
	public static volatile SingularAttribute<PedidoEntity, RepresentanteEntity> representante;
	public static volatile SingularAttribute<PedidoEntity, Date> dataPedido;
	public static volatile SingularAttribute<PedidoEntity, Date> prazoPedido;
	public static volatile SingularAttribute<PedidoEntity, Date> entregaPedido;
	public static volatile SingularAttribute<PedidoEntity, String> entregue;
	public static volatile SetAttribute<PedidoEntity, ItemProdutoEntity> itemprodutos;
	public static volatile SetAttribute<PedidoEntity, ItemProdutoEntity> itemprodutos_1;
}
