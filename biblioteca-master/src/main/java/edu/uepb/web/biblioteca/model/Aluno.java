package edu.uepb.web.biblioteca.model;

/**
 * A classe POJO do Aluno
 * 
 * @autor geovanniovinhas <vinhasgeovannio@gmail.com
 */
public class Aluno {
	
	
	private /*@ spec_public non_null @*/ int id;
	private /*@ spec_public non_null @*/ String matricula;
	private /*@ spec_public non-null @*/ String rg;
	private /*@ spec_public non-null @*/ String cpf;
	private /*@ spec_public non-null @*/ String nome;
	private /*@ spec_public @*/ String nomeMae;
	private /*@ spec_public @*/ String naturalidade;
	private /*@ spec_public @*/ String endereco;
	private /*@ spec_public non-null @*/ String telefone;
	private /*@ spec_public non-null @*/ Curso curso;
	private /*@ spec_public @*/ String ano;
	private /*@ spec_public @*/ String periodoIngresso;
	private /*@ spec_public non-null @*/ String email;
	private /*@ spec_public non-null @*/ String senha;

	public Aluno() {
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

	public /*@ pure @*/ String getMatricula() {
		return matricula;
	}

	/*@ assignable this.matricula;
	  @ ensures this.matricula == matricula;
	  @*/
	public void setMatricula(String matricula) {
		this.matricula = matricula;
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

	public /*@ pure @*/ String getCpf() {
		return cpf;
	}

	/*@ assignable this.cpf;
	  @ ensures this.cpf == cpf;
	  @*/
	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public /*@ pure @*/ String getNomeMae() {
		return nomeMae;
	}

	/*@ assignable this.nomeMae;
	  @ ensures this.nomeMae == nomeMae;
	  @*/
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
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

	public /*@ pure @*/ Curso getCurso() {
		return curso;
	}

	/*@ assignable this.curso;
	  @ ensures this.curso == curso;
	  @*/
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public /*@ pure @*/ String getAno() {
		return ano;
	}

	/*@ assignable this.ano;
	  @ ensures this.ano == ano;
	  @*/
	public void setAno(String ano) {
		this.ano = ano;
	}

	public /*@ pure @*/ String getPeriodoIngresso() {
		return periodoIngresso;
	}

	/*@ assignable this.periodoIngresso;
	  @ ensures this.periodoIngresso == periodoIngresso;
	  @*/
	public void setPeriodoIngresso(String periodoIngresso) {
		this.periodoIngresso = periodoIngresso;
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

	/*@ assignable this.matricula, this.rg, this.cpf, this.nome, this.nomeMae, this.naturalidade,
	  @			   this.endereco, this.telefone, this.curso, this.ano, this.periodoIngresso, 
	  @			   this.email, this.senha;
	  @ ensures this.matricula == matricula && this.rg == rg && this.cpf == cpf && this.nome == nome
	  @			this.nomeMae == nomeMae && this.naturalidade == naturalidade && this.endereco == endereco
	  @			this.telefone == telefone && this.curso == curso && this.ano == ano
	  @			this.periodoIngresso == periodoIngresso && this.email == email && this.senha == senha;
	  @*/
	public Aluno(String matricula, String rg, String cpf, String nome, String nomeMae, String naturalidade,
			String endereco, String telefone, Curso curso, String ano, String periodoIngresso, String email,
			String senha) {
		super();
		this.matricula = matricula;
		this.rg = rg;
		this.cpf = cpf;
		this.nome = nome;
		this.nomeMae = nomeMae;
		this.naturalidade = naturalidade;
		this.endereco = endereco;
		this.telefone = telefone;
		this.curso = curso;
		this.ano = ano;
		this.periodoIngresso = periodoIngresso;
		this.email = email;
		this.senha = senha;
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

	@Override
	public /*@ pure @*/ int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
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
		Aluno other = (Aluno) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	@Override
	public /*@ pure @*/ String toString() {
		return "Aluno [id=" + id + ", matricula=" + matricula + ", rg=" + rg + ", cpf=" + cpf + ", nome=" + nome
				+ ", nomeMae=" + nomeMae + ", naturalidade=" + naturalidade + ", endereco=" + endereco + ", telefone="
				+ telefone + ", curso=" + curso + ", ano=" + ano + ", periodoIngresso=" + periodoIngresso + ", senha="
				+ senha + "]";
	}

}
