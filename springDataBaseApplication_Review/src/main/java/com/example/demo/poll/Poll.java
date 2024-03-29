package com.example.demo.poll;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Poll {
	@Id
	@Column
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
		this.VoteID = voteID;
	}
	public String getPollTitle() {
		return PollTitle;
	}
	public void setPollTitle(String pollTitle) {
		this.PollTitle = pollTitle;
	}
	public int getTotalVotes() {
		return TotalVotes;
	}
	public void setTotalVotes(int totalVotes) {
		this.TotalVotes = totalVotes;
	}
	public String getYesVoter() {
		return YesVoter;
	}
	public void setYesVoter(String yesVoter) {
		this.YesVoter = yesVoter;
	}
	public String getNoVoter() {
		return NoVoter;
	}
	public void setNoVoter(String noVoter) {
		this.NoVoter = noVoter;
	}
	public String getVoterName() {
		return VoterName;
	}
	public void setVoterName(String voterName) {
		this.VoterName = voterName;
	}
	public String getVoterEmail() {
		return VoterEmail;
	}
	public void setVoterEmail(String voterEmail) {
		this.VoterEmail = voterEmail;
	}
	public String getVoterLocation() {
		return VoterLocation;
	}
	public void setVoterLocation(String voterLocation) {
		this.VoterLocation = voterLocation;
	}
	public String getVoteTimestamp() {
		return VoteTimestamp;
	}
	public void setVoteTimestamp(String voteTimestamp) {
		this.VoteTimestamp = voteTimestamp;
	}
	public String getPollDescription() {
		return PollDescription;
	}
	public void setPollDescription(String pollDescription) 
	{
		this.PollDescription = pollDescription;
	}
	
	
	
	

}
