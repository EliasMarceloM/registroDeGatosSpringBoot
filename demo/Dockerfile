FROM openjdk:17-oracle

# Adiciona o arquivo JAR do seu projeto Spring Boot para a imagem
ADD target/demo-0.0.1-SNAPSHOT.jar demo.jar

# Comando para executar a aplicação Spring Boot quando o contêiner for iniciado
ENTRYPOINT ["java", "-jar", "demo.jar"]

