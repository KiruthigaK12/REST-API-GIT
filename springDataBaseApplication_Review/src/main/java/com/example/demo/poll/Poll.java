package com.example.demo.poll;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Poll {
	@Id
	private int VoteID;
	private String PollTitle;
	private int TotalVotes;
	private String YesVoter;
	private String NoVoter;
	private String VoterName;
	private String VoterEmail;
	private String VoterLocation;
	private String VoteTimestamp;
	private String PollDescription;
	public int getVoteID() {
		return VoteID;
	}
	public void setVoteID(int voteID) {
		VoteID = voteID;
	}
	public String getPollTitle() {
		return PollTitle;
	}
	public void setPollTitle(String pollTitle) {
		PollTitle = pollTitle;
	}
	public int getTotalVotes() {
		return TotalVotes;
	}
	public void setTotalVotes(int totalVotes) {
		TotalVotes = totalVotes;
	}
	public String getYesVoter() {
		return YesVoter;
	}
	public void setYesVoter(String yesVoter) {
		YesVoter = yesVoter;
	}
	public String getNoVoter() {
		return NoVoter;
	}
	public void setNoVoter(String noVoter) {
		NoVoter = noVoter;
	}
	public String getVoterName() {
		return VoterName;
	}
	public void setVoterName(String voterName) {
		VoterName = voterName;
	}
	public String getVoterEmail() {
		return VoterEmail;
	}
	public void setVoterEmail(String voterEmail) {
		VoterEmail = voterEmail;
	}
	public String getVoterLocation() {
		return VoterLocation;
	}
	public void setVoterLocation(String voterLocation) {
		VoterLocation = voterLocation;
	}
	public String getVoteTimestamp() {
		return VoteTimestamp;
	}
	public void setVoteTimestamp(String voteTimestamp) {
		VoteTimestamp = voteTimestamp;
	}
	public String getPollDescription() {
		return PollDescription;
	}
	public void setPollDescription(String pollDescription) {
		PollDescription = pollDescription;
	}
	
	
	
	

}
