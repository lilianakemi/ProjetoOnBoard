package br.com.b2w.view;

import java.util.List;

import br.com.b2w.bo.UsuarioBo;
import br.com.b2w.to.UsuarioTO;

public class UsuarioView {
	
	public static void main(String[] args) {
		
		UsuarioTO user = new UsuarioTO(12, "teste3", "123@m", "N", "teste3", "31/12/2020");
		try {
			UsuarioBo bo = new UsuarioBo();
//			bo.cadastrar(user);
//			System.out.println("Usuario cadastrado");
//			
//			bo.atualizar(user);
//			System.out.println("Usuário atualizado");
//			
//			user = bo.buscar(12);
//			System.out.println(user);
//			
//			List<UsuarioTO> lista = bo.listar();
//			for(UsuarioTO u : lista)
//				System.out.println(u);
//			
			bo.remover(13);
			System.out.println("Usuário removido");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

