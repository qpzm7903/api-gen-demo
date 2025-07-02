package com.qpzm7903.common.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.qpzm7903.common.model.Status;
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
 * SearchRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-02T08:43:50.596522200+08:00[Asia/Shanghai]")
public class SearchRequest implements Serializable {

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

  private String keyword;

  private Status status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDate;

  public SearchRequest pageNumber(Integer pageNumber) {
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

  public SearchRequest pageSize(Integer pageSize) {
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

  public SearchRequest sortBy(String sortBy) {
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

  public SearchRequest sortDirection(SortDirectionEnum sortDirection) {
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

  public SearchRequest keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * 搜索关键词
   * @return keyword
  */
  @Size(max = 200) 
  @Schema(name = "keyword", example = "关键词", description = "搜索关键词", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keyword")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public SearchRequest status(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public SearchRequest startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * ISO 8601 格式的时间戳
   * @return startDate
  */
  @Valid 
  @Schema(name = "startDate", example = "2024-01-01T12:00Z", description = "ISO 8601 格式的时间戳", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public SearchRequest endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * ISO 8601 格式的时间戳
   * @return endDate
  */
  @Valid 
  @Schema(name = "endDate", example = "2024-01-01T12:00Z", description = "ISO 8601 格式的时间戳", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRequest searchRequest = (SearchRequest) o;
    return Objects.equals(this.pageNumber, searchRequest.pageNumber) &&
        Objects.equals(this.pageSize, searchRequest.pageSize) &&
        Objects.equals(this.sortBy, searchRequest.sortBy) &&
        Objects.equals(this.sortDirection, searchRequest.sortDirection) &&
        Objects.equals(this.keyword, searchRequest.keyword) &&
        Objects.equals(this.status, searchRequest.status) &&
        Objects.equals(this.startDate, searchRequest.startDate) &&
        Objects.equals(this.endDate, searchRequest.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, sortBy, sortDirection, keyword, status, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRequest {\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortDirection: ").append(toIndentedString(sortDirection)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

