package com.etity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//1 - Annotate the class as an entity and map it the the dabase table
@Entity
@Table(name = "instructor_detail")
public class InstructorDetail {
	
	//Steps:
	//1 - Annotate the class as an entity and map it the the dabase table
	//2 - Define the fields and mapp them to columns 
	//3 - Create constructors
	//4 - Generate Getters and Setters methods
	//5-  Genterate the toString() method to help us print the object
	
	
	//2 - Define the fields and mapp them to columns
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "youtube_channel")
	private String youtubeChannel;
	
	@Column(name = "hobby")
	private String hobby;
	
	
	//3 - Create constructors
	public InstructorDetail() {
		
	}


	public InstructorDetail(String youtubeChannel, String hobby) {
		super();
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
	}

	//4 - Generate Getters and Setters methods
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getYoutubeChannel() {
		return youtubeChannel;
	}


	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}


	public String getHobby() {
		return hobby;
	}


	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	//5-  Genterate the toString() method to help us print the object
	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", youtubeChannel=" + youtubeChannel + ", hobby=" + hobby + "]";
	}
	
	
	
	
	
	
	
}
