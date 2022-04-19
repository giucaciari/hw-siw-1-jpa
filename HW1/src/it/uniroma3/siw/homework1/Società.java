package it.uniroma3.siw.homework1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Società {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String RegioneSociale;
    @Column(nullable = false)
    private String IndirizzoSede;
    private String NumeroCivico;
    private String cap;
    private String Comune;
    private String provincia;
    @Column(nullable = false)
    private String Telefono;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRegioneSociale() {
		return RegioneSociale;
	}
	public void setRegioneSociale(String regioneSociale) {
		RegioneSociale = regioneSociale;
	}
	public String getIndirizzoSede() {
		return IndirizzoSede;
	}
	public void setIndirizzoSede(String indirizzoSede) {
		IndirizzoSede = indirizzoSede;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getNumeroCivico() {
		return NumeroCivico;
	}
	public void setNumeroCivico(String numeroCivico) {
		NumeroCivico = numeroCivico;
	}
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public String getComune() {
		return Comune;
	}
	public void setComune(String comune) {
		Comune = comune;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
}


