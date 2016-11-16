package br.com.furb.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "produto", catalog = "trabalho")
public class ProdutoEntity implements java.io.Serializable {

	private Integer id;
	private CategoriaEntity categoria;
	private String nome;
	private Set<ProdutoCotacaoEntity> produtocotacaos = new HashSet<ProdutoCotacaoEntity>(0);
	private Set<ItemProdutoEntity> itemprodutos = new HashSet<ItemProdutoEntity>(0);
	private Set<EstoqueEntity> estoques = new HashSet<EstoqueEntity>(0);
	private Set<EstoqueEntity> estoques_1 = new HashSet<EstoqueEntity>(0);
	private Set<ItemProdutoEntity> itemprodutos_1 = new HashSet<ItemProdutoEntity>(0);
	private Set<ProdutoCotacaoEntity> produtocotacaos_1 = new HashSet<ProdutoCotacaoEntity>(0);

	public ProdutoEntity() {
	}

	public ProdutoEntity(CategoriaEntity categoria) {
		this.categoria = categoria;
	}

	public ProdutoEntity(CategoriaEntity categoria, String nome, Set<ProdutoCotacaoEntity> produtocotacaos, Set<ItemProdutoEntity> itemprodutos,
			Set<EstoqueEntity> estoques, Set<EstoqueEntity> estoques_1, Set<ItemProdutoEntity> itemprodutos_1,
			Set<ProdutoCotacaoEntity> produtocotacaos_1) {
		this.categoria = categoria;
		this.nome = nome;
		this.produtocotacaos = produtocotacaos;
		this.itemprodutos = itemprodutos;
		this.estoques = estoques;
		this.estoques_1 = estoques_1;
		this.itemprodutos_1 = itemprodutos_1;
		this.produtocotacaos_1 = produtocotacaos_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Categoria_id", nullable = false)
	public CategoriaEntity getCategoria() {
		return this.categoria;
	}

	public void setCategoria(CategoriaEntity categoria) {
		this.categoria = categoria;
	}

	@Column(name = "nome", length = 100)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produto")
	public Set<ProdutoCotacaoEntity> getProdutocotacaos() {
		return this.produtocotacaos;
	}

	public void setProdutocotacaos(Set<ProdutoCotacaoEntity> produtocotacaos) {
		this.produtocotacaos = produtocotacaos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produto")
	public Set<ItemProdutoEntity> getItemprodutos() {
		return this.itemprodutos;
	}

	public void setItemprodutos(Set<ItemProdutoEntity> itemprodutos) {
		this.itemprodutos = itemprodutos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produto")
	public Set<EstoqueEntity> getEstoques() {
		return this.estoques;
	}

	public void setEstoques(Set<EstoqueEntity> estoques) {
		this.estoques = estoques;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produto")
	public Set<EstoqueEntity> getEstoques_1() {
		return this.estoques_1;
	}

	public void setEstoques_1(Set<EstoqueEntity> estoques_1) {
		this.estoques_1 = estoques_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produto")
	public Set<ItemProdutoEntity> getItemprodutos_1() {
		return this.itemprodutos_1;
	}

	public void setItemprodutos_1(Set<ItemProdutoEntity> itemprodutos_1) {
		this.itemprodutos_1 = itemprodutos_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produto")
	public Set<ProdutoCotacaoEntity> getProdutocotacaos_1() {
		return this.produtocotacaos_1;
	}

	public void setProdutocotacaos_1(Set<ProdutoCotacaoEntity> produtocotacaos_1) {
		this.produtocotacaos_1 = produtocotacaos_1;
	}

}
