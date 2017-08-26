package br.org.libros.livro.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.org.libros.comum.dto.mapper.IGenericMapper;
import br.org.libros.livro.dto.LivroDto;
import br.org.libros.livro.model.persistence.entity.Livro;

/**
 * 
 * @see br.org.libros.comum.dto.mapper.IGenericMapper
 */
@Mapper
public interface ILivroMapper extends IGenericMapper<Livro, LivroDto> {
	ILivroMapper INSTANCE = Mappers.getMapper(ILivroMapper.class);

}
