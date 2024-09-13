## WD Home Assignment
This application use localstack as alternative to AWS to run and test in local environment.
I use docker to execute services used by the application, DynamoDb-local and localstack.

Steps to run and test the application:
1. Run DynamoDb-local
    ``` sh
    docker run -p 8000:8000 -v $(pwd)/local/dynamodb:/data/ amazon/dynamodb-local -jar DynamoDBLocal.jar -sharedDb -dbPath /data
    ```
2. Use localstack image and create the container
    ```sh
    docker pull localstack/localstack
    docker run --rm -it -p 4566:4566 -p 4510-4559:4510-4559 localstack/localstack
    ```
3. Use an IDE to run the application. The service should be available using swagger so you can test and execute request using it.
[Swagger](http://localhost:8080/western-digital/home-assignment/v1/api-docs/webjars/swagger-ui/index.html)



#### ℹ️ TODO ℹ️
This application is not complete, I leave below the improvements that can be made.
- Refactor code and unify the code in a controller.
- Include JUnit.
- Use docker-compose to provision services used by the application.
- Use AWS to deploy it.
- I include SpringWebFlux, so some features can be implemented to improve the perfomance.


