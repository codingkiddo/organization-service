
http://localhost:8070/eureka/apps/
http://localhost:8070/eureka/apps/LICENSING-SERVICE

java -Dspring.cloud.config.uri=http://localhost:8888 -Dspring.profiles.active=dev -jar target/organization-service-0.0.6-SNAPSHOT.jar