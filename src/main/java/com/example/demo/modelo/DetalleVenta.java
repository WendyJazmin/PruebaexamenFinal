package com.example.demo.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="detalle_venta")
public class DetalleVenta {
	
	@Id
	@Column(name="deve_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "deve_id_seq")
	@SequenceGenerator(name="deve_id_seq", sequenceName = "deve_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name="deve_cantidad")
	private Integer cantidad;
	
	@Column(name="deve_precio_unitario")
	private BigDecimal precioUJnitario;
	
	@Column(name="deve_subtotal")
	private BigDecimal subtotal;
	
	@ManyToOne
	@JoinColumn(name="deve_id_venta")
	private Venta venta;
	
	@ManyToOne
	@JoinColumn(name="deve_id_producto")
	private Producto producto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUJnitario() {
		return precioUJnitario;
	}

	public void setPrecioUJnitario(BigDecimal precioUJnitario) {
		this.precioUJnitario = precioUJnitario;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
}
