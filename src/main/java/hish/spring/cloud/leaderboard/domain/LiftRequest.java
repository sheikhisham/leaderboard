package hish.spring.cloud.leaderboard.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LiftRequest {
	private String lifterName;
	private String exerciseName;
	private int reps;
	private double weight;
}
