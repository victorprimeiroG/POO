package br.com.streaming.main;

import br.com.streaming.model.Usuario;

// TODO: Fazer imports das classes dos pacotes model e financeiro

public class MainTeste {
    public static void main(String[] args) {
        Usuario u1 = new Usuario(null,null);
        u1.setNome("Joao Silva");
        u1.setEmail("joao@email.com");

        System.out.println(u1);
        Usuario u2 = new Usuario(null,null);
        u2.setNome("Joao Silva");
        u2.setEmail("joao@email.com");
        if (u1.equals(u2)) {
            System.out.println("Erro: Usuário já existe!");
        } else {
            System.out.println("Cadastro Liberado");
        }
        System.out.println(Usuario.NOME_PLATAFORMA);
        System.out.println("Total de contas: " + Usuario.contadorUsuarios);
    }
}
