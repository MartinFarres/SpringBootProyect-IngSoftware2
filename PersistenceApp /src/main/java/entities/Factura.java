package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "factura")
public class Factura implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "numero")
	private int numero;
	
	@Column(name= "fecha")
	private String fecha;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="fk_cliente")
	private Cliente cliente;
	
	@OneToMany(mappedBy = "factura", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<DetalleFactura> detallesFactura= new ArrayList<DetalleFactura>();
	
	
	
	public Factura(int numero, String fecha, Cliente cliente) {
		this.numero = numero;
		this.fecha = fecha;
		this.cliente = cliente;
	}




	public Cliente getCliente() {
		return cliente;
	}




	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}




	public Factura(int numero, String fecha) {
		this.numero = numero;
		this.fecha = fecha;
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




	public String getFecha() {
		return fecha;
	}




	public void setFecha(String fecha) {
		this.fecha = fecha;
	}




	public Factura() {
		
	}
	
	
	
	
}
