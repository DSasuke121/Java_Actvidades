# Etapa 1: Construcción
FROM eclipse-temurin:19-jdk AS builder
WORKDIR /app

# Solo copiamos el pom.xml primero
COPY pom.xml .
# Instalamos maven en el contenedor para no depender del wrapper (.mvn)
RUN apt-get update && apt-get install -y maven

# Descargamos dependencias
RUN mvn dependency:go-offline

# Copiamos el código y compilamos
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: Ejecución
FROM eclipse-temurin:19-jre
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
