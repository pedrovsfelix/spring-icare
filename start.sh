export USER=root
export PASSWORD=admin 
export DATABASE_URL='localhost' 
./mvnw package -Dmaven.test.skip
java -jar target/*.jar