package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaTaxasRespTransactionsFees;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informações da resposta de consulta de taxas.
 */
@ApiModel(description = "Informações da resposta de consulta de taxas.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class InfConsultaTaxasResp   {
  @JsonProperty("transactions_fees")
  @Valid
  private List<InfConsultaTaxasRespTransactionsFees> transactionsFees = null;

  public InfConsultaTaxasResp transactionsFees(List<InfConsultaTaxasRespTransactionsFees> transactionsFees) {
    this.transactionsFees = transactionsFees;
    return this;
  }

  public InfConsultaTaxasResp addTransactionsFeesItem(InfConsultaTaxasRespTransactionsFees transactionsFeesItem) {
    if (this.transactionsFees == null) {
      this.transactionsFees = new ArrayList<InfConsultaTaxasRespTransactionsFees>();
    }
    this.transactionsFees.add(transactionsFeesItem);
    return this;
  }

  /**
   * Get transactionsFees
   * @return transactionsFees
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<InfConsultaTaxasRespTransactionsFees> getTransactionsFees() {
    return transactionsFees;
  }

  public void setTransactionsFees(List<InfConsultaTaxasRespTransactionsFees> transactionsFees) {
    this.transactionsFees = transactionsFees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaTaxasResp infConsultaTaxasResp = (InfConsultaTaxasResp) o;
    return Objects.equals(this.transactionsFees, infConsultaTaxasResp.transactionsFees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionsFees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaTaxasResp {\n");
    
    sb.append("    transactionsFees: ").append(toIndentedString(transactionsFees)).append("\n");
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
