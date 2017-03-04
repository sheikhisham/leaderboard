/**
 * 
 */
package hish.spring.cloud.leaderboard.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hish.spring.cloud.leaderboard.domain.LiftRequest;
import lombok.extern.slf4j.Slf4j;

/**
 * @author shisham
 *
 */
@RestController
@Slf4j
public class LeaderBoardResource {
	
	@Value("${server.port}")
	private int port;
	
	@RequestMapping(value = "/lifts", method = RequestMethod.POST)
	public String recordLift(LiftRequest liftRequest) {
		log.info("Got a request at %d {}", port, liftRequest);
		return "success";
	}
	
	@RequestMapping(value = "/answerme")
	public String answerMe() {
		return String.format("Answered by app running on %d", port);
	}
}
