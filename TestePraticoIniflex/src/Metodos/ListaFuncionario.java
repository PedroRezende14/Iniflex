package Metodos;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

import DTO.Funcionario;

public class ListaFuncionario {
	
	private List<Funcionario> funcionarios;
	
	public ListaFuncionario() {
		this.funcionarios = new ArrayList<>();
	}
	
	
	public void add(Funcionario Funcionario) {
		funcionarios.add(Funcionario);
	}
	
	public void remover(String nFuncionario) {
		Iterator<Funcionario> funcRemover = funcionarios.iterator();
		while(funcRemover.hasNext()) {
			 Funcionario func = funcRemover.next();
			 if(func.getNome().equals(nFuncionario)) {
				 funcRemover.remove();
			 }
		}
		toString();
	}
	
	public void AumentoSalario() {
		BigDecimal porcentagem = new BigDecimal("1.10");
		    for (Funcionario funcionario : funcionarios) {
		        funcionario.setSalario(funcionario.getSalario().multiply(porcentagem)); 
		    }
		 toString();
	}
	
	public void salarioMinimo() {
	    double salariominimo = 1212.00;
	    DecimalFormat exemplo = new DecimalFormat("#,##0.00");
	    for (Funcionario funcionario : funcionarios) {
	        double salario = funcionario.getSalario().doubleValue(); 
	        double salariodividido = salario / salariominimo;
	        String salarioFormatado = exemplo.format(salariodividido);
	        System.out.println(funcionario.getNome() + ", quant de salarios minimos =  " + salarioFormatado);
	    }
	}
	
	public double somaSalario() {
		double soma = 0;
		for (Funcionario funcionario : funcionarios) {
	        double salario = funcionario.getSalario().doubleValue(); 
	         soma = salario+soma;
	    }
		System.out.print("Soma dos salarios = " +soma);
		return soma;
	}
	
	public void ordemAlfabetica() {
	    Collections.sort(funcionarios, new Comparator<Funcionario>() {
	    	public int compare(Funcionario f1, Funcionario f2) {
	               return f1.getNome().compareTo(f2.getNome());
	            }
	        });
	    for (Funcionario funcionario : funcionarios) {
	        System.out.println(funcionario.getNome());
	    }
	}
	 public void aniversarioFunc() {
	    for (Funcionario funcionario : funcionarios) {
	            int mes = funcionario.getDataNascimento().getMonthValue();
	            if (mes == 10 || mes == 12) {
	                System.out.println(funcionario.getNome());
	            }
	        }
	    }
	 
	 public void imprimirFuncao() {
		Collections.sort(funcionarios, new Comparator<Funcionario>() {
	    	public int compare(Funcionario f1, Funcionario f2) {
		               return f1.getFuncao().compareTo(f2.getFuncao());
		            }
		        });
		    for (Funcionario funcionario : funcionarios) {
		        System.out.println(funcionario.getNome() +" "+ funcionario.getFuncao());
		    }
		}
	 
	 public void funcMaisVelho() {
	    Funcionario velho = funcionarios.get(0);
	        for (Funcionario funcionario : funcionarios) {
	            if (funcionario.getDataNascimento().isBefore(velho.getDataNascimento())) {
	            	velho = funcionario;
	            }
	        }
	        
	        LocalDate hoje = LocalDate.now();
	        int i =  Period.between(velho.getDataNascimento(), hoje).getYears();
	        
	        System.out.print("Nome "+ velho.getNome());
	        System.out.print(" idade "+i );
			System.out.print(" Data Nascimento "+velho.getFormatada());
			System.out.print(" Salario "+ velho.getValorFormatado());
			System.out.println(" Funcao "+velho.getFuncao());		
	 }

	 public Map<String, List<Funcionario>> agruparPorFuncao() {
	        return funcionarios.stream()
	                .collect(Collectors.groupingBy(Funcionario::getFuncao));
	    }

	    public void grupoporFuncao() {
	        agruparPorFuncao().forEach((funcao, listaFuncionarios) -> {
	            System.out.println("Funcao: " + funcao);
	            listaFuncionarios.forEach(funcionario ->
	            System.out.println("  Nome: " + funcionario.getNome() + ", Data de Nascimento: " + funcionario.getFormatada() + ", Salario: " + funcionario.getValorFormatado()));
	        });
	    }
	 
	public String toString() {
		System.out.println ("Nome   Data Nascimento   Salario   Funcao");
		for (Funcionario funcionario : funcionarios) {
			System.out.print(funcionario.getNome()+"   ");
			System.out.print(funcionario.getFormatada()+"   ");
			System.out.print(funcionario.getValorFormatado()+"   ");
			System.out.println(funcionario.getFuncao()+"   ");
		}
		return "\n";
	}
}
