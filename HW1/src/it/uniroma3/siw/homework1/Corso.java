package it.uniroma3.siw.homework1;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Corso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
     private LocalDate DataCorso;
    @Column(nullable = false)
    private int DurataMesi;
    @ManyToOne
    private Docente docente;
    @ManyToMany(cascade= {CascadeType.PERSIST})/*utilizzo un cascade persist poiche se rendo persistente un corso non ha senso avere un corso senza studenti*/
    private List<Allievo> Allievi;
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
	public LocalDate getDataCorso() {
		return DataCorso;
	}
	public void setDataCorso(LocalDate dataCorso) {
		DataCorso = dataCorso;
	}
	public int getDurataMesi() {
		return DurataMesi;
	}
	public void setDurataMesi(int durataMesi) {
		DurataMesi = durataMesi;
	}
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	public List<Allievo> getAllievi() {
		return Allievi;
	}
	public void setAllievi(List<Allievo> allievi) {
		Allievi = allievi;
	}
	
	
	
	
}