package br.org.libros.comum.model.business.facade;

import java.io.Serializable;
import java.util.List;

import br.org.libros.comum.exception.EntidadeJaExisteExcecao;
import br.org.libros.comum.exception.EntidadeNaoEncontradaExcecao;

/**
 * Interface de uma fachada para a camada negocial de um módulo. A fachada é o
 * ponto de entrada para a camada negocial do módulo. Normalmente utilizada por
 * Controladores ou pela API.
 *
 * @param <D>
 *            tipo do DTO.
 * @param <PK>
 *            tipo da chave primária da Entidade representada pelo DTO.
 */
public interface IBusinessFacade<D, PK extends Serializable> extends Serializable {
	public D adicionar(D dto) throws EntidadeJaExisteExcecao;

	public List<D> listar();

	public void remover(D dto) throws EntidadeNaoEncontradaExcecao;

	public void remover(PK chavePrimaria) throws EntidadeNaoEncontradaExcecao;

	public D atualizar(D dto) throws EntidadeNaoEncontradaExcecao;

	public D recuperar(PK chavePrimaria) throws EntidadeNaoEncontradaExcecao;

	public D atualizar(PK chavePrimaria, D dto) throws EntidadeNaoEncontradaExcecao;
}
