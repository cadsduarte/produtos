package br.com.api.produtos3.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.produtos3.modelo.ProdutoModelo;

@Repository
public interface ProdutoRepositorio extends CrudRepository <ProdutoModelo, Long> {

    
}
