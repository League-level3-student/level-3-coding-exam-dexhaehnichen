import java.util.ArrayList;

public class VoteProcessor {
	public String calculateElectionWinner(ArrayList<String> votes) {
		int winner = 0;
		// positive = pope francis, negative = edward snowden
		for (int i = 0; i < votes.size(); i++) {
			if(votes.get(i).equalsIgnoreCase("Pope Francis")) {
				winner ++;
			}else if(votes.get(i).equalsIgnoreCase("Edward Snowden")) {
				winner --;
			}
		}
		if(winner > 0) {
			return "pope francis"; 
		}else if(winner < 0) {
			return "edward snowden";
		}else if(winner == 0) {
			return "TIE";
		}else {
			return "TIE";
		}
		
	}
}
