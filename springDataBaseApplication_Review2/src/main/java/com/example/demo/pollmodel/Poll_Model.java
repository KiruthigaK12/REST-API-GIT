package com.example.demo.pollmodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="poll1")
public class Poll_Model {
     @Id
	private int voteID;
	private String pollTitle;
	private int totalVotes;
	private String yesVoter;
	private String noVoter;
	private String voterName;
	private String voterEmail;
	private String voterLocation;
	private String voteTimestamp;
	private String pollDescription;
	public int getVoteID() {
		return voteID;
	}
	public void setVoteID(int voteID) {
		this.voteID = voteID;
	}
	public String getPollTitle() {
		return pollTitle;
	}
	public void setPollTitle(String pollTitle) {
		this.pollTitle = pollTitle;
	}
	public int getTotalVotes() {
		return totalVotes;
	}
	public void setTotalVotes(int totalVotes) {
		this.totalVotes = totalVotes;
	}
	public String getYesVoter() {
		return yesVoter;
	}
	public void setYesVoter(String yesVoter) {
		this.yesVoter = yesVoter;
	}
	public String getNoVoter() {
		return noVoter;
	}
	public void setNoVoter(String noVoter) {
		this.noVoter = noVoter;
	}
	public String getVoterName() {
		return voterName;
	}
	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}
	public String getVoterEmail() {
		return voterEmail;
	}
	public void setVoterEmail(String voterEmail) {
		this.voterEmail = voterEmail;
	}
	public String getVoterLocation() {
		return voterLocation;
	}
	public void setVoterLocation(String voterLocation) {
		this.voterLocation = voterLocation;
	}
	public String getVoteTimestamp() {
		return voteTimestamp;
	}
	public void setVoteTimestamp(String voteTimestamp) {
		this.voteTimestamp = voteTimestamp;
	}
	public String getPollDescription() {
		return pollDescription;
	}
	public void setPollDescription(String pollDescription) {
		this.pollDescription = pollDescription;
	}
	
}
