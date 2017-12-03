package com.oracle.data.transform;

import java.util.Date;
import java.util.List;

public class Operacion {

	
	private int id;
	private Date date;
	private String serie;
	private double saldo;
	private Detalle[] detalle;
	private List<Detalle> historial;
	private boolean flag;
	private String[] arreglo;
	private String fecha2;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Detalle[] getDetalle() {
		return detalle;
	}
	public void setDetalle(Detalle[] detalle) {
		this.detalle = detalle;
	}
	public List<Detalle> getHistorial() {
		return historial;
	}
	public void setHistorial(List<Detalle> historial) {
		this.historial = historial;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String[] getArreglo() {
		return arreglo;
	}
	public void setArreglo(String[] arreglo) {
		this.arreglo = arreglo;
	}
	public String getFecha2() {
		return fecha2;
	}
	public void setFecha2(String fecha2) {
		this.fecha2 = fecha2;
	}
	public Operacion(int id, Date date, String serie, double saldo, Detalle[] detalle, List<Detalle> historial,
			boolean flag, String[] arreglo, String fecha2) {
		super();
		this.id = id;
		this.date = date;
		this.serie = serie;
		this.saldo = saldo;
		this.detalle = detalle;
		this.historial = historial;
		this.flag = flag;
		this.arreglo = arreglo;
		this.fecha2 = fecha2;
	}
	public Operacion() {
	
	}
	
	
	
	
}
