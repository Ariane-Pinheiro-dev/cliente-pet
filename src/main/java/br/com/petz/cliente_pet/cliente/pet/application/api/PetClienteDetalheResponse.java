package br.com.petz.cliente_pet.cliente.pet.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.petz.cliente_pet.cliente.pet.domain.Porte;
import br.com.petz.cliente_pet.cliente.pet.domain.SexoPet;
import br.com.petz.cliente_pet.cliente.pet.domain.TipoPet;
import lombok.Value;

@Value
public class PetClienteDetalheResponse {
	private UUID idPet;
	private UUID idClienteTutor;
	private String nomePet;
	private Porte porte;
	private TipoPet tipo;
	private String microchip;
	private String raca;
	private SexoPet sexo;
	private String pelagemCor;
	private LocalDate dataNascimento;
	private String rga;
	private Integer peso;
}
