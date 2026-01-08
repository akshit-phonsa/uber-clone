# ======================
# Build Stage
# ======================
FROM maven:3.9-eclipse-temurin-22 AS build
WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline -B

COPY src ./src
RUN mvn clean package -DskipTests

# ======================
# Run Stage
# ======================
FROM eclipse-temurin:22-jre-jammy
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

# Render listens on PORT
EXPOSE 8080

HEALTHCHECK --interval=30s --timeout=3s --start-period=10s --retries=3 \
  CMD curl -f http://localhost:${PORT:-8080}/actuator/health || exit 1

ENTRYPOINT ["sh", "-c", "java --enable-preview -jar -Dserver.port=${PORT:-8080} app.jar"]
