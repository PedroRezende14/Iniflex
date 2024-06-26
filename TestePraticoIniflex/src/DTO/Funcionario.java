package DTO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.text.DecimalFormat;
public class Funcionario extends Pessoa {
	
	private BigDecimal salario;
	private String funcao;

	public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
		super(nome, dataNascimento);
		this.salario = salario;
		this.funcao = funcao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public String getValorFormatado() {
		 DecimalFormat exemplo = new DecimalFormat("#,##0.00");
		 String valor = exemplo.format(salario);
		 return valor;
	}
	
}
