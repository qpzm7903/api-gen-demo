package com.qpzm7903.common.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.qpzm7903.common.model.FieldError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ErrorDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-02T08:43:50.596522200+08:00[Asia/Shanghai]")
public class ErrorDetail implements Serializable {

  private static final long serialVersionUID = 1L;

  private String errorCode;

  @Valid
  private List<@Valid FieldError> errorFields;

  private String debugInfo;

  public ErrorDetail errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * 详细错误码
   * @return errorCode
  */
  
  @Schema(name = "errorCode", example = "VALIDATION_FAILED", description = "详细错误码", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ErrorDetail errorFields(List<@Valid FieldError> errorFields) {
    this.errorFields = errorFields;
    return this;
  }

  public ErrorDetail addErrorFieldsItem(FieldError errorFieldsItem) {
    if (this.errorFields == null) {
      this.errorFields = new ArrayList<>();
    }
    this.errorFields.add(errorFieldsItem);
    return this;
  }

  /**
   * 字段验证错误列表
   * @return errorFields
  */
  @Valid 
  @Schema(name = "errorFields", description = "字段验证错误列表", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorFields")
  public List<@Valid FieldError> getErrorFields() {
    return errorFields;
  }

  public void setErrorFields(List<@Valid FieldError> errorFields) {
    this.errorFields = errorFields;
  }

  public ErrorDetail debugInfo(String debugInfo) {
    this.debugInfo = debugInfo;
    return this;
  }

  /**
   * 调试信息（仅开发环境）
   * @return debugInfo
  */
  
  @Schema(name = "debugInfo", example = "Validation failed for field 'email'", description = "调试信息（仅开发环境）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("debugInfo")
  public String getDebugInfo() {
    return debugInfo;
  }

  public void setDebugInfo(String debugInfo) {
    this.debugInfo = debugInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetail errorDetail = (ErrorDetail) o;
    return Objects.equals(this.errorCode, errorDetail.errorCode) &&
        Objects.equals(this.errorFields, errorDetail.errorFields) &&
        Objects.equals(this.debugInfo, errorDetail.debugInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorFields, debugInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetail {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorFields: ").append(toIndentedString(errorFields)).append("\n");
    sb.append("    debugInfo: ").append(toIndentedString(debugInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

