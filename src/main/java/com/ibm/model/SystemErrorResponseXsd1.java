package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SystemErrorResponseXsd1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-12T10:09:22.616Z[GMT]")

public class SystemErrorResponseXsd1   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("description")
  private String description;

  @JsonProperty("system")
  private String system;

  public SystemErrorResponseXsd1 code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(value = "")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SystemErrorResponseXsd1 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SystemErrorResponseXsd1 system(String system) {
    this.system = system;
    return this;
  }

  /**
   * Get system
   * @return system
  */
  @ApiModelProperty(value = "")


  public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemErrorResponseXsd1 systemErrorResponseXsd1 = (SystemErrorResponseXsd1) o;
    return Objects.equals(this.code, systemErrorResponseXsd1.code) &&
        Objects.equals(this.description, systemErrorResponseXsd1.description) &&
        Objects.equals(this.system, systemErrorResponseXsd1.system);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, system);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemErrorResponseXsd1 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
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

