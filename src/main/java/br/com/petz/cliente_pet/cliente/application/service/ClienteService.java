package br.com.petz.cliente_pet.cliente.application.service;

import br.com.petz.cliente_pet.cliente.application.api.ClienteResponse;
import br.com.petz.cliente_pet.cliente.application.api.ClienteResquest;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteResquest clienteRequest);

}
