package br.org.libros.biblioteca.model.business.facade;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.org.libros.biblioteca.dto.BibliotecaDto;
import br.org.libros.biblioteca.dto.mapper.IBibliotecaMapper;
import br.org.libros.comum.model.business.facade.AbstractFacade;
import br.org.libros.comum.model.persistence.entity.Biblioteca;

/**
 * 
 * @see br.org.libros.comum.model.business.facade.AbstractFacade
 */
@Named
@RequestScoped
@Transactional
public class BibliotecaBusinessFacade extends AbstractFacade<Biblioteca, BibliotecaDto, Integer> {

	private static final long serialVersionUID = 1L;

	public BibliotecaBusinessFacade() {
		mapper = IBibliotecaMapper.INSTANCE;
	}

}
