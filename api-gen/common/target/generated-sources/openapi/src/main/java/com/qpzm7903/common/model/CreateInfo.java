package com.qpzm7903.common.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
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
 * CreateInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-02T08:43:50.596522200+08:00[Asia/Shanghai]")
public class CreateInfo implements Serializable {

  private static final long serialVersionUID = 1L;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private String createdBy;

  public CreateInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateInfo(OffsetDateTime createdAt, String createdBy) {
    this.createdAt = createdAt;
    this.createdBy = createdBy;
  }

  public CreateInfo createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * ISO 8601 格式的时间戳
   * @return createdAt
  */
  @NotNull @Valid 
  @Schema(name = "createdAt", example = "2024-01-01T12:00Z", description = "ISO 8601 格式的时间戳", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public CreateInfo createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * 通用ID类型，支持字母、数字、下划线、连字符
   * @return createdBy
  */
  @NotNull @Pattern(regexp = "^[a-zA-Z0-9_-]+$") @Size(min = 1, max = 64) 
  @Schema(name = "createdBy", example = "user_123", description = "通用ID类型，支持字母、数字、下划线、连字符", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInfo createInfo = (CreateInfo) o;
    return Objects.equals(this.createdAt, createInfo.createdAt) &&
        Objects.equals(this.createdBy, createInfo.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, createdBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInfo {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

