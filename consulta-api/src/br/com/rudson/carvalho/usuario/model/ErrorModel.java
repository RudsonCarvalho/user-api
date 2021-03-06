package br.com.rudson.carvalho.usuario.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ErrorModel", propOrder =
	{ "message", "code"
})

@XmlRootElement(name="ErrorModel")
public class ErrorModel  {
  

  @XmlElement(name="message")
  private String message = null;

  @XmlElement(name="code")
  private Integer code = null;

  /**
   **/
  
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  /**
   * minimum: 100.0
   * maximum: 600.0
   **/
  
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorModel {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

