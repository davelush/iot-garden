package io.digitalsandpit.garden.configuration;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDynamoDBRepositories(basePackages = "io.digitalsandpit.garden.dynamodb")
public class DynamoDBConfig {

    @Bean
    public AmazonDynamoDB amazonDynamoDB() {
        AmazonDynamoDB amazonDynamoDB = new AmazonDynamoDBClient();
        //TODO this shouldn't be hard-coded. Pull out into a configuration file / environment variable
        amazonDynamoDB.setEndpoint("dynamodb.eu-west-1.amazonaws.com");
        return amazonDynamoDB;
    }
}
