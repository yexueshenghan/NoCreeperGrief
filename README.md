# NoCreeperGrief

一个轻量 Fabric 模组，**禁止苦力怕爆炸破坏方块**，不影响其他生物破坏行为。

## 下载

[⬇️ 下载 v1.0.0 (Minecraft 1.21.4 + Fabric)](https://github.com/yexueshenghan/NoCreeperGrief/releases/tag/v1.0.0)

## 功能

- 苦力怕爆炸不再破坏地形
- 不影响其他生物（末影人、羊等）的正常行为
- 纯服务端，客户端无需安装
- 即装即用，无需配置

## 适用版本

- Minecraft 1.21.4
- Fabric Loader ≥ 0.16.0
- Fabric API（必需）

## 安装

1. 将 `NoCreeperGrief-1.21.4-fabric-1.0.0.jar` 放入服务端 `mods/` 文件夹
2. 重启服务器

## 构建

```bash
./gradlew build
```

构建产物位于 `build/libs/NoCreeperGrief-1.21.4-fabric-1.0.0.jar`

## 原理

使用 Mixin 注入到 `ExplosionImpl.shouldDestroyBlocks()`，检测爆炸来源为苦力怕时跳过方块破坏逻辑。

## 许可

MIT
