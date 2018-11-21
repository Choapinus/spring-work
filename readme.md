0.- (optional) Install maven<br/>
```$ sudo apt install maven```

1.- Build using maven outside of the container<br/>
```$ mvn package```

2.- Run service with docker-compose<br/>
```$ docker-compose up -d```

3.- Go to *localhost:8080/v1/micro-service* in your browser or with Postman paste that url and use the four methods implemented (GET, POST, PUT, DELETE)<br/>
