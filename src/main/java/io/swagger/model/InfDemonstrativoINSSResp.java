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
 * Informações sobre a resposta de requisição de demonstrativo INSS.
 */
@ApiModel(description = "Informações sobre a resposta de requisição de demonstrativo INSS.")
@Validated
public class InfDemonstrativoINSSResp   {
  @JsonProperty("qtdPaginas")
  private String qtdPaginas = null;

  @JsonProperty("recibo")
  private String recibo = null;

  public InfDemonstrativoINSSResp qtdPaginas(String qtdPaginas) {
    this.qtdPaginas = qtdPaginas;
    return this;
  }

  /**
   * Enviar a quantiade de páginas do demonstrativo, caso tenha apenas uma página, enviar 999999
   * @return qtdPaginas
  **/
  @ApiModelProperty(example = "000010", required = true, value = "Enviar a quantiade de páginas do demonstrativo, caso tenha apenas uma página, enviar 999999")
  @NotNull

@Pattern(regexp="^\\d{6}$")   public String getQtdPaginas() {
    return qtdPaginas;
  }

  public void setQtdPaginas(String qtdPaginas) {
    this.qtdPaginas = qtdPaginas;
  }

  public InfDemonstrativoINSSResp recibo(String recibo) {
    this.recibo = recibo;
    return this;
  }

  /**
   * Recibo com informações do demonstrativo INSS. Linhas com 48 posições separadas por \"@\".
   * @return recibo
  **/
  @ApiModelProperty(example = "@                DEMONSTRATIO INSS                @                                                @ CLIENTE: EUGENIO SCHMITT COELHO                @ AGENCIA: 0150 CONTA: 03.013689.0-1             @ SALDO DA CONTA                                 @ SALDO DEVEDOR...............R$          450,35-@ TOTAL DEVEDOR...............R$          450,35-@ LIMITE DA CONTA.............R$          100,00 @ LIMITE DA CONTA DISPONIVEL..R$          350,35-@--------- MOVIMENTOS DA CONTA CORRENTE ---------@@    SALDO ANT EM 18/01/2019               93,56-@    MOVIMENTOS JAN/2019                         @    COMPRAS           201218              85,68-@    COMPRAS           201218             139,14-@    COMPRAS           211218              20,70-@    COMPRAS           211218              39,00-@    SALDO NA DATA                        378,08-@", required = true, value = "Recibo com informações do demonstrativo INSS. Linhas com 48 posições separadas por \"@\".")
  @NotNull

@Pattern(regexp="^[^@]{0,48}(\\@[^@]{0,48})*$")   public String getRecibo() {
    return recibo;
  }

  public void setRecibo(String recibo) {
    this.recibo = recibo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfDemonstrativoINSSResp infDemonstrativoINSSResp = (InfDemonstrativoINSSResp) o;
    return Objects.equals(this.qtdPaginas, infDemonstrativoINSSResp.qtdPaginas) &&
        Objects.equals(this.recibo, infDemonstrativoINSSResp.recibo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qtdPaginas, recibo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfDemonstrativoINSSResp {\n");
    
    sb.append("    qtdPaginas: ").append(toIndentedString(qtdPaginas)).append("\n");
    sb.append("    recibo: ").append(toIndentedString(recibo)).append("\n");
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
