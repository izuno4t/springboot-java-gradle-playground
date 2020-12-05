# Gradle のサンプルプロジェクト

## 構成

- SpringBoot
- Java11
- Gradle6
- Flyway

以下のプロジェクトに関する設定を

* 言語はJava8
* デファクトな静的解析のレポートをJenkinsで参照できるための設定

## TODO

* 実際のソースコードを追加する。
* テストクラスを作成して、カバレッジレポートまで出力する。

## Flyway

https://flywaydb.org/

* マイグレーション

```
./gradlew flywayMigrate -Dflyway.configFiles=./src/main/resources/application.properties
```

* スキーマ情報

```
./gradlew flywayInfo -Dflyway.configFiles=./src/main/resources/application.properties
```