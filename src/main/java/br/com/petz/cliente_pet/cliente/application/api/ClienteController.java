package br.com.petz.cliente_pet.cliente.application.api;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ClienteController implements ClienteAPI {

	@Override
	public ClienteResponse postCliente(ClienteResquest clienteRequest) {
		log.info("[inicia] ClienteController - postCliente");
		log.info("[finaliza] ClienteController - postCliente");
		return null;
	}

}