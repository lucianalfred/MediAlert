package com.lucian.alfred.mediAlert.api.model;

import java.util.Date;

public class User {
	long id;
	String nome;
	String email;
	String password;
	String telefone;
	Date creatAt;
	
	
	public User(){
		
	}
	
	public User(String nome, String email,
			String password, String telefone) {
		
		this.nome = nome;
		this.email = email;
		this.password = password;
		this.telefone = telefone;
		
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Date getCreatAt() {
		return creatAt;
	}
	public void setCreatAt(Date creatAt) {
		this.creatAt = creatAt;
	}
	
	
	
}
