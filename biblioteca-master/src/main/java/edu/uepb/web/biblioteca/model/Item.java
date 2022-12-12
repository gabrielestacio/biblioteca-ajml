package edu.uepb.web.biblioteca.model;

import edu.uepb.web.biblioteca.enums.TipoAnais;
import edu.uepb.web.biblioteca.enums.TipoItem;
import edu.uepb.web.biblioteca.enums.TipoMidia;
import edu.uepb.web.biblioteca.enums.TipoTrabalhoConclusao;

/**
 * A classe POJO do Item
 * 
 * @autor geovanniovinhas <vinhasgeovannio@gmail.com
 */
public class Item {
	private /*@ spec_public @*/ int id;
	private /*@ spec_public @*/ TipoItem tipoItem;
	private /*@ spec_public @*/ String isbn;
	private /*@ spec_public @*/ String titulo;
	TipoAnais /*@ spec_public @*/ tipoAnais;
	TipoMidia /*@ spec_public @*/ tipoMidia;
	TipoTrabalhoConclusao /*@ spec_public @*/ tipoTrabalho;
	private /*@ spec_public @*/ String autor;
	private /*@ spec_public @*/ String congresso;
	private /*@ spec_public @*/ String anoPublicacao;
	private /*@ spec_public @*/ String local;
	private /*@ spec_public @*/ String editora;
	private /*@ spec_public @*/ String edicao;
	private /*@ spec_public @*/ int numeroPagina;
	private /*@ spec_public @*/ String area;
	private /*@ spec_public @*/ String tema;
	private /*@ spec_public @*/ String dataGravacao;
	private /*@ spec_public @*/ String orientador;
	private /*@ spec_public @*/ String data;
	private /*@ spec_public @*/ int quantidade;

