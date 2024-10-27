# telegram-bot-quarkus

This project is a simple example of a telegram bot using quarkus.
It is fully created following the https://core.telegram.org/bots/api

It is gradually being improved to be more complete and to have more features.

### 20/10/2024:
Features:
- send message
- send photo
- send animation ( gif )

Integration:
- postgresql
- binance api

### 26/10/2024:
Features:
- menu with buttons
- interactive inline keyboard with callback

### 27/10/2024:
Features:
- interactive reply keyboard with callback ( doesn't work on telegram desktop )

---
## useful commands
```
docker run --name postgres -e POSTGRES_PASSWORD=postgres -p 5432:5432 -d postgres
docker start postgres
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
```

### for common use of the project
```
./mvnw quarkus:dev -Ddebug=5005
```

### for specific use of the project
- create a profile in the application.properties file ( like application-gab.properties )
- add your token and your bot name
- execute the command below:

```
./mvnw quarkus:dev -Ddebug=5005 -Dquarkus.profile=gab
```