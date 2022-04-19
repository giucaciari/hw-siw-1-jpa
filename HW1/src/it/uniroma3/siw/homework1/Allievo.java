package it.uniroma3.siw.homework1;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;


@Entity
public class Allievo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @ManyToMany(mappedBy="Allievi",fetch=FetchType.EAGER)
    List<Corso> Corsi;
    public Long getId() {
		return id;
	}
    @ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE})/*È utile avere subito persistente l'azienda dove lavora l'allievo ed è utile avere il merge nel caso in cui l'allievo cambi società*/
    private Società società;
	public void setId(Long id) {
		this.id = id;
	}
	private LocalDate dateOfBirth;
    private String LuogoDiNascita;
    private String email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Corso> getCorsi() {
		return Corsi;
	}
	public void setCorsi(List<Corso> corsi) {
		Corsi = corsi;
	}
	public Società getSocietà() {
		return società;
	}
	public void setSocietà(Società società) {
		this.società = società;
	}
	
}
