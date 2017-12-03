package com.oracle.data.util;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"codOper","fecha","estado"})
public class Detalle2 {

	
	private int codOper;
	private String fecha;
	private int estado;
	public int getCodOper() {
		return codOper;
	}
	public void setCodOper(int codOper) {
		this.codOper = codOper;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public Detalle2(int codOper, String fecha, int estado) {
		super();
		this.codOper = codOper;
		this.fecha = fecha;
		this.estado = estado;
	}
	public Detalle2() {
	
	}
	@Override
	public String toString() {
		return "Detalle2 [codOper=" + codOper + ", fecha=" + fecha.toString() + ", estado=" + estado + "]";
	}
	
	
	
	
}
