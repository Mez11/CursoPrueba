package com.cu.hbm.model;
// Generated Jun 21, 2016 7:33:57 PM by Hibernate Tools 5.1.0.Alpha1

/**
 * Compras generated by hbm2java
 */
public class Compras implements java.io.Serializable {

	private int idCompras;
	private Helado helado;
	private Usuario usuario;

	public Compras() {
	}

	public Compras(int idCompras, Helado helado, Usuario usuario) {
		this.idCompras = idCompras;
		this.helado = helado;
		this.usuario = usuario;
	}

	public int getIdCompras() {
		return this.idCompras;
	}

	public void setIdCompras(int idCompras) {
		this.idCompras = idCompras;
	}

	public Helado getHelado() {
		return this.helado;
	}

	public void setHelado(Helado helado) {
		this.helado = helado;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
