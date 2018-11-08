package br.com.furb.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-11-08T15:20:16.648-0200")
@StaticMetamodel(FuncaoEntity.class)
public class FuncaoEntity_ {
	public static volatile SingularAttribute<FuncaoEntity, Integer> id;
	public static volatile SingularAttribute<FuncaoEntity, String> nome;
	public static volatile SingularAttribute<FuncaoEntity, String> admin;
	public static volatile SetAttribute<FuncaoEntity, UsuarioEntity> usuarios;
	public static volatile SetAttribute<FuncaoEntity, UsuarioEntity> usuarios_1;
}
