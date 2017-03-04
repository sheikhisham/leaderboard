/**
 * 
 */
package hish.spring.cloud.leaderboard.resource;

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
	
	@RequestMapping(value = "/lifts", method = RequestMethod.POST)
	public String recordLift(LiftRequest liftRequest) {
		log.debug("Got a request {}", liftRequest);
		return "success";
	}
}
