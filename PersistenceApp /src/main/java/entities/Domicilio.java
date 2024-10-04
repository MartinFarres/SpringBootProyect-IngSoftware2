package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "domicilio")
public class Domicilio implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "numero")
	private int numero;
	
	@Column(name= "nombreCalle")
	private String nombreCalle;

	@OneToOne(mappedBy="domicilio")
	private Cliente cliente;
	
	

	public Domicilio(int numero, String nombreCalle, Cliente cliente) {
		this.numero = numero;
		this.nombreCalle = nombreCalle;
		this.cliente = cliente;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Domicilio(int numero, String nombreCalle) {
		this.numero = numero;
		this.nombreCalle = nombreCalle;
	}


	public Domicilio() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getNombreCalle() {
		return nombreCalle;
	}


	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}
	
	
	
	
}
