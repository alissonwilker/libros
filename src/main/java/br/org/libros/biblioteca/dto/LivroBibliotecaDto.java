package br.org.libros.biblioteca.dto;

import br.org.libros.comum.dto.IDto;

/**
 * DTO que representa a Entidade
 * {@link br.org.libros.biblioteca.model.persistente.entity.LivroBiblioteca Livro}.
 *
 */
public class LivroBibliotecaDto implements IDto {

	private static final long serialVersionUID = 1L;

	private int id;
	
	private String nome;
	
	private String isbn;

	public LivroBibliotecaDto() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
