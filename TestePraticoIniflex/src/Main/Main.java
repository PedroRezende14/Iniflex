package Main;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import DTO.*;
import Metodos.ListaFuncionario;

public class Main {

    public static void main(String[] args) {
    	
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ListaFuncionario lf = new ListaFuncionario();
        lf.add(new Funcionario("Maria", LocalDate.parse("18/10/2000", formatter), new BigDecimal(2009.44), "Operador"));
        lf.add(new Funcionario("Joao", LocalDate.parse("12/02/1990", formatter), new BigDecimal(2284.38), "Operador"));
        lf.add(new Funcionario("Caio", LocalDate.parse("02/05/1961", formatter), new BigDecimal(9836.14), "Coordenador"));
        lf.add(new Funcionario("Miguel", LocalDate.parse("14/10/1988", formatter), new BigDecimal(19119.88), "Diretor"));
        lf.add(new Funcionario("Alice", LocalDate.parse("05/01/1995", formatter), new BigDecimal(2234.68), "Recepcionista"));
        lf.add(new Funcionario("Heitor", LocalDate.parse("19/11/1999", formatter), new BigDecimal(1582.72), "Operador"));
        lf.add(new Funcionario("Arthur", LocalDate.parse("31/03/1993", formatter), new BigDecimal(4071.84), "Contador"));
        lf.add(new Funcionario("Laura", LocalDate.parse("08/07/1994", formatter), new BigDecimal(3017.45), "Gerente"));
        lf.add(new Funcionario("Heloia", LocalDate.parse("24/05/2003", formatter), new BigDecimal(1606.85), "Eletricista"));
        lf.add(new Funcionario("Helena", LocalDate.parse("02/09/1996", formatter), new BigDecimal(2799.93), "Gerente"));
//        System.out.println(lf);
        
//        lf.remover("Joao");
        
//        lf.AumentoSalario();
        
//        lf.salarioMinimo();
        
//        lf.somaSalario();
        
//        lf.ordemAlfabetica();
        
//        lf.aniversarioFunc();
        
//        lf.imprimirFuncao();
        
//        lf.funcMaisVelho();
        
//        lf.grupoporFuncao();

    }

}
