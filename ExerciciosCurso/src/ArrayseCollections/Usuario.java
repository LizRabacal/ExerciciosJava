package ArrayseCollections;

import java.util.Objects;






public class Usuario {
	String nome;

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

  @Override
  public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null || getClass() != obj.getClass()) return false;
     Usuario other = (Usuario) obj;
     return Objects.equals(nome, other.nome);
 }

	
	public String toString() {
		return "Meu nome é "+this.nome;
	}

	public Usuario(String nome) {
		this.nome = nome;
	}

	
}
