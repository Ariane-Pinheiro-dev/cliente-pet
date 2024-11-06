package br.com.petz.cliente_pet.cliente.pet.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.petz.cliente_pet.cliente.pet.domain.Pet;

public interface PetSpringDataJPARepository extends JpaRepository<Pet, UUID> {
	

}
