package edu.uepb.web.biblioteca.model;

/**
 * A classe POJO para Divida
 * 
 * @autor geovanniovinhas <vinhasgeovannio@gmail.com
 */
public class Divida {
	private /*@ spec_public non_null @*/ int id;
	private /*@ spec_public non_null @*/ Aluno aluno;
	private /*@ spec_public non_null @*/ Emprestimo emprestimo;
	private /*@ spec_public @*/ float saldo;
	private /*@ spec_public @*/ boolean pago;

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

	public /*@ pure @*/ Emprestimo getEmprestimo() {
		return emprestimo;
	}

	/*@ assignable this.emprestimo;
	  @ ensures this.emprestimo == emprestimo;
	  @*/
	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}

	public /*@ pure @*/ float getSaldo() {
		return saldo;
	}

	/*@ assignable this.saldo;
	  @ ensures this.saldo == saldo;
	  @*/
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public /*@ pure @*/ boolean isPago() {
		return pago;
	}

	/*@ assignable this.pago;
	  @ ensures this.pago == pago;
	  @*/
	public void setPago(boolean pago) {
		this.pago = pago;
	}

	@Override
	public /*@ pure @*/ String toString() {
		return "Divida [id=" + id + ", aluno=" + aluno + ", emprestimo=" + emprestimo + ", saldo=" + saldo + ", pago="
				+ pago + "]";
	}

}
