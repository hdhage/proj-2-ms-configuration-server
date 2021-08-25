package configurationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Proj2MsConfigurationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proj2MsConfigurationServerApplication.class, args);
	}

}
