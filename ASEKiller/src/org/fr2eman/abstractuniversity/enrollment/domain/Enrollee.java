package org.fr2eman.abstractuniversity.enrollment.domain;

public class Enrollee {
	
	private String firstName;
	private String lastName;
	private int score;
	private Statement state;
	private boolean jumpedQueue;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public boolean isJumpedQueue() {
		return jumpedQueue;
	}
	public void setJumpedQueue(boolean jumpedQueue) {
		this.jumpedQueue = jumpedQueue;
	}
	public Enrollee(int score, boolean jumpedQueue) {
		super();
		this.score = score;
		this.jumpedQueue = jumpedQueue;
	}
	public Enrollee(int score, Statement state, boolean jumpedQueue) {
		super();
		this.score = score;
		this.state = state;
		this.jumpedQueue = jumpedQueue;
	}
	public Statement getState() {
		return state;
	}
	public void setState(Statement state) {
		this.state = state;
	}
	
}
