package com.paqueteria.montero.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.paqueteria.montero.app.entity.ClienteEntity;
import com.paqueteria.montero.app.entity.PaqueteEntity;

@Repository
public interface PaqueteRepository extends JpaRepository<PaqueteEntity, Long>{

	List<PaqueteEntity> findByCliente(ClienteEntity cliente);
}
