package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.model.ErrorResponseXsd1;
import com.ibm.model.ResponseHeaderXsd1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorWithHeaderNs1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-12T10:09:22.616Z[GMT]")

public class ErrorWithHeaderNs1   {
  @JsonProperty("errorResponse")
  private ErrorResponseXsd1 errorResponse = null;

  @JsonProperty("responseHeader")
  private ResponseHeaderXsd1 responseHeader = null;

  public ErrorWithHeaderNs1 errorResponse(ErrorResponseXsd1 errorResponse) {
    this.errorResponse = errorResponse;
    return this;
  }

  /**
   * Get errorResponse
   * @return errorResponse
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ErrorResponseXsd1 getErrorResponse() {
    return errorResponse;
  }

  public void setErrorResponse(ErrorResponseXsd1 errorResponse) {
    this.errorResponse = errorResponse;
  }

  public ErrorWithHeaderNs1 responseHeader(ResponseHeaderXsd1 responseHeader) {
    this.responseHeader = responseHeader;
    return this;
  }

  /**
   * Get responseHeader
   * @return responseHeader
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ResponseHeaderXsd1 getResponseHeader() {
    return responseHeader;
  }

  public void setResponseHeader(ResponseHeaderXsd1 responseHeader) {
    this.responseHeader = responseHeader;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorWithHeaderNs1 errorWithHeaderNs1 = (ErrorWithHeaderNs1) o;
    return Objects.equals(this.errorResponse, errorWithHeaderNs1.errorResponse) &&
        Objects.equals(this.responseHeader, errorWithHeaderNs1.responseHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorResponse, responseHeader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorWithHeaderNs1 {\n");
    
    sb.append("    errorResponse: ").append(toIndentedString(errorResponse)).append("\n");
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
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

