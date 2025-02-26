package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {

	public static void main(String[] args) {

		System.out.println("Eae");
		

		Paciente p1 = new Paciente();
		p1.setNome("Felps");
		p1.setAltura(1.81);
		p1.setPeso(95);
		p1.setTelefone("119637375937");
		p1.setDataNascimento(LocalDate.of(2003, 7, 15));	
		
		Paciente p2 = new Paciente();
		p2.setNome("Felipe");
		p2.setAltura(1.81);
		p2.setPeso(92);
		
		p2.setTelefone("119748988847");
				
		p1.mostrarFichaDoPaciente();
		p2.mostrarFichaDoPaciente();
		

		
		
		
	}

}
