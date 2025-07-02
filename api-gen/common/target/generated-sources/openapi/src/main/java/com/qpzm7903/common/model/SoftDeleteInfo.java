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
 * SoftDeleteInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-02T08:43:50.596522200+08:00[Asia/Shanghai]")
public class SoftDeleteInfo implements Serializable {

  private static final long serialVersionUID = 1L;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime deletedAt;

  private String deletedBy;

  private Boolean isDeleted = false;

  public SoftDeleteInfo deletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

  /**
   * ISO 8601 格式的时间戳
   * @return deletedAt
  */
  @Valid 
  @Schema(name = "deletedAt", example = "2024-01-01T12:00Z", description = "ISO 8601 格式的时间戳", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletedAt")
  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  public SoftDeleteInfo deletedBy(String deletedBy) {
    this.deletedBy = deletedBy;
    return this;
  }

  /**
   * 通用ID类型，支持字母、数字、下划线、连字符
   * @return deletedBy
  */
  @Pattern(regexp = "^[a-zA-Z0-9_-]+$") @Size(min = 1, max = 64) 
  @Schema(name = "deletedBy", example = "user_123", description = "通用ID类型，支持字母、数字、下划线、连字符", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletedBy")
  public String getDeletedBy() {
    return deletedBy;
  }

  public void setDeletedBy(String deletedBy) {
    this.deletedBy = deletedBy;
  }

  public SoftDeleteInfo isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * 是否已删除
   * @return isDeleted
  */
  
  @Schema(name = "isDeleted", description = "是否已删除", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDeleted")
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftDeleteInfo softDeleteInfo = (SoftDeleteInfo) o;
    return Objects.equals(this.deletedAt, softDeleteInfo.deletedAt) &&
        Objects.equals(this.deletedBy, softDeleteInfo.deletedBy) &&
        Objects.equals(this.isDeleted, softDeleteInfo.isDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedAt, deletedBy, isDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftDeleteInfo {\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    deletedBy: ").append(toIndentedString(deletedBy)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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

