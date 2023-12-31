package com.todo.myfirstwebapp.todo;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

public class ToDo {

	private int id;
	private String username;
	private String desc;
	private LocalDate targetDate;
	private Boolean done;

	public ToDo(int id, String username, String desc, LocalDate targetDate, Boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.desc = desc;
		this.targetDate = targetDate;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public Boolean getDone() {
		return done;
	}

	public void setDone(Boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", username=" + username + ", desc=" + desc + ", targetDate=" + targetDate + ", done="
				+ done + "]";
	}

}
