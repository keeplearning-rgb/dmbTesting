package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.model.UpdateDirectDebitsResponseTns;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateDirectDebitsOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-12T10:09:22.616Z[GMT]")

public class UpdateDirectDebitsOutput   {
  @JsonProperty("Body")
  private UpdateDirectDebitsResponseTns body = null;

  public UpdateDirectDebitsOutput body(UpdateDirectDebitsResponseTns body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateDirectDebitsResponseTns getBody() {
    return body;
  }

  public void setBody(UpdateDirectDebitsResponseTns body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDirectDebitsOutput updateDirectDebitsOutput = (UpdateDirectDebitsOutput) o;
    return Objects.equals(this.body, updateDirectDebitsOutput.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDirectDebitsOutput {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

