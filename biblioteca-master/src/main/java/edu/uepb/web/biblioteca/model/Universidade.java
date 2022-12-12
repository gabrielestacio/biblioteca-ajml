package edu.uepb.web.biblioteca.model;

/**
 * @autor geovanniovinhas <vinhasgeovannio@gmail.com
 */
public class Universidade {

	private /*@ spec_public @*/ int id;
	private /*@ spec_public @*/ String nome;
	private /*@ spec_public @*/ String endereco;
	private /*@ spec_public @*/ String periodo;
	private /*@ spec_public @*/ String inicioPeriodo;
	private /*@ spec_public @*/ String fimPeriodo;

	public /*@ pure @*/ int getId() {
		return id;
	}

	/*@ assignable this.id;
	  @ ensures this.id == id; 
	  @*/
	public void setId(int id) {
		this.id = id;
	}

	public /*@ pure @*/ String getNome() {
		return nome;
	}

	/*@ assignable this.nome;
	  @ ensures this.nome == nome; 
	  @*/
	public void setNome(String nome) {
		this.nome = nome;
	}

	public /*@ pure @*/ String getEndereco() {
		return endereco;
	}

	/*@ assignable this.endereco;
	  @ ensures this.endereco == endereco; 
	  @*/
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public /*@ pure @*/ String getPeriodo() {
		return periodo;
	}

	/*@ assignable this.periodo;
	  @ ensures this.periodo == periodo; 
	  @*/
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public /*@ pure @*/ String getInicioPeriodo() {
		return inicioPeriodo;
	}

	/*@ assignable this.inicioPeriodo;
	  @ ensures this.inicioPeriodo == inicioPeriodo; 
	  @*/
	public void setInicioPeriodo(String inicioPeriodo) {
		this.inicioPeriodo = inicioPeriodo;
	}

	public /*@ pure @*/ String getFimPeriodo() {
		return fimPeriodo;
	}

	/*@ assignable this.fimPeriodo;
	  @ ensures this.fimPeriodo == fimPeriodo; 
	  @*/
	public void setFimPeriodo(String fimPeriodo) {
		this.fimPeriodo = fimPeriodo;
	}

	@Override
	public /*@ pure @*/ String toString() {
		return "Universidade [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", periodo=" + periodo
				+ ", inicioPeriodo=" + inicioPeriodo + ", fimPeriodo=" + fimPeriodo + "]";
	}

}