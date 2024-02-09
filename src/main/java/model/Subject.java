package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table (name="Subject")
@NamedQuery(name = "Subject.findAll", query = "SELECT sj FROM Subject sj")

public class Subject {
	
	@Id
	@Column(name= "idsubject")
	private int id;
	
	@Column(name= "subject")
	private String subject;
	
	@Column(name= "creditos")
	private String creditos;
	
	public Subject () {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCreditos() {
		return creditos;
	}

	public void setCreditos(String creditos) {
		this.creditos = creditos;
	}
	
	

}
