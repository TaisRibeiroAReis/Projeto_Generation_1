pacote  Banco ;

import  java.util.ArrayList ;
import  java.util.InputMismatchException ;
import  java.util.Scanner ;

public  class  BancoMain {
	public  static  void  main ( String [] args ) {

		int op =  0 ;
		Varredura do scanner =  novo  scanner ( sistema . In);
		ArrayList < Cliente > clientes =  new  ArrayList < Cliente > ();
		Cliente cliente =  nulo ;

		faça {

			// ------------- MENU PRINCIPAL ---------------------
			tente {
				Sistema . para fora . println ( " \ n Bem vindo! \ n Digite \ n (1) Entrar \ n (2) Cadastrar " );
				op = scan . nextInt ();

			} catch ( InputMismatchException  InputMismatchException ) {
				digitalizar . nextLine ();
				Sistema . para fora . println (
						" Alguns dados foram inseridos de maneira incorreta, por favor, se voce esta digitando numeros inteiros! " );

			}

			if (op ==  2 ) {
				cliente =  novo  Cliente ();
				clientes . adicionar (cliente);
				cliente . setCodigoConta (clientes . indexOf (cliente));
				Sistema . para fora . println ( " ANOTE O SEU NÚMERO DA CONTA PARA POSTERIORMENTE FAZER O ACESSO! \ n Numero da conta: "  + cliente . getCodigoConta ());

			} else  if (op ==  1 ) {
				tente {
					cliente =  Cliente . validar (clientes);
					cliente . transacao (cliente, clientes);

				} catch ( IndexOutOfBoundsException  IndexOutOfBoundsException ) {
					Sistema . para fora . println ( " Numero da conta ou senha invalidos, tente novamente! " );
				}
			}

		} enquanto (op ! =  - 1 );
		digitalizar . fechar();
		Sistema . para fora . println ( " \ n Sistema finalizado! " );

	}
}
