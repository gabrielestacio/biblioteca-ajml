package edu.uepb.web.biblioteca.model;

/**
 * A classe POJO da Reserva
 * 
 * @autor geovanniovinhas <vinhasgeovannio@gmail.com
 */
public class Reserva {
	private /*@ spec_public @*/ int id;
	private /*@ spec_public @*/ Aluno aluno;
	private /*@ spec_public @*/ Item item;
	private /*@ spec_public @*/ String dataReservado;
	private /*@ spec_public @*/ String dataPegar;
	private /*@ spec_public @*/ boolean email;

	public /*@ pure @*/ int getId() {
		return id;
	}

	/*@ assignable this.id;
	  @ ensures this.id == id; 
	  @*/
	public void setId(int id) {
		this.id = id;
	}

	public /*@ pure @*/ Aluno getAluno() {
		return aluno;
	}

	/*@ assignable this.aluno;
	  @ ensures this.aluno == aluno; 
	  @*/
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public /*@ pure @*/ Item getItem() {
		return item;
	}

	/*@ assignable this.item;
	  @ ensures this.item == item; 
	  @*/
	public void setItem(Item item) {
		this.item = item;
	}

	public /*@ pure @*/ String getDataReservado() {
		return dataReservado;
	}

	/*@ assignable this.dataReservado;
	  @ ensures this.dataReservado == dataReservado; 
	  @*/
	public void setDataReservado(String dataReservado) {
		this.dataReservado = dataReservado;
	}

	public /*@ pure @*/ String getDataPegar() {
		return dataPegar;
	}

	/*@ assignable this.dataPegar;
	  @ ensures this.dataPegar == dataPegar; 
	  @*/
	public void setDataPegar(String dataPegar) {
		this.dataPegar = dataPegar;
	}

	public /*@ pure @*/ boolean isEmail() {
		return email;
	}

	/*@ assignable this.email;
	  @ ensures this.email == email; 
	  @*/
	public void setEmail(boolean email) {
		this.email = email;
	}

	@Override
	public /*@ pure @*/ String toString() {
		return "Reserva [id=" + id + ", aluno=" + aluno + ", item=" + item + ", dataReservado=" + dataReservado
				+ ", dataPegar=" + dataPegar + ", email=" + email + "]";
	}

}
