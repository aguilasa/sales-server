package br.com.furb.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-11-08T15:20:16.725-0200")
@StaticMetamodel(RepresentanteEntity.class)
public class RepresentanteEntity_ {
	public static volatile SingularAttribute<RepresentanteEntity, Integer> id;
	public static volatile SingularAttribute<RepresentanteEntity, String> nome;
	public static volatile SingularAttribute<RepresentanteEntity, String> cpf;
	public static volatile SetAttribute<RepresentanteEntity, EstoqueEntity> estoques;
	public static volatile SetAttribute<RepresentanteEntity, PedidoEntity> pedidos;
	public static volatile SetAttribute<RepresentanteEntity, PedidoEntity> pedidos_1;
	public static volatile SetAttribute<RepresentanteEntity, EstoqueEntity> estoques_1;
	public static volatile SetAttribute<RepresentanteEntity, UsuarioEntity> usuarios;
	public static volatile SetAttribute<RepresentanteEntity, UsuarioEntity> usuarios_1;
}
