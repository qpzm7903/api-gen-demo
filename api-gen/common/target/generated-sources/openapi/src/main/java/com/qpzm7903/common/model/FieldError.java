package com.qpzm7903.common.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
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
 * FieldError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-02T08:43:50.596522200+08:00[Asia/Shanghai]")
public class FieldError implements Serializable {

  private static final long serialVersionUID = 1L;

  private String field;

  private String message;

  private JsonNullable<Object> rejectedValue = JsonNullable.<Object>undefined();

  public FieldError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FieldError(String field, String message) {
    this.field = field;
    this.message = message;
  }

  public FieldError field(String field) {
    this.field = field;
    return this;
  }

  /**
   * 错误字段名
   * @return field
  */
  @NotNull 
  @Schema(name = "field", example = "email", description = "错误字段名", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public FieldError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * 错误消息
   * @return message
  */
  @NotNull 
  @Schema(name = "message", example = "邮箱格式不正确", description = "错误消息", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public FieldError rejectedValue(Object rejectedValue) {
    this.rejectedValue = JsonNullable.of(rejectedValue);
    return this;
  }

  /**
   * 被拒绝的值
   * @return rejectedValue
  */
  
  @Schema(name = "rejectedValue", example = "invalid-email", description = "被拒绝的值", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rejectedValue")
  public JsonNullable<Object> getRejectedValue() {
    return rejectedValue;
  }

  public void setRejectedValue(JsonNullable<Object> rejectedValue) {
    this.rejectedValue = rejectedValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldError fieldError = (FieldError) o;
    return Objects.equals(this.field, fieldError.field) &&
        Objects.equals(this.message, fieldError.message) &&
        equalsNullable(this.rejectedValue, fieldError.rejectedValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, message, hashCodeNullable(rejectedValue));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldError {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    rejectedValue: ").append(toIndentedString(rejectedValue)).append("\n");
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

