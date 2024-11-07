package br.com.petz.cliente_pet.cliente.pet.application.service;

import java.util.List;
import java.util.UUID;

import br.com.petz.cliente_pet.cliente.pet.application.api.PetClienteDetalheResponse;
import br.com.petz.cliente_pet.cliente.pet.application.api.PetClienteListResponse;
import br.com.petz.cliente_pet.cliente.pet.application.api.PetResponse;
import br.com.petz.cliente_pet.cliente.pet.application.api.PetResquest;
import jakarta.validation.Valid;

public interface PetService {
	PetResponse criaPet(UUID idCliente, @Valid PetResquest petRequest);
	List<PetClienteListResponse> buscaPetsDoClienteComID(UUID idCliente);
	PetClienteDetalheResponse buscaPetDoClienteComID(UUID idCliente, UUID idPet);
	void deletaPetDoClienteComID(UUID idCliente, UUID idPet);

}
