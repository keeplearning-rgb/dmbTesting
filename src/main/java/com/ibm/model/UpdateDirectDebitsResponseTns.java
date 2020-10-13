package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.model.ErrorWithHeaderNs1;
import com.ibm.model.UpdateDirectDebitsResponseXsd7;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateDirectDebitsResponseTns
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-12T10:09:22.616Z[GMT]")

public class UpdateDirectDebitsResponseTns   {
  @JsonProperty("exception")
  private ErrorWithHeaderNs1 exception = null;

  @JsonProperty("response")
  private UpdateDirectDebitsResponseXsd7 response = null;

  public UpdateDirectDebitsResponseTns exception(ErrorWithHeaderNs1 exception) {
    this.exception = exception;
    return this;
  }

  /**
   * Get exception
   * @return exception
  */
  @ApiModelProperty(value = "")

  @Valid

  public ErrorWithHeaderNs1 getException() {
    return exception;
  }

  public void setException(ErrorWithHeaderNs1 exception) {
    this.exception = exception;
  }

  public UpdateDirectDebitsResponseTns response(UpdateDirectDebitsResponseXsd7 response) {
    this.response = response;
    return this;
  }

  /**
   * Get response
   * @return response
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateDirectDebitsResponseXsd7 getResponse() {
    return response;
  }

  public void setResponse(UpdateDirectDebitsResponseXsd7 response) {
    this.response = response;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDirectDebitsResponseTns updateDirectDebitsResponseTns = (UpdateDirectDebitsResponseTns) o;
    return Objects.equals(this.exception, updateDirectDebitsResponseTns.exception) &&
        Objects.equals(this.response, updateDirectDebitsResponseTns.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDirectDebitsResponseTns {\n");
    
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

