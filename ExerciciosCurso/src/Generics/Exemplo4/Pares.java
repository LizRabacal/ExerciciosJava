package Generics.Exemplo4;
import java.util.*;
public class Pares<C extends Number, V> {
	
	public final Set<Par<C, V>> itens = new HashSet<>();
	
	public void adicionar(C chave, V valor) {
		if(chave == null || valor == null) return;
		
		Par<C, V> p = new Par<C, V>(chave, valor);
		
		
		if(itens.stream().filter(par-> chave.equals(par.getChave())).findFirst().isPresent()) {
			itens.remove(itens.stream().filter(par-> chave.equals(par.getChave())).findFirst().get());
		}
		
		itens.add(p);
	}
	
	
	public V getValor(C chave) {
		if(chave == null) return null;
		
		Optional<Par<C, V>> parOp = itens.stream().filter(p -> chave.equals(p.getChave())).findFirst();
		
		
		return parOp.isPresent() ? parOp.get().getValor() : null;
		
	}




}
