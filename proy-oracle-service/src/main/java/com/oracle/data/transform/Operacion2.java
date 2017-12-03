package com.oracle.data.transform;


import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="CalypsoUploadDocument")
@XmlType(propOrder={"id","date","serie","saldo","detalle","historial","flag","arreglo","fecha2"})
public class Operacion2 {

	
	private int id;
	private String date;
	private String serie;
	private double saldo;
	private Detalle2[] detalle;
	private List<Detalle2> historial;
	private boolean flag;
	private String[] arreglo;
	private String fecha2;
	
	@XmlAttribute
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
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
	public Detalle2[] getDetalle() {
		return detalle;
	}
	public void setDetalle(Detalle2[] detalle) {
		this.detalle = detalle;
	}
	public List<Detalle2> getHistorial() {
		return historial;
	}
	public void setHistorial(List<Detalle2> historial) {
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
	public Operacion2(int id, String date, String serie, double saldo, Detalle2[] detalle, List<Detalle2> historial,
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
	public Operacion2() {
		
	}
	@Override
	public String toString() {
		return "Operacion2 [id=" + id + ", date=" + date + ", serie=" + serie + ", saldo=" + saldo + ", detalle="
				+ Arrays.toString(detalle) + ", historial=" + historial + ", flag=" + flag + ", arreglo="
				+ Arrays.toString(arreglo) + ", fecha2=" + fecha2 + "]";
	}

	
	
	
}
