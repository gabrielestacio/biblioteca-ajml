package edu.uepb.web.biblioteca.model;

import edu.uepb.web.biblioteca.enums.TipoFuncionario;

/**
 * A classe POJO do Funcionario
 * 
 * @autor geovanniovinhas <vinhasgeovannio@gmail.com
 *
 */
public class Funcionario {
	private /*@ spec_public @*/ int id;
	private /*@ spec_public @*/ String nome;
	private /*@ spec_public @*/ TipoFuncionario tipoFunc;
	private /*@ spec_public @*/ String cpf;
	private /*@ spec_public @*/ String rg;
	private /*@ spec_public @*/ String naturalidade;
	private /*@ spec_public @*/ String endereco;
	private /*@ spec_public @*/ String telefone;
	private /*@ spec_public @*/ String email;
	private /*@ spec_public @*/ String usuario;
	private /*@ spec_public @*/ String senha;

	/*@ assignable this.nome, this.tipoFunc, this.cpf, this.rg, this.naturalidade, this.endereco,
	  @			   this.telefone, this.email, this.usuario, this.senha;
	  @ ensures this.nome == nome && this.tipoFunc == tipoFunc && this.cpf == cpf && this.rg == rg &&
	  @			this.naturalidade == naturalidade && this.endereco == endereco &&
	  @			this.telefone == telefone && this.email == email && this.usuario == usuario && this.senha == senha;
	  @*/
	public Funcionario(String nome, TipoFuncionario tipoFunc, String cpf, String rg, String naturalidade,
			String endereco, String telefone, String email, String usuario, String senha) {

		this.nome = nome;
		this.tipoFunc = tipoFunc;
		this.cpf = cpf;
		this.rg = rg;
		this.naturalidade = naturalidade;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.usuario = usuario;
		this.senha = senha;
	}

	public Funcionario() {

	}

	public /*@ pure @*/ String getCpf() {
		return cpf;
	}

	/*@ assignable this.cpf;
	  @ ensures this.cpf == cpf;
	  @*/
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public /*@ pure @*/ String getRg() {
		return rg;
	}

	/*@ assignable this.rg;
	  @ ensures this.rg == rg;
	  @*/
	public void setRg(String rg) {
		this.rg = rg;
	}

	public /*@ pure @*/ String getNaturalidade() {
		return naturalidade;
	}

	/*@ assignable this.naturalidade;
	  @ ensures this.naturalidade == naturalidade;
	  @*/
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
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

	public /*@ pure @*/ String getTelefone() {
		return telefone;
	}

	/*@ assignable this.telefone;
	  @ ensures this.telefone == telefone;
	  @*/
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public /*@ pure @*/ String getEmail() {
		return email;
	}

	/*@ assignable this.email;
	  @ ensures this.email == email;
	  @*/
	public void setEmail(String email) {
		this.email = email;
	}

	public /*@ pure @*/ String getUsuario() {
		return usuario;
	}

	/*@ assignable this.usuario;
	  @ ensures this.usuario == suario;
	  @*/
	public void setUsuario(String suario) {
		this.usuario = suario;
	}

	public /*@ pure @*/ String getSenha() {
		return senha;
	}

	/*@ assignable this.senha;
	  @ ensures this.senha == senha;
	  @*/
	public void setSenha(String senha) {
		this.senha = senha;
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

	public /*@ pure @*/ TipoFuncionario getTipoFunc() {
		return tipoFunc;
	}

	/*@ assignable this.tipoFunc;
	  @ ensures this.tipoFunc == tipoFunc;
	  @*/
	public void setTipoFunc(String tipoFunc) {
		this.tipoFunc = TipoFuncionario.valueOf(tipoFunc);
	}

	/*@ assignable this.tipoFunc;
	  @ ensures this.tipoFunc == tipoFunc;
	  @*/
	public void setTipoFunc(TipoFuncionario tipoFunc) {
		this.tipoFunc = tipoFunc;
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public /*@ pure @*/ String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", tipoFunc=" + tipoFunc + ", cpf=" + cpf + ", rg=" + rg
				+ ", naturalidade=" + naturalidade + ", endereco=" + endereco + ", telefone=" + telefone + ", email="
				+ email + ", suario=" + usuario + ", senha=" + senha + "]";
	}

}
