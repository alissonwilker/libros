package br.org.libros.biblioteca.model.persistence.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.org.libros.biblioteca.model.persistence.entity.LivroBiblioteca;
import br.org.libros.comum.excecao.EntidadeNaoEncontradaException;

/**
 * 
 * @see br.org.libros.biblioteca.model.persistence.dao.BibliotecaAbstractDao
 */
@Named
@RequestScoped
public class LivroBibliotecaDao extends BibliotecaAbstractDao<LivroBiblioteca, Integer> {
	private static final long serialVersionUID = 1L;

	@Override
	public void remover(LivroBiblioteca entidade) throws EntidadeNaoEncontradaException {
		entityManager.createNativeQuery("delete from BIBLIOTECA_LIVRO where LIVROS_ID = :id")
				.setParameter("id", entidade.getId()).executeUpdate();
		entityManager.flush();
		super.remover(entidade);
	}

}
