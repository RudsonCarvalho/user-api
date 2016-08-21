package br.com.rudson.carvalho.usuario.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "User", propOrder =
	{ "id", "nome", "email", "status", "dataCadastro", "dataAtualizacao"
})


@XmlRootElement(name="User")
public class User  {
  

  @XmlElement(name="id")
  private Long id = null;

  @XmlElement(name="nome")
  private String nome = null;

  @XmlElement(name="email")
  private String email = null;
  
  @XmlElement(name="status")
  private Boolean status = null;

  @XmlElement(name="data-cadastro")
  private Date dataCadastro = null;

  @XmlElement(name="data-atualizacao")
  private Date dataAtualizacao = null;


	/**
	 * @return retorna o valor de id
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * atribui o valor de id
	 * @param id de id para aplicar
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * @return retorna o valor de nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * atribui o valor de nome
	 * @param nome de nome para aplicar
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * @return retorna o valor de email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * atribui o valor de email
	 * @param email de email para aplicar
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return retorna o valor de status
	 */
	public Boolean getStatus() {
		return status;
	}
	
	/**
	 * atribui o valor de status
	 * @param status de status para aplicar
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	/**
	 * @return retorna o valor de dataCadastro
	 */
	public Date getDataCadastro() {
		return dataCadastro;
	}
	
	/**
	 * atribui o valor de dataCadastro
	 * @param dataCadastro de dataCadastro para aplicar
	 */
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	/**
	 * @return retorna o valor de dataAtualizacao
	 */
	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}
	
	/**
	 * atribui o valor de dataAtualizacao
	 * @param dataAtualizacao de dataAtualizacao para aplicar
	 */
	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

@Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dataCadastro: ").append(toIndentedString(dataCadastro)).append("\n");
    sb.append("    dataAtualizacao: ").append(toIndentedString(dataAtualizacao)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

