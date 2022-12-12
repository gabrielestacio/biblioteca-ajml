package edu.uepb.web.biblioteca.model;

import edu.uepb.web.biblioteca.enums.TipoNivel;

/**
 * A classe POJO do Curso
 * 
 * @autor geovanniovinhas <vinhasgeovannio@gmail.com
 *
 */
public class Curso {
	private /*@ spec_public non_null @*/ int id;
	private /*@ spec_public non_null @*/ String nome;
	private /*@ spec_public non_null @*/ String area;
	private /*@ spec_public non_null @*/ TipoNivel nivel;

	/*@ assignable this.nome, this.nivel, this.area;
	  @ ensures this.nome == nome && this.nivel == nivel && this.area == area;
	  @*/
	public Curso(String nome, TipoNivel nivel, String area) {
		this.nome = nome;
		this.nivel = nivel;
		this.area = area;
	}

	public Curso() {

	}

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

	public /*@ pure @*/ TipoNivel getNivel() {
		return nivel;
	}

	/*@ assignable this.nivel;
	  @ ensures this.nivel == nivel;
	  @*/
	public void setNivel(String nivel) {
		this.nivel = TipoNivel.valueOf(nivel);
	}

	/*@ assignable this.nivel;
	  @ ensures this.nivel == nivel;
	  @*/
	public void setNivel(TipoNivel nivel) {
		this.nivel = nivel;
	}

	public /*@ pure @*/ String getArea() {
		return area;
	}

	/*@ assignable this.area;
	  @ ensures this.area == area;
	  @*/
	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public /*@ pure @*/ int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public /*@ pure @*/ boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public /*@ pure @*/ String toString() {
		return "Curso [id=" + id + ", nome=" + nome + ", area=" + area + ", nivel=" + nivel + "]";
	}

}
