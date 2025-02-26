package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {

	private String nome;
	private LocalDate dataNascimento;
	private int peso;
	private double altura;
	private String telefone;
	
	public void calcularIdade() {
		
	}
	
	public void calcularImc() {
		
	}
	
	public void mostrarFichaDoPaciente() {
		System.out.println("=== Ficha do Paciente ===");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Telefone: " + telefone);
        System.out.println("=========================");	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length()>=3) {
		this.nome = nome.toUpperCase();
		} else {
			System.out.println("\nO nome " + nome + ", não é válido!\nO nome deve conter pelo menos 3 carácteres.");
		}
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if(altura >= 0) {
		this.altura = altura;
		} else {
			System.out.println("Altura inválida, insira novamente.");
		}
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	
}
