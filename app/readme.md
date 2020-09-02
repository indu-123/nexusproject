# Docker Build and Run

```zshclear
docker build -t aw/blog:0.0.1-SNAPSHOT --build-arg JAR_FILE=/app-0.0.1-SNAPSHOT.jar .
mvn clean install

docker run --name blog001 --rm -it aw/blog-fabric8:0.0.1-SNAPSHOT
docker run --name blog001 --rm -it aw/blog-spotify:0.0.1-SNAPSHOT
```

Google Jib:

```zsh
docker run -d -p 5000:5000 --name registry registry:2
mvn clean install -P jib
docker pull localhost:5000/aw/blog-google:0.0.1-SNAPSHOT
docker run --name blog001 --rm -it localhost:5000/aw/blog-google:0.0.1-SNAPSHOT
```