package com.example.dto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Uzyszkodnik {
	//@Getter(AccessLevel.PROTECTED)
	private String imie;
	private String nazwisko;
	
	/*public String getImie(){
		return this.imie;
	}
	
	public String getNazwisko(){
		return this.nazwisko;
	}
	
	public void setImie(String imie){
		this.imie=imie;		
	}
	
	public void setNazwisko(String nazwisko){
		this.nazwisko=nazwisko;
	}*/
}
