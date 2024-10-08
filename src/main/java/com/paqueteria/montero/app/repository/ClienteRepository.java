package com.paqueteria.montero.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.paqueteria.montero.app.entity.ClienteEntity;


@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long>{
	
	ClienteEntity findByCorreo(String correo);

}
