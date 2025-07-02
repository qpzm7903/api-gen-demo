package com.qpzm7903.common.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.qpzm7903.common.model.PaginationInfo;
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
 * PageData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-02T08:43:50.596522200+08:00[Asia/Shanghai]")
public class PageData implements Serializable {

  private static final long serialVersionUID = 1L;

  @Valid
  private List<Object> content = new ArrayList<>();

  private PaginationInfo pagination;

  public PageData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PageData(List<Object> content, PaginationInfo pagination) {
    this.content = content;
    this.pagination = pagination;
  }

  public PageData content(List<Object> content) {
    this.content = content;
    return this;
  }

  public PageData addContentItem(Object contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * 分页数据内容
   * @return content
  */
  @NotNull 
  @Schema(name = "content", description = "分页数据内容", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content")
  public List<Object> getContent() {
    return content;
  }

  public void setContent(List<Object> content) {
    this.content = content;
  }

  public PageData pagination(PaginationInfo pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   * @return pagination
  */
  @NotNull @Valid 
  @Schema(name = "pagination", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pagination")
  public PaginationInfo getPagination() {
    return pagination;
  }

  public void setPagination(PaginationInfo pagination) {
    this.pagination = pagination;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageData pageData = (PageData) o;
    return Objects.equals(this.content, pageData.content) &&
        Objects.equals(this.pagination, pageData.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageData {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

