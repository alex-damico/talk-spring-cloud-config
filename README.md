# talk-spring-cloud-config

## Client
Librerie usate:
- Spring Boot 2.3.7
    - Spring Boot DevTools
    - Spring Web
    - Spring Boot Actuator
    
Url
```
http://localhost:9876/
```

```
curl localhost:9876/actuator/refresh -d {} -H "Content-Type: application/json"
```

## Order
Librerie usate:
- npm i fastify --save
- npm i commander --save
- npm i cloud-config-client --save

Url
```
http://localhost:9877/
```

## Spring Config Server
Librerie usate:
- Spring Boot 2.3.7
    - Spring Boot DevTools
    - Spring Web
    - Spring Boot Actuator
    - Spring Cloud Config Server
    
Url
```
http://localhost:9879/
```

### Url
```
http://localhost:9879/application/common
http://localhost:9879/application/database
http://localhost:9879/client/database,dev
http://localhost:9879/client/database,test
```