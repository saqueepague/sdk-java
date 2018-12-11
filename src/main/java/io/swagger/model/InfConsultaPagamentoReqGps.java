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
 * InfConsultaPagamentoReqGps
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class InfConsultaPagamentoReqGps   {
  @JsonProperty("codPagamento")
  private String codPagamento = null;

  @JsonProperty("dataCompetencia")
  private String dataCompetencia = null;

  @JsonProperty("identificador")
  private String identificador = null;

  public InfConsultaPagamentoReqGps codPagamento(String codPagamento) {
    this.codPagamento = codPagamento;
    return this;
  }

  /**
   * Código da Guia da Previdência Social (GPS).
   * @return codPagamento
  **/
  @ApiModelProperty(value = "Código da Guia da Previdência Social (GPS).")


  public String getCodPagamento() {
    return codPagamento;
  }

  public void setCodPagamento(String codPagamento) {
    this.codPagamento = codPagamento;
  }

  public InfConsultaPagamentoReqGps dataCompetencia(String dataCompetencia) {
    this.dataCompetencia = dataCompetencia;
    return this;
  }

  /**
   * Data de competência (AAAAMMDD).
   * @return dataCompetencia
  **/
  @ApiModelProperty(example = "20181122", value = "Data de competência (AAAAMMDD).")

@Pattern(regexp="^\\d{8}$") 
  public String getDataCompetencia() {
    return dataCompetencia;
  }

  public void setDataCompetencia(String dataCompetencia) {
    this.dataCompetencia = dataCompetencia;
  }

  public InfConsultaPagamentoReqGps identificador(String identificador) {
    this.identificador = identificador;
    return this;
  }

  /**
   * Identificador da guia.
   * @return identificador
  **/
  @ApiModelProperty(value = "Identificador da guia.")


  public String getIdentificador() {
    return identificador;
  }

  public void setIdentificador(String identificador) {
    this.identificador = identificador;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaPagamentoReqGps infConsultaPagamentoReqGps = (InfConsultaPagamentoReqGps) o;
    return Objects.equals(this.codPagamento, infConsultaPagamentoReqGps.codPagamento) &&
        Objects.equals(this.dataCompetencia, infConsultaPagamentoReqGps.dataCompetencia) &&
        Objects.equals(this.identificador, infConsultaPagamentoReqGps.identificador);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codPagamento, dataCompetencia, identificador);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaPagamentoReqGps {\n");
    
    sb.append("    codPagamento: ").append(toIndentedString(codPagamento)).append("\n");
    sb.append("    dataCompetencia: ").append(toIndentedString(dataCompetencia)).append("\n");
    sb.append("    identificador: ").append(toIndentedString(identificador)).append("\n");
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
