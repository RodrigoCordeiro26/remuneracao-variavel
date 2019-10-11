package br.com.portoseguro.rbc.remuneracaovariavel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.portoseguro.rbc.remuneracaovariavel.Entity.ModadlidadeEntity;

@Repository
public interface ModalidadeDAO extends JpaRepository<ModadlidadeEntity, Long>{

}
