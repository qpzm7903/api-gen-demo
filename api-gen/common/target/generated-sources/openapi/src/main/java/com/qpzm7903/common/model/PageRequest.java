package com.qpzm7903.common.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * PageRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-02T08:43:50.596522200+08:00[Asia/Shanghai]")
public class PageRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer pageNumber = 1;

  private Integer pageSize = 20;

  private String sortBy;

  /**
   * 排序方向
   */
  public enum SortDirectionEnum {
    ASC("ASC"),
    
    DESC("DESC");

    private String value;

    SortDirectionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SortDirectionEnum fromValue(String value) {
      for (SortDirectionEnum b : SortDirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SortDirectionEnum sortDirection = SortDirectionEnum.DESC;

  public PageRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * 页码，从1开始
   * minimum: 1
   * @return pageNumber
  */
  @Min(1) 
  @Schema(name = "pageNumber", example = "1", description = "页码，从1开始", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public PageRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * 分页大小，默认20，最大100
   * minimum: 1
   * maximum: 100
   * @return pageSize
  */
  @Min(1) @Max(100) 
  @Schema(name = "pageSize", example = "20", description = "分页大小，默认20，最大100", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public PageRequest sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * 排序字段
   * @return sortBy
  */
  
  @Schema(name = "sortBy", example = "createdAt", description = "排序字段", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sortBy")
  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }

  public PageRequest sortDirection(SortDirectionEnum sortDirection) {
    this.sortDirection = sortDirection;
    return this;
  }

  /**
   * 排序方向
   * @return sortDirection
  */
  
  @Schema(name = "sortDirection", example = "DESC", description = "排序方向", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sortDirection")
  public SortDirectionEnum getSortDirection() {
    return sortDirection;
  }

  public void setSortDirection(SortDirectionEnum sortDirection) {
    this.sortDirection = sortDirection;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageRequest pageRequest = (PageRequest) o;
    return Objects.equals(this.pageNumber, pageRequest.pageNumber) &&
        Objects.equals(this.pageSize, pageRequest.pageSize) &&
        Objects.equals(this.sortBy, pageRequest.sortBy) &&
        Objects.equals(this.sortDirection, pageRequest.sortDirection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, sortBy, sortDirection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageRequest {\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortDirection: ").append(toIndentedString(sortDirection)).append("\n");
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

