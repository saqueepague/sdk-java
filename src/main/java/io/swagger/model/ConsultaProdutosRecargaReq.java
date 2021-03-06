package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaProdutosRecargaReq;
import io.swagger.model.InfTransacaoReq;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultaProdutosRecargaReq
 */
@Validated
public class ConsultaProdutosRecargaReq   {
  @JsonProperty("InfTransacao")
  private InfTransacaoReq infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("InfConsultaProdutosRecarga")
  private InfConsultaProdutosRecargaReq infConsultaProdutosRecarga = null;

  public ConsultaProdutosRecargaReq infTransacao(InfTransacaoReq infTransacao) {
    this.infTransacao = infTransacao;
    return this;
  }

  /**
   * Get infTransacao
   * @return infTransacao
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public InfTransacaoReq getInfTransacao() {
    return infTransacao;
  }

  public void setInfTransacao(InfTransacaoReq infTransacao) {
    this.infTransacao = infTransacao;
  }

  public ConsultaProdutosRecargaReq terminal(Terminal terminal) {
    this.terminal = terminal;
    return this;
  }

  /**
   * Get terminal
   * @return terminal
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public Terminal getTerminal() {
    return terminal;
  }

  public void setTerminal(Terminal terminal) {
    this.terminal = terminal;
  }

  public ConsultaProdutosRecargaReq infConsultaProdutosRecarga(InfConsultaProdutosRecargaReq infConsultaProdutosRecarga) {
    this.infConsultaProdutosRecarga = infConsultaProdutosRecarga;
    return this;
  }

  /**
   * Get infConsultaProdutosRecarga
   * @return infConsultaProdutosRecarga
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public InfConsultaProdutosRecargaReq getInfConsultaProdutosRecarga() {
    return infConsultaProdutosRecarga;
  }

  public void setInfConsultaProdutosRecarga(InfConsultaProdutosRecargaReq infConsultaProdutosRecarga) {
    this.infConsultaProdutosRecarga = infConsultaProdutosRecarga;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaProdutosRecargaReq consultaProdutosRecargaReq = (ConsultaProdutosRecargaReq) o;
    return Objects.equals(this.infTransacao, consultaProdutosRecargaReq.infTransacao) &&
        Objects.equals(this.terminal, consultaProdutosRecargaReq.terminal) &&
        Objects.equals(this.infConsultaProdutosRecarga, consultaProdutosRecargaReq.infConsultaProdutosRecarga);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, terminal, infConsultaProdutosRecarga);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaProdutosRecargaReq {\n");
    
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    infConsultaProdutosRecarga: ").append(toIndentedString(infConsultaProdutosRecarga)).append("\n");
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
