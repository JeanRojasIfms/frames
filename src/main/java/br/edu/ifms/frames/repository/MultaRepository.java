package br.edu.ifms.frames.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.frames.model.Multa;

@Repository
public interface MultaRepository extends JpaRepository<Multa, Integer>{

}
