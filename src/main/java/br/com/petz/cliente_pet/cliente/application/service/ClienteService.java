package br.com.petz.cliente_pet.cliente.application.service;

import java.util.List;

import br.com.petz.cliente_pet.cliente.application.api.ClienteListResponse;
import br.com.petz.cliente_pet.cliente.application.api.ClienteResponse;
import br.com.petz.cliente_pet.cliente.application.api.ClienteResquest;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteResquest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();

}
