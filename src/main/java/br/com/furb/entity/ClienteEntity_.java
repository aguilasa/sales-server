package br.com.furb.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-11-08T15:20:16.581-0200")
@StaticMetamodel(ClienteEntity.class)
public class ClienteEntity_ {
	public static volatile SingularAttribute<ClienteEntity, Integer> id;
	public static volatile SingularAttribute<ClienteEntity, String> nome;
	public static volatile SingularAttribute<ClienteEntity, String> tipo;
	public static volatile SingularAttribute<ClienteEntity, String> cnpjCpf;
	public static volatile SetAttribute<ClienteEntity, PedidoEntity> pedidos;
	public static volatile SetAttribute<ClienteEntity, PedidoEntity> pedidos_1;
}
