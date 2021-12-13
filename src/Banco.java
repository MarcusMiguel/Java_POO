import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
public class Banco
{
	@Getter @Setter private String nome;
	@Getter @Setter private List<Conta> contas;

	public void imprimirContas(){
		System.out.println("-------------------------------");
		System.out.println("   "+nome + " - CONTAS");
		System.out.println("-------------------------------");

		for(Conta conta : contas){
			conta.imprimirInfosComuns();
			System.out.println("-------------------------------");
		}
	}
}
