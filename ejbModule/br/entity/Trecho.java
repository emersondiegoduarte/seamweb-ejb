package br.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Trecho {

	@Id
	@GeneratedValue
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private Localidade origem;
	
	@Enumerated(EnumType.STRING)
	private Localidade destino;
	
	@OneToMany(mappedBy = "trecho", cascade = CascadeType.ALL)
	List<Voo> voos = new ArrayList<Voo>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Localidade getOrigem() {
		return origem;
	}

	public void setOrigem(Localidade origem) {
		this.origem = origem;
	}

	public Localidade getDestino() {
		return destino;
	}

	public void setDestino(Localidade destino) {
		this.destino = destino;
	}

	public List<Voo> getVoos() {
		return voos;
	}

	public void addVoos(Voo voo) {
		voo.setTrecho(this);
		this.voos.add(voo);
	}
	
	
	
}
