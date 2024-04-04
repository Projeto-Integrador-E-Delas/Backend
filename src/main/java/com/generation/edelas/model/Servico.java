package com.generation.edelas.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_servicos")
public class Servico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo nome é Obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo nome deve conter no mínimo 5 e no máximo 100 caracteres")
	private String nome;

	@NotBlank(message = "O atributo agendamento é Obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo agendamento deve conter no mínimo 5 e no máximo 100 caracteres")
	private String agendamento;

	@NotNull(message = "O valor do produto é obrigatório.")
	@Column(precision = 10, scale = 2)
	private BigDecimal valor;

	@NotBlank(message = "O atributo descricao é Obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo descricao deve conter no mínimo 5 e no máximo 100 caracteres")
	private String descricao;

	private String foto;

	@ManyToOne
	@JsonIgnoreProperties("servico")
	private Categoria categoria;

	@ManyToOne
	@JsonIgnoreProperties("servico")
	private Usuario usuario;

	public String getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(String agendamento) {
		this.agendamento = agendamento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
