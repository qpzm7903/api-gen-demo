# API 规范文件目录

此目录包含本项目所有的 OpenAPI 3.0 规范文件，用于生成各模块的 API 代码。

## 文件结构

```
api-specs/
├── common-types.yaml              # 公共数据结构定义
├── user-service-api.yaml          # 用户管理服务 API 规范
├── menu-service-api.yaml          # 菜单管理服务 API 规范
└── permission-service-api.yaml    # 权限管理服务 API 规范
```

## 文件说明

### common-types.yaml
定义所有服务共用的数据结构：
- 通用响应结构 (ApiResponse, PageResult 等)
- 通用错误码和异常结构
- 基础数据类型 (ID, 时间戳等)

### user-service-api.yaml
用户管理服务的 API 接口定义：
- 用户注册、登录、登出接口
- 用户信息查询、更新接口
- 用户列表分页查询接口

### menu-service-api.yaml
菜单管理服务的 API 接口定义：
- 菜单创建、更新、删除接口
- 菜单树形结构查询接口
- 菜单权限关联接口

### permission-service-api.yaml
权限管理服务的 API 接口定义：
- 权限创建、更新、删除接口
- 角色管理接口
- 用户角色分配接口

## 设计原则

1. **遵循 OpenAPI 3.0 规范**
2. **RESTful API 设计原则**
3. **统一的响应格式和错误处理**
4. **合理的 HTTP 状态码使用**
5. **完整的 API 文档和示例**

## 代码生成规则

- **common 模块**：从 `common-types.yaml` 生成公共 model 类
- **service 模块**：从对应的 API 规范文件生成 API 接口和 model 类
- **包名规范**：`com.qpzm7903.{service-name}.{api/model}`

---
此目录是 OpenAPI Generator 学习演示项目的核心组成部分。 