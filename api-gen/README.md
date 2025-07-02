# OpenAPI Generator 学习演示项目

本项目用于学习openapi generator，设置了4个模块：
- **common** - 公共模块，提供API的一些公共结构体，这些公共的类是使用yaml直接生成的，提供给其他三个模块使用
- **menu-service** - 菜单管理，提供菜单的基础API
- **permission-service** - 权限管理，提供权限的基础API
- **user-service** - 用户管理，提供用户的基础API

## 项目目标
通过此项目学习：
1. OpenAPI 3.0 规范的编写
2. OpenAPI Generator Maven 插件的配置和使用
3. 多模块项目中的 API 代码生成最佳实践
4. 公共组件的抽取和复用

## 详细任务列表

### 第一阶段：项目结构准备
- [x] 创建多模块 Maven 项目结构
- [x] 配置根 pom.xml，定义模块依赖关系
- [x] 为每个子模块配置基础 pom.xml

### 第二阶段：API 规范设计
- [x] 创建统一的 API 规范目录 `api-specs/`
- [x] 完成架构设计，设计四个模块之间的依赖关系，每个模块负责什么东西。使用Planuml呈现。归档在arch目录里

PS:阶段2只要求设计API，编写api的yaml文件，并且支持生成

### 第三阶段：Maven 插件配置
- [x] 配置 common 模块的 OpenAPI Generator 插件
  - [x] 只生成 model 类（DTO/Entity）
  - [x] 配置生成的包名和类名规范
- [x] 配置 user-service 模块的 OpenAPI Generator 插件
  - [x] 生成 API 接口和 model 类
  - [x] 配置 Spring Boot 相关注解
- [x] 配置 menu-service 模块的 OpenAPI Generator 插件
- [x] 配置 permission-service 模块的 OpenAPI Generator 插件

### 第四阶段：API YAML编写与生成验证
- [x] 设计公共数据结构 YAML (`common-types.yaml`) ✅ **BUILD SUCCESS**
  - [x] 定义通用响应结构 (ModelApiResponse, ErrorResponse, ErrorDetail, FieldError)
  - [x] 定义通用错误码和异常结构 (ErrorResponse, ErrorDetail)
  - [x] 定义基础数据类型 (ID, NumericID, Timestamp, Status)
  - [x] 定义分页结构 (PageData, PaginationInfo, PageRequest)
  - [x] 定义审计字段 (AuditInfo, CreateInfo, UpdateInfo, SoftDeleteInfo) 
  - [x] 定义搜索过滤 (SearchRequest)
  - [x] **代码生成验证通过 - 13个模型类成功生成**
- [ ] 设计用户服务 API (`user-service-api.yaml`)
  - [ ] 用户注册、登录、登出接口
  - [ ] 用户信息查询、更新接口
  - [ ] 用户列表分页查询接口
- [ ] 设计菜单服务 API (`menu-service-api.yaml`)
  - [ ] 菜单创建、更新、删除接口
  - [ ] 菜单树形结构查询接口
  - [ ] 菜单权限关联接口
- [ ] 设计权限服务 API (`permission-service-api.yaml`)
  - [ ] 权限创建、更新、删除接口
  - [ ] 角色管理接口
  - [ ] 用户角色分配接口

PS要求：每个任务完成都必须保证编译通过，每添加一个模块的yaml，就应该完成对应代码生成的验证。


### 第五阶段：代码生成和集成
- [ ] 执行 common 模块代码生成
- [ ] 配置各服务模块对 common 模块的依赖
- [ ] 执行各服务模块代码生成
- [ ] 验证生成的代码编译通过
- [ ] 添加必要的业务实现代码

### 第六阶段：测试和文档
- [ ] 为每个服务添加基础的 Controller 实现
- [ ] 配置 Swagger UI 界面
- [ ] 编写简单的集成测试
- [ ] 完善项目文档和使用说明

## 技术规范

### 目录结构规范
```
api-gen/
├── api-specs/                 # API规范文件目录
│   ├── common-types.yaml     # 公共数据结构
│   ├── user-service-api.yaml # 用户服务API
│   ├── menu-service-api.yaml # 菜单服务API
│   └── permission-service-api.yaml # 权限服务API
├── common/                   # 公共模块
├── user-service/            # 用户服务
├── menu-service/            # 菜单服务
└── permission-service/      # 权限服务
```

### 代码生成规范
1. **包名规范**：`com.qpzm7903.{service-name}.{api/model}`
2. **生成位置**：`src/main/java/` 目录下
3. **公共模块**：只生成 model 类，不生成 API 接口
4. **服务模块**：生成完整的 API 接口和 model 类

### API 设计规范
1. 遵循 RESTful API 设计原则
2. 统一的响应格式和错误处理
3. 合理的 HTTP 状态码使用
4. 完整的 API 文档和示例

## 📋 RULES - 项目开发规范

### 🎯 核心原则
**所有后续的开发工作必须严格遵循本 README.md 中定义的规范和任务列表。**

### ✅ 任务执行规则
1. **按阶段执行**：必须按照第一阶段→第二阶段→第三阶段→第四阶段→第五阶段→第六阶段的顺序进行
2. **任务完成标记**：每完成一个任务，必须将对应的 `[ ]` 更新为 `[x]`
3. **依赖关系**：下一阶段的任务开始前，必须确保上一阶段的所有任务已完成
4. **文档同步**：任何代码变更都必须同步更新到 README.md 中
5. **🔥 编译验证（强制）**：每个任务完成后，必须执行 `mvn clean compile` 确保整个项目编译通过，编译失败的任务视为未完成

### 🏗️ 开发规范强制要求
1. **包名**：严格遵循 `com.qpzm7903.{service-name}.{api/model}` 格式
2. **目录结构**：必须遵循技术规范中定义的目录结构
3. **文件命名**：API 规范文件必须使用指定的命名格式
4. **代码生成**：
   - common 模块：只生成 model 类，禁止生成 API 接口
   - 服务模块：生成完整的 API 接口和 model 类

### 🔄 工作流程规范
1. **开始任务前**：必须先检查 README.md 中的任务列表和当前进度
2. **执行过程中**：遇到问题或需要调整时，必须先更新 README.md 中的相关内容
3. **完成任务后**：
   - 执行 `mvn clean compile` 验证编译通过
   - 更新任务状态为 `[x]`
   - 记录完成情况和遇到的问题

### 📝 沟通规范
1. **引用规范**：讨论项目内容时，必须引用 README.md 中的相关章节
2. **变更申请**：如需修改规范，必须明确说明原因并更新 README.md
3. **进度汇报**：定期检查任务完成情况，确保项目按计划进行

### 🚫 禁止事项
1. 禁止跳过任务阶段或随意调整任务顺序
2. 禁止偏离已定义的技术规范
3. 禁止在未更新 README.md 的情况下进行重大变更
4. 禁止创建规范外的目录结构或文件命名
5. **🚫 禁止提交编译失败的代码**：任何导致项目编译失败的变更都必须立即修复或回滚

---
**⚠️ 重要提醒：违反以上 Rules 的任何操作都必须立即停止并重新规划。本 README.md 是项目的唯一权威指导文档。**