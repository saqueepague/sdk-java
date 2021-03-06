package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informações da resposta da requisição de autenticação.
 */
@ApiModel(description = "Informações da resposta da requisição de autenticação.")
@Validated
public class InfAutenticacaoResp   {
  @JsonProperty("nomeCliente")
  private String nomeCliente = null;

  public InfAutenticacaoResp nomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
    return this;
  }

  /**
   * Nome do cliente se autenticando.
   * @return nomeCliente
  **/
  @ApiModelProperty(example = "Carl Edward Sagan", required = true, value = "Nome do cliente se autenticando.")
  @NotNull

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfAutenticacaoResp infAutenticacaoResp = (InfAutenticacaoResp) o;
    return Objects.equals(this.nomeCliente, infAutenticacaoResp.nomeCliente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomeCliente);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfAutenticacaoResp {\n");
    
    sb.append("    nomeCliente: ").append(toIndentedString(nomeCliente)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
