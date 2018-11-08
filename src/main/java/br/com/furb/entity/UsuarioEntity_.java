package br.com.furb.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-11-08T15:20:16.736-0200")
@StaticMetamodel(UsuarioEntity.class)
public class UsuarioEntity_ {
	public static volatile SingularAttribute<UsuarioEntity, Integer> id;
	public static volatile SingularAttribute<UsuarioEntity, String> usuario;
	public static volatile SingularAttribute<UsuarioEntity, String> senha;
	public static volatile SingularAttribute<UsuarioEntity, String> ativo;
	public static volatile SetAttribute<UsuarioEntity, RepresentanteEntity> representantes;
	public static volatile SetAttribute<UsuarioEntity, RepresentanteEntity> representantes_1;
	public static volatile SetAttribute<UsuarioEntity, FuncaoEntity> funcaos;
	public static volatile SetAttribute<UsuarioEntity, FuncaoEntity> funcaos_1;
}
