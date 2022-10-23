package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table
public class Passagem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@ManyToOne
	@JoinColumn(name = "id_cidade", nullable=false)
    private Cidade cidade;
	@Column(nullable = false)
    private double valor;
	@Column(nullable = false)
    private int desconto;
	@Column(nullable = false)
    private double valor_promocional;
	@Column(nullable = false)
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate data_ida;
	@Column(nullable = false)
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate data_volta;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getDesconto() {
		return desconto;
	}
	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	public double getValor_promocional() {
		return valor_promocional;
	}
	public void setValor_promocional(double valor_promocional) {
		this.valor_promocional = valor_promocional;
	}
	public LocalDate getData_ida() {
		return data_ida;
	}
	public void setData_ida(LocalDate data_ida) {
		this.data_ida = data_ida;
	}
	public LocalDate getData_volta() {
		return data_volta;
	}
	public void setData_volta(LocalDate data_volta) {
		this.data_volta = data_volta;
	}
   
	

   
}
