package br.com.petz.cliente_pet.cliente.pet.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.petz.cliente_pet.cliente.pet.domain.Porte;
import br.com.petz.cliente_pet.cliente.pet.domain.SexoPet;
import br.com.petz.cliente_pet.cliente.pet.domain.TipoPet;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class PetResquest {
	@NotBlank
	private String nomePet;
	@NotNull
	@Enumerated(EnumType.STRING)
	private Porte porte;
	@NotNull
	private TipoPet tipo;
	private String microchip;
	@NotBlank
	private String raca;
	@NotNull
	private SexoPet sexo;
	private String pelagemCor;
	@NotNull
	private LocalDate dataNascimento;
	private String rga;
	private Integer peso;
	
}
