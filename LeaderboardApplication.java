package hish.spring.cloud.leaderboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LeaderboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaderboardApplication.class, args);
	}
}
