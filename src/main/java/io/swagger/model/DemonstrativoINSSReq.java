package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Cartao;
import io.swagger.model.Cripto;
import io.swagger.model.InfDemonstrativoINSSReq;
import io.swagger.model.InfTransacaoReq;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DemonstrativoINSSReq
 */
@Validated
public class DemonstrativoINSSReq   {
  @JsonProperty("InfTransacao")
  private InfTransacaoReq infTransacao = null;

  @JsonProperty("Cartao")
  private Cartao cartao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("Cripto")
  private Cripto cripto = null;

  @JsonProperty("InfDemonstrativoINSS")
  private InfDemonstrativoINSSReq infDemonstrativoINSS = null;

  public DemonstrativoINSSReq infTransacao(InfTransacaoReq infTransacao) {
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

  public DemonstrativoINSSReq cartao(Cartao cartao) {
    this.cartao = cartao;
    return this;
  }

  /**
   * Get cartao
   * @return cartao
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Cartao getCartao() {
    return cartao;
  }

  public void setCartao(Cartao cartao) {
    this.cartao = cartao;
  }

  public DemonstrativoINSSReq terminal(Terminal terminal) {
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

  public DemonstrativoINSSReq cripto(Cripto cripto) {
    this.cripto = cripto;
    return this;
  }

  /**
   * Get cripto
   * @return cripto
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Cripto getCripto() {
    return cripto;
  }

  public void setCripto(Cripto cripto) {
    this.cripto = cripto;
  }

  public DemonstrativoINSSReq infDemonstrativoINSS(InfDemonstrativoINSSReq infDemonstrativoINSS) {
    this.infDemonstrativoINSS = infDemonstrativoINSS;
    return this;
  }

  /**
   * Get infDemonstrativoINSS
   * @return infDemonstrativoINSS
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public InfDemonstrativoINSSReq getInfDemonstrativoINSS() {
    return infDemonstrativoINSS;
  }

  public void setInfDemonstrativoINSS(InfDemonstrativoINSSReq infDemonstrativoINSS) {
    this.infDemonstrativoINSS = infDemonstrativoINSS;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemonstrativoINSSReq demonstrativoINSSReq = (DemonstrativoINSSReq) o;
    return Objects.equals(this.infTransacao, demonstrativoINSSReq.infTransacao) &&
        Objects.equals(this.cartao, demonstrativoINSSReq.cartao) &&
        Objects.equals(this.terminal, demonstrativoINSSReq.terminal) &&
        Objects.equals(this.cripto, demonstrativoINSSReq.cripto) &&
        Objects.equals(this.infDemonstrativoINSS, demonstrativoINSSReq.infDemonstrativoINSS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, cartao, terminal, cripto, infDemonstrativoINSS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemonstrativoINSSReq {\n");
    
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    cartao: ").append(toIndentedString(cartao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    cripto: ").append(toIndentedString(cripto)).append("\n");
    sb.append("    infDemonstrativoINSS: ").append(toIndentedString(infDemonstrativoINSS)).append("\n");
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
