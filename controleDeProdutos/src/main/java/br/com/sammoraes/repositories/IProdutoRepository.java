package br.com.sammoraes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.sammoraes.entities.Produto;

@Repository
public interface IProdutoRepository extends CrudRepository<Produto, Integer>{

}
