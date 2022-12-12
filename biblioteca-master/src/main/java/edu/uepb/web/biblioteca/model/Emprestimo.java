package edu.uepb.web.biblioteca.model;

/**
 * A classe POJO do Emprestimo
 * 
 * @autor geovanniovinhas <vinhasgeovannio@gmail.com
 */
public class Emprestimo {
	private /*@ spec_public @*/ int id;
	private /*@ spec_public @*/ Funcionario funcionario;
	private /*@ spec_public @*/ Aluno aluno;
	private /*@ spec_public @*/ Item item;
	private /*@ spec_public @*/ String dataCadastrado;
	private /*@ spec_public @*/ String dataDevolucao;
	private /*@ spec_public @*/ int renovacao;
	private /*@ spec_public @*/ boolean entregou;

	public /*@ pure @*/ String getDataDevolucao() {
		return dataDevolucao;
	}

	/*@ assignable this.dataDevolucao;
	  @ ensures this.dataDevolucao == dataDevolucao;
	  @*/
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
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

	public /*@ pure @*/ Funcionario getFuncionario() {
		return funcionario;
	}

	/*@ assignable this.funcionario;
	  @ ensures this.funcionario == funcionario;
	  @*/
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
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

	public /*@ pure @*/ String getDataCadastrado() {
		return dataCadastrado;
	}

	/*@ assignable this.dataCadastrado;
	  @ ensures this.dataCadastrado == dataCadastrado;
	  @*/
	public void setDataCadastrado(String dataCadastrado) {
		this.dataCadastrado = dataCadastrado;
	}

	public /*@ pure @*/ int getRenovacao() {
		return renovacao;
	}

	/*@ assignable this.renovacao;
	  @ ensures this.renovacao == renovacao;
	  @*/
	public void setRenovacao(int renovacao) {
		this.renovacao = renovacao;
	}

	public /*@ pure @*/ boolean isEntregou() {
		return entregou;
	}

	/*@ assignable this.entregou;
	  @ ensures this.entregou == entregou;
	  @*/
	public void setEntregou(boolean entregou) {
		this.entregou = entregou;
	}

	@Override
	public /*@ pure @*/ String toString() {
		return "Emprestimo [id=" + id + ", funcionario=" + funcionario + ", aluno=" + aluno + ", item=" + item
				+ ", dataCadastrado=" + dataCadastrado + ", dataDevolucao=" + dataDevolucao + ", renovacao=" + renovacao
				+ ", entregou=" + entregou + "]";
	}

}
