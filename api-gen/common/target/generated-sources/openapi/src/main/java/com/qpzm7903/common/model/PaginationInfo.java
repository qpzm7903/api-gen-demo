package com.qpzm7903.common.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * PaginationInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-02T08:43:50.596522200+08:00[Asia/Shanghai]")
public class PaginationInfo implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer pageNumber = 1;

  private Integer pageSize = 20;

  private Integer totalElements;

  private Integer totalPages;

  private Boolean hasNext;

  private Boolean hasPrevious;

  public PaginationInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaginationInfo(Integer pageNumber, Integer pageSize, Integer totalElements, Integer totalPages, Boolean hasNext, Boolean hasPrevious) {
    this.pageNumber = pageNumber;
    this.pageSize = pageSize;
    this.totalElements = totalElements;
    this.totalPages = totalPages;
    this.hasNext = hasNext;
    this.hasPrevious = hasPrevious;
  }

  public PaginationInfo pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * 页码，从1开始
   * minimum: 1
   * @return pageNumber
  */
  @NotNull @Min(1) 
  @Schema(name = "pageNumber", example = "1", description = "页码，从1开始", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public PaginationInfo pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * 分页大小，默认20，最大100
   * minimum: 1
   * maximum: 100
   * @return pageSize
  */
  @NotNull @Min(1) @Max(100) 
  @Schema(name = "pageSize", example = "20", description = "分页大小，默认20，最大100", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public PaginationInfo totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * 总记录数
   * minimum: 0
   * @return totalElements
  */
  @NotNull @Min(0) 
  @Schema(name = "totalElements", example = "100", description = "总记录数", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalElements")
  public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public PaginationInfo totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * 总页数
   * minimum: 0
   * @return totalPages
  */
  @NotNull @Min(0) 
  @Schema(name = "totalPages", example = "5", description = "总页数", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public PaginationInfo hasNext(Boolean hasNext) {
    this.hasNext = hasNext;
    return this;
  }

  /**
   * 是否有下一页
   * @return hasNext
  */
  @NotNull 
  @Schema(name = "hasNext", example = "true", description = "是否有下一页", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hasNext")
  public Boolean getHasNext() {
    return hasNext;
  }

  public void setHasNext(Boolean hasNext) {
    this.hasNext = hasNext;
  }

  public PaginationInfo hasPrevious(Boolean hasPrevious) {
    this.hasPrevious = hasPrevious;
    return this;
  }

  /**
   * 是否有上一页
   * @return hasPrevious
  */
  @NotNull 
  @Schema(name = "hasPrevious", example = "false", description = "是否有上一页", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hasPrevious")
  public Boolean getHasPrevious() {
    return hasPrevious;
  }

  public void setHasPrevious(Boolean hasPrevious) {
    this.hasPrevious = hasPrevious;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationInfo paginationInfo = (PaginationInfo) o;
    return Objects.equals(this.pageNumber, paginationInfo.pageNumber) &&
        Objects.equals(this.pageSize, paginationInfo.pageSize) &&
        Objects.equals(this.totalElements, paginationInfo.totalElements) &&
        Objects.equals(this.totalPages, paginationInfo.totalPages) &&
        Objects.equals(this.hasNext, paginationInfo.hasNext) &&
        Objects.equals(this.hasPrevious, paginationInfo.hasPrevious);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, totalElements, totalPages, hasNext, hasPrevious);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationInfo {\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
    sb.append("    hasPrevious: ").append(toIndentedString(hasPrevious)).append("\n");
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

