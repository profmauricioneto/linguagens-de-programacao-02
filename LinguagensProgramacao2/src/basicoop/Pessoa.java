/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicoop;

import java.time.Year;
import java.util.Calendar;

/**
 *
 * @author maumneto
 */
public class Pessoa {
    String nome;
    double altura;
    int ano_nascimento;
    
    public Pessoa(String nome, double altura, int ano_nascimento) {
        this.nome = nome;
        this.altura = altura;
        this.ano_nascimento = ano_nascimento;
    }
    
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
        System.out.println("Ano de Nascimento: " + ano_nascimento);
    }
    
    public int calcularIdade() {
        Calendar cal = Calendar.getInstance();
        int current_year = cal.get(Calendar.YEAR);
        int age = current_year - this.ano_nascimento;
        return age;
    }
}
