package com.oracle.data.transform;

import java.util.Date;

public class Detalle {

	
	private int codOper;
	private Date fecha;
	private int estado;
	public int getCodOper() {
		return codOper;
	}
	public void setCodOper(int codOper) {
		this.codOper = codOper;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public Detalle(int codOper, Date fecha, int estado) {
		super();
		this.codOper = codOper;
		this.fecha = fecha;
		this.estado = estado;
	}
	public Detalle() {

	}
	
	
}
