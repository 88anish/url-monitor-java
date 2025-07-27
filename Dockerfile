FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY . .
RUN ./mvnw clean install -DskipTests || true
CMD ["java", "-jar", "target/url-monitor-1.0.jar"]