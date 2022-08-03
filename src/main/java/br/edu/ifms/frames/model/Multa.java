package br.edu.ifms.frames.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Multa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String cidade;
	private int ano;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="carro_id")
	private Carro carro;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="infracao_id")
	private Infracao infracao;
	
	
	public Multa() {
		// TODO Auto-generated constructor stub
	}
	

	public Multa(Integer id, String cidade, int ano, Carro carro, Infracao infracao) {
		super();
		this.id = id;
		this.cidade = cidade;
		this.ano = ano;
		this.carro = carro;
		this.infracao = infracao;
	}


	public Infracao getInfracao() {
		return infracao;
	}


	public void setInfracao(Infracao infracao) {
		this.infracao = infracao;
	}


	public Carro getCarro() {
		return carro;
	}



	public void setCarro(Carro carro) {
		this.carro = carro;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multa other = (Multa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
