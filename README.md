# spring-boot-cat
## Add the following configuration to the application.yml
```yaml
 spring:
   application:
     name: application # cat domain
 cat:
   mode: client # cat mode, default client
   servers[0]:
     ip: 127.0.0.1:8080
     port: 2280
     httpPort: 8080
```