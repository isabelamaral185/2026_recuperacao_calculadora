/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        
        Usuario usuario = new Usuario();
        usuario.getNome();
        
        Calculadora tela = new Calculadora(usuario);
        tela.setVisible(true);
    }
}
