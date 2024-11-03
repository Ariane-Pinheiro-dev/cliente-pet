package br.com.petz.cliente_pet.cliente.pet.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;

import br.com.petz.cliente_pet.cliente.application.api.ClienteAlteracaoResquest;
import br.com.petz.cliente_pet.cliente.application.api.ClienteResquest;
import br.com.petz.cliente_pet.cliente.domain.Sexo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idPet", updatable = false, unique = true, nullable = false)
	private UUID idPet;
	@NotBlank
	private String nomePet;
	@Enumerated(EnumType.STRING)
	@NotBlank
	@Email
	@Column(unique = true)
	private Porte porte;
	@Column(unique = true)
	private TipoPet tipo;
	private String microchip;
	private String raca;
	@Enumerated(EnumType.STRING)
	private SexoPet sexo;
	private String pelagemCor;
	@NotNull
	private LocalDate dataNascimento;
	private String rga;
	private Integer peso;
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
}
