package com.qpzm7903.common.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
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
 * ModelApiResponse
 */

@JsonTypeName("ApiResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-02T08:43:50.596522200+08:00[Asia/Shanghai]")
public class ModelApiResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  private Boolean success;

  private String code;

  private String message;

  private JsonNullable<Object> data = JsonNullable.<Object>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  private String traceId;

  public ModelApiResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ModelApiResponse(Boolean success, String code, String message, OffsetDateTime timestamp) {
    this.success = success;
    this.code = code;
    this.message = message;
    this.timestamp = timestamp;
  }

  public ModelApiResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * 请求是否成功
   * @return success
  */
  @NotNull 
  @Schema(name = "success", example = "true", description = "请求是否成功", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public ModelApiResponse code(String code) {
    this.code = code;
    return this;
  }

  /**
   * 响应状态码
   * @return code
  */
  @NotNull 
  @Schema(name = "code", example = "SUCCESS", description = "响应状态码", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ModelApiResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * 响应消息
   * @return message
  */
  @NotNull 
  @Schema(name = "message", example = "操作成功", description = "响应消息", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ModelApiResponse data(Object data) {
    this.data = JsonNullable.of(data);
    return this;
  }

  /**
   * 响应数据，类型根据具体接口而定
   * @return data
  */
  
  @Schema(name = "data", description = "响应数据，类型根据具体接口而定", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public JsonNullable<Object> getData() {
    return data;
  }

  public void setData(JsonNullable<Object> data) {
    this.data = data;
  }

  public ModelApiResponse timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * ISO 8601 格式的时间戳
   * @return timestamp
  */
  @NotNull @Valid 
  @Schema(name = "timestamp", example = "2024-01-01T12:00Z", description = "ISO 8601 格式的时间戳", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public ModelApiResponse traceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * 请求追踪ID
   * @return traceId
  */
  
  @Schema(name = "traceId", example = "trace_abc123", description = "请求追踪ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("traceId")
  public String getTraceId() {
    return traceId;
  }

  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelApiResponse _apiResponse = (ModelApiResponse) o;
    return Objects.equals(this.success, _apiResponse.success) &&
        Objects.equals(this.code, _apiResponse.code) &&
        Objects.equals(this.message, _apiResponse.message) &&
        equalsNullable(this.data, _apiResponse.data) &&
        Objects.equals(this.timestamp, _apiResponse.timestamp) &&
        Objects.equals(this.traceId, _apiResponse.traceId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, code, message, hashCodeNullable(data), timestamp, traceId);
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
    sb.append("class ModelApiResponse {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
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

