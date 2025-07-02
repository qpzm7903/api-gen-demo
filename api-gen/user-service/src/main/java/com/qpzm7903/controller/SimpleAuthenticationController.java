package com.qpzm7903.controller;

import com.qpzm7903.user.api.AuthenticationApi;
import com.qpzm7903.user.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

/**
 * Simple Authentication Controller Implementation
 * 用户认证相关接口的简单实现，用于演示OpenAPI Generator生成的代码
 */
@RestController
public class SimpleAuthenticationController implements AuthenticationApi {

    @Override
    public ResponseEntity<Register201Response> register(UserRegisterRequest userRegisterRequest) {
        // 简单的注册逻辑演示
        Register201Response response = new Register201Response();
        
        // 创建用户信息
        UserInfo userInfo = new UserInfo();
        userInfo.setId(1001L);
        userInfo.setUsername(userRegisterRequest.getUsername());
        userInfo.setEmail(userRegisterRequest.getEmail());
        userInfo.setStatus(UserStatus.ACTIVE);
        
        response.setMessage("用户注册成功");
        response.setData(userInfo);
        
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Login200Response> login(UserLoginRequest userLoginRequest) {
        // 简单的登录逻辑演示
        Login200Response response = new Login200Response();
        
        // 创建登录响应数据
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setAccessToken("demo-jwt-token-" + System.currentTimeMillis());
        loginResponse.setTokenType("Bearer");
        loginResponse.setExpiresIn(3600);
        
        // 创建用户信息
        UserInfo userInfo = new UserInfo();
        userInfo.setId(1001L);
        userInfo.setUsername(userLoginRequest.getUsername());
        userInfo.setEmail("demo@example.com");
        userInfo.setStatus(UserStatus.ACTIVE);
        loginResponse.setUserInfo(userInfo);
        
        response.setMessage("登录成功");
        response.setData(loginResponse);
        
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<ModelApiResponse> logout() {
        // 简单的登出逻辑演示
        ModelApiResponse response = new ModelApiResponse();
        response.setSuccess(true);
        response.setCode("SUCCESS");
        response.setMessage("登出成功");
        response.setData(JsonNullable.of("用户已安全登出"));
        response.setTimestamp(OffsetDateTime.now());
        
        return ResponseEntity.ok(response);
    }
} 