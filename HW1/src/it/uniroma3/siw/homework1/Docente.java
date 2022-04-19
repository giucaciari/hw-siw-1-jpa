package it.uniroma3.siw.homework1;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;


@Entity
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)   //crea un id e un numero automatico//
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    private LocalDate dateOfBirth;
    private String LuogoDiNascita;
    private Long Iva;
    @OneToMany(mappedBy="docente",cascade= {CascadeType.PERSIST,CascadeType.MERGE})/*se il docente cambia è utile aggiornare il corso e inoltre è sensato rendere persistente un corso se lo rendo persistente il docente*/
    private List<Corso> Corsi;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getLuogoDiNascita() {
		return LuogoDiNascita;
	}
	public void setLuogoDiNascita(String luogoDiNascita) {
		LuogoDiNascita = luogoDiNascita;
	}
	public Long getIva() {
		return Iva;
	}
	public void setIva(Long iva) {
		Iva = iva;
	}
	public List<Corso> getCorsi() {
		return Corsi;
	}
	public void setCorsi(List<Corso> corsi) {
		Corsi = corsi;
	}
    
    
}