package br.logic;

import java.util.HashMap;
import java.util.Map;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.Name;

import br.entity.Localidade;

@Name("localidadeHandler")
public class LocalidadeHandler {
	
	@Factory(value="localidades", scope=ScopeType.APPLICATION)
	public Localidade[] initLocalidades(){
		System.out.println("Iniciando Localidades");
		return Localidade.values();
	}
	
	
	public Map<String, Localidade> getLocalidades(){
		System.out.println("Iniciando Localidades");
		Map<String, Localidade> mapa = new HashMap<String, Localidade>();
		for(Localidade l : Localidade.values()){
			mapa.put(l.getNome(), l);
		}
		
		return mapa;
	}

}
