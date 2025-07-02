# 架构设计文档目录

本目录包含 OpenAPI Generator Demo 项目的完整架构设计文档和图表。

## 📁 文件列表

| 文件名 | 描述 | 类型 |
|--------|------|------|
| `system-architecture.md` | 系统架构详细设计文档 | 文档 |
| `module-dependency.puml` | 模块依赖关系图 | PlantUML |
| `service-interaction.puml` | 服务交互流程图 | PlantUML |
| `system-overview.puml` | 系统整体架构图 | PlantUML |

## 🎯 架构设计要点

### 1. 模块划分原则
- **Common 模块**：公共数据模型提供者，被所有服务依赖
- **User Service**：用户生命周期管理和认证
- **Menu Service**：系统菜单和导航管理
- **Permission Service**：权限和角色管理

### 2. 依赖关系
```
编译时依赖: 所有服务模块 → Common 模块
运行时调用: User ↔ Permission ↔ Menu
```

### 3. 技术架构
- **代码生成**：OpenAPI Generator + Maven Plugin
- **框架技术**：Spring Boot 3.2.0 + Java 17
- **API 规范**：OpenAPI 3.0 YAML

## 🔧 使用 PlantUML 图表

### 在线查看
1. 访问 [PlantUML 在线编辑器](http://www.plantuml.com/plantuml/uml)
2. 复制 `.puml` 文件内容
3. 在线渲染查看图表

### 本地生成
```bash
# 安装 PlantUML
# 生成图片
java -jar plantuml.jar *.puml
```

### VS Code 插件
安装 PlantUML 插件，直接在 VS Code 中预览图表。

## 📋 架构演进计划

1. **第一阶段**：基础架构搭建 ✅
2. **第二阶段**：API 规范设计 🔄
3. **第三阶段**：代码生成配置
4. **第四阶段**：服务实现和集成
5. **第五阶段**：测试和文档完善

## 🎨 设计理念

- **学习导向**：便于理解 OpenAPI Generator 工作机制
- **模块化**：每个服务职责清晰，便于维护
- **标准化**：遵循 RESTful 和 OpenAPI 规范
- **可扩展**：架构支持后续功能扩展

---
此架构设计遵循微服务最佳实践，适合作为 OpenAPI Generator 学习演示项目。 