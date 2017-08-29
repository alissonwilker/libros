package br.org.libros.biblioteca.model.persistente.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.org.libros.comum.model.persistence.entity.IEntidade;

/**
 * Entidade que representa uma Biblioteca.
 *
 */
@Entity
@Table(name = "Biblioteca", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
public class Biblioteca implements IEntidade {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, unique = true, length = 10)
	@NotNull
	@Max(Integer.MAX_VALUE)
	private int id;

	@Column(name = "NOME", length = 20, unique = true, nullable = false)
	@NotNull
	@Size(max = 20)
	private String nome;

	@OneToMany(fetch = FetchType.LAZY, orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "biblioteca")
	private Set<Livro> livros;

	@Valid
	public Biblioteca() {
	}

	@Valid
	public Biblioteca(String nome) {
		setNome(nome);
	}

	public int getId() {
		return id;
	}

	public void setId(@NotNull @Max(Integer.MAX_VALUE) int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(@NotNull @Size(max = 20) String nome) {
		this.nome = nome;
	}

	public Set<Livro> getLivros() {
		return livros;
	}

	public void setLivros(Set<Livro> livros) {
		this.livros = livros;
	}

}