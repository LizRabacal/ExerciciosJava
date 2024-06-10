package POO.Encapsulamento;

public class Pessoa {
	private int idade;
	private String nome;
	public Pessoa(int idade, String nome) {
		super();
		setIdade(idade);
		this.nome = nome;
	}
	public int getIdade() {
		
		return idade;
	}
	public void setIdade(int idade) {
		if(idade >= 18) {
			this.idade = idade;
		}else if(idade > 0){
			System.out.println("Menor de idadeeeee");
			
		}else {
			System.out.println("Digite uma idade maior q 0!");
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
