package com.orion10110.training.ExersizeOne.Ex1;

import java.util.Date;

/**
 * Note is class which keeps user data recording
 * 
 * @author Kalach Artur
 * @version 1.0
 * @since 2016-10-09
 */
public class Note {
	/** The update date */
	private Date date;
	/** The title of note */
	private String title;
	/** The content of note */
	private String content;

	/**
	 * Create a new Note with the give title and content.
	 * 
	 * @param title
	 *            The title of note
	 * @param content
	 *            The content of note
	 */
	public Note(String title, String content) {
		this.date = new Date();
		this.title = title;
		this.content = content;
	}

	/**
	 * Gets the update date of note
	 * 
	 * @return this update date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Gets the title of note
	 * @return this title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Changed title of note
	 * @param title the new title of note
	 */
	public void setTitle(String title) {
		this.title = title;
		date = new Date();
	}

	/**
	 * Gets the content of note
	 * @return this content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Changed content of note
	 * @param content the new content of note
	 */
	public void setContent(String content) {
		this.content = content;
		date = new Date();
	}

	@Override
	public String toString() {
		return title + "\n " + date + "\n" + content;
	}

}
