package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateCardTransactionResponseNs2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-12T10:09:22.616Z[GMT]")

public class CreateCardTransactionResponseNs2   {
  @JsonProperty("transactionReferenceNumber")
  private String transactionReferenceNumber;

  @JsonProperty("transactionReferenceSeq")
  private String transactionReferenceSeq;

  public CreateCardTransactionResponseNs2 transactionReferenceNumber(String transactionReferenceNumber) {
    this.transactionReferenceNumber = transactionReferenceNumber;
    return this;
  }

  /**
   * Get transactionReferenceNumber
   * @return transactionReferenceNumber
  */
  @ApiModelProperty(value = "")


  public String getTransactionReferenceNumber() {
    return transactionReferenceNumber;
  }

  public void setTransactionReferenceNumber(String transactionReferenceNumber) {
    this.transactionReferenceNumber = transactionReferenceNumber;
  }

  public CreateCardTransactionResponseNs2 transactionReferenceSeq(String transactionReferenceSeq) {
    this.transactionReferenceSeq = transactionReferenceSeq;
    return this;
  }

  /**
   * Get transactionReferenceSeq
   * @return transactionReferenceSeq
  */
  @ApiModelProperty(value = "")


  public String getTransactionReferenceSeq() {
    return transactionReferenceSeq;
  }

  public void setTransactionReferenceSeq(String transactionReferenceSeq) {
    this.transactionReferenceSeq = transactionReferenceSeq;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCardTransactionResponseNs2 createCardTransactionResponseNs2 = (CreateCardTransactionResponseNs2) o;
    return Objects.equals(this.transactionReferenceNumber, createCardTransactionResponseNs2.transactionReferenceNumber) &&
        Objects.equals(this.transactionReferenceSeq, createCardTransactionResponseNs2.transactionReferenceSeq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionReferenceNumber, transactionReferenceSeq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCardTransactionResponseNs2 {\n");
    
    sb.append("    transactionReferenceNumber: ").append(toIndentedString(transactionReferenceNumber)).append("\n");
    sb.append("    transactionReferenceSeq: ").append(toIndentedString(transactionReferenceSeq)).append("\n");
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

