package org.westerndigital.wdhomeassignment;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@OpenAPIDefinition
public class WdHomeAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(WdHomeAssignmentApplication.class, args);
	}

}
