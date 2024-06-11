package Lambdas;
import java.util.function.*;
import java.util.*;
public class Fornecedor {
	public static void main(String[] args) {
		Supplier<List<String>> list = () -> Arrays.asList("Aria", "Hanna", "Spencer", "Luis");
		
		System.out.println(list.get());
	}

}
