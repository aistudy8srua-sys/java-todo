# Java 17 実行環境
FROM eclipse-temurin:17-jre

# 作業ディレクトリ
WORKDIR /app

# jar をコピー
COPY target/todo-0.0.1-SNAPSHOT.jar app.jar

# ポート公開
EXPOSE 8080

# 起動コマンド
ENTRYPOINT ["java", "-jar", "app.jar"]
