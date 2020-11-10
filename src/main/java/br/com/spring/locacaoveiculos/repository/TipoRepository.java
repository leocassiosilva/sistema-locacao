package br.com.spring.locacaoveiculos.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.locacaoveiculos.model.Tipo;

@Repository
public interface TipoRepository extends JpaRepository<Tipo, Long>{
	Optional<Tipo> findById(Long id);
}
