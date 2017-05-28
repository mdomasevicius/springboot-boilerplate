# Spring boot + groovy + ReactJS

Minimalistic bootstrap of libraries to kick-start development. Groovy is added into the 
mix for `spock` tests and to avoid tedious object mappings, 
constructions and to allow for more readable code. 

# What's inside?

 - Spring Boot
 - Groovy support
 - Acceptance test module for REST API testing
 - Docker/Docker-Compose ready
 - ReactJS + Redux UI up and ready (from [react-slingshot](https://github.com/coryhouse/react-slingshot))
    - Additionally added redux-logger, ant-design and proxy
 - Travis ready :)
 
# How to use?

 - Pre-requisits:
   - JDK 8
   - Docker/Docker-Compose
   - Node 7 (only if you wish to work on front-end)

 - Usage:
    - `git clone git@github.com:mdomasevicius/springboot-boilerplate.git`
    - `gradlew build` - build
    - `gradlew build -Pacceptance` - build and run acceptance test (requires docker/docker-compose)

# Acknowledgements
 - No security - since it varies per project basis
 - No datasource capabilities - since it varies per project basis
 - Hypermedia support is to be added but would be nice to have
 - Jackson is not configured to handle some java types like `java.time.*`
 - May need to configure [dependency-management-plugin](https://github.com/spring-gradle-plugins/dependency-management-plugin) 

# Notes
 - Rename packaging accordingly to you project domain.
 - Anyone is welcome to contribute, just raise a PR