	public /*@ pure @*/ Item() {
		this.tipoAnais = TipoAnais.NONE;
		this.tipoMidia = TipoMidia.NONE;
		this.tipoTrabalho = TipoTrabalhoConclusao.NONE;
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

	public /*@ pure @*/ TipoItem getTipoItem() {
		return tipoItem;
	}

	/*@ assignable this.tipoItem;
	  @ ensures this.tipoItem == tipoItem;
	  @*/
	public void setTipoItem(String tipoItem) {
		this.tipoItem = TipoItem.valueOf(tipoItem);
	}

	/*@ assignable this.tipoItem;
	  @ ensures this.tipoItem == tipoItem;
	  @*/
	public void setTipoItem(TipoItem tipoItem) {
		this.tipoItem = tipoItem;
	}

	public /*@ pure @*/ String getIsbn() {
		return isbn;
	}

	/*@ assignable this.isbn;
	  @ ensures this.isbn == isbn;
	  @*/
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public /*@ pure @*/ String getTitulo() {
		return titulo;
	}

	/*@ assignable this.titulo;
	  @ ensures this.titulo == titulo;
	  @*/
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public /*@ pure @*/ TipoAnais getTipoAnais() {
		return tipoAnais;
	}

	/*@ assignable this.tipoAnais;
	  @ ensures this.tipoAnais == tipoAnais;
	  @*/
	public void setTipoAnais(String tipo) {
		this.tipoAnais = TipoAnais.valueOf(tipo);
	}

	/*@ assignable this.tipoAnais;
	  @ ensures this.tipoAnais == tipoAnais;
	  @*/
	public void setTipoAnais(TipoAnais tipoAnais) {
		this.tipoAnais = tipoAnais;
	}

	public /*@ pure @*/ TipoMidia getTipoMidia() {
		return tipoMidia;
	}

	/*@ assignable this.tipoMidia;
	  @ ensures this.tipoMidia == tipoMidia;
	  @*/
	public void setTipoMidia(String tipoMidia) {
		this.tipoMidia = TipoMidia.valueOf(tipoMidia);
	}

	/*@ assignable this.tipoMidia;
	  @ ensures this.tipoMidia == tipoMidia;
	  @*/
	public void setTipoMidia(TipoMidia tipoMidia) {
		this.tipoMidia = tipoMidia;
	}

	public /*@ pure @*/ TipoTrabalhoConclusao getTipoTrabalho() {
		return tipoTrabalho;
	}

	/*@ assignable this.tipoTrabalho;
	  @ ensures this.tipoTrabalho == tipoTrabalho;
	  @*/
	public void setTipoTrabalho(String tipoTrabalho) {
		this.tipoTrabalho = TipoTrabalhoConclusao.valueOf(tipoTrabalho);
	}

	/*@ assignable this.tipoTrabalho;
	  @ ensures this.tipoTrabalho == tipoTrabalho;
	  @*/
	public void setTipoTrabalho(TipoTrabalhoConclusao tipoTrabalho) {
		this.tipoTrabalho = tipoTrabalho;
	}

	public /*@ pure @*/ String getAutor() {
		return autor;
	}

	/*@ assignable this.autor;
	  @ ensures this.autor == autor;
	  @*/
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public /*@ pure @*/ String getCongresso() {
		return congresso;
	}

	/*@ assignable this.congresso;
	  @ ensures this.congresso == congresso;
	  @*/
	public void setCongresso(String congresso) {
		this.congresso = congresso;
	}

	public /*@ pure @*/ String getAnoPublicacao() {
		return anoPublicacao;
	}

	/*@ assignable this.anoPublicacao;
	  @ ensures this.anoPublicacao == anoPublicacao;
	  @*/
	public void setAnoPublicacao(String anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public /*@ pure @*/ String getLocal() {
		return local;
	}

	/*@ assignable this.local;
	  @ ensures this.local == local;
	  @*/
	public void setLocal(String local) {
		this.local = local;
	}

	public /*@ pure @*/ String getEditora() {
		return editora;
	}

	/*@ assignable this.editora;
	  @ ensures this.editora == editora;
	  @*/
	public void setEditora(String editora) {
		this.editora = editora;
	}

	public /*@ pure @*/ String getEdicao() {
		return edicao;
	}

	/*@ assignable this.edicao;
	  @ ensures this.edicao == edicao;
	  @*/
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public /*@ pure @*/ int getNumeroPagina() {
		return numeroPagina;
	}

	/*@ assignable this.numeroPagina;
	  @ ensures this.numeroPagina == numeroPagina;
	  @*/
	public void setNumeroPagina(int numeroPagina) {
		this.numeroPagina = numeroPagina;
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

	public /*@ pure @*/ String getTema() {
		return tema;
	}

	/*@ assignable this.tema;
	  @ ensures this.tema == tema;
	  @*/
	public void setTema(String tema) {
		this.tema = tema;
	}

	public /*@ pure @*/ String getDataGravacao() {
		return dataGravacao;
	}

	/*@ assignable this.dataGravacao;
	  @ ensures this.dataGravacao == dataGravacao;
	  @*/
	public void setDataGravacao(String dataGravacao) {
		this.dataGravacao = dataGravacao;
	}

	public /*@ pure @*/ String getOrientador() {
		return orientador;
	}

	/*@ assignable this.orientador;
	  @ ensures this.orientador == orientador;
	  @*/
	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}

	public /*@ pure @*/ String getData() {
		return data;
	}

	/*@ assignable this.data;
	  @ ensures this.data == data;
	  @*/
	public void setData(String data) {
		this.data = data;
	}

	public /*@ pure @*/ int getQuantidade() {
		return quantidade;
	}

	/*@ assignable this.quantidade;
	  @ ensures this.quantidade == quantidade;
	  @*/
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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
		Item other = (Item) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public /*@ pure @*/ String toString() {
		return "Item [id=" + id + ", tipoItem=" + tipoItem + ", isbn=" + isbn + ", titulo=" + titulo + ", tipoAnais="
				+ tipoAnais + ", tipoMidia=" + tipoMidia + ", tipoTrabalho=" + tipoTrabalho + ", autor=" + autor
				+ ", congresso=" + congresso + ", anoPublicacao=" + anoPublicacao + ", local=" + local + ", editora="
				+ editora + ", edicao=" + edicao + ", numeroPagina=" + numeroPagina + ", area=" + area + ", tema="
				+ tema + ", dataGravacao=" + dataGravacao + ", orientador=" + orientador + ", data=" + data
				+ ", quantidade=" + quantidade + "]";
	}

}
