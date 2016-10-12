package com.orion10110.training.ExersizeOne.Ex1;

import java.util.ArrayList;

/**
 * Notepad is class which keeps note. It Allow add, remove, update and view note
 * 
 * @author Kalach Artur
 * @version 1.0
 * @since 2016-10-09
 */
public class Notepad {

	/**
	 * Having note
	 * 
	 * @see Note
	 */
	private ArrayList<Note> notes = new ArrayList<Note>();
	/** Name of notepad */
	private String name;
	/** Name of owner */
	private String owner;

	/**
	 * Create a new notepad with the give name and owner.
	 * 
	 * @param name
	 *            The notepad name
	 * @param owner
	 *            The owner of notepad
	 */
	public Notepad(String name, String owner) {
		this.name = name;
		this.owner = owner;
	}

	/**
	 * Adding note in notepad
	 * 
	 * @param note
	 *            adding note
	 */
	public void AddNote(Note note) {
		notes.add(note);
	}

	/**
	 * Removing note from notepad
	 * 
	 * @param note
	 *            removing note
	 */
	public void RemoveNote(Note note) {
		if (notes.contains(note)) {
			notes.remove(note);
		}
	}

	/**
	 * Removing note from notepad
	 * 
	 * @param index
	 *            Index of removing note
	 */
	public void RemoveNote(int index) {
		try {
			notes.remove(index);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Note is not removed, index is out of range.");
		}
	}

	/**
	 * Link note update
	 * 
	 * @param index
	 *            Index of note
	 * @param note
	 *            new value of note in notepad
	 */
	public void updateNote(int index, Note note) {
		try {
			notes.set(index, note);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Note is not updated, index is out of range.");
		}
	}

	/**
	 * Update value note
	 * 
	 * @param index
	 *            Index of note
	 * @param title
	 *            new title value of note
	 * @param content
	 *            new content value of note
	 */
	public void updateNote(int index, String title, String content) {
		try {
			Note note = notes.get(index);
			note.setTitle(title);
			note.setContent(content);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Note is not updated, index is out of range.");
		}
	}

	/**
	 * Print notes from notepad
	 */
	public void printNote() {
		for (Note note : notes) {
			System.out.println(note);
		}
	}

	@Override
	public String toString() {
		return "Notepad [notes=" + notes + ", name=" + name + ", owner=" + owner + "]";
	}

	/**
	 * Gets note from notepad
	 * 
	 * @return this notes
	 */
	public ArrayList<Note> getNotes() {
		return notes;
	}

	/**
	 * Gets name of notepad
	 * 
	 * @return name of notepad
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets onew of notepad
	 * 
	 * @return owner of notepad
	 */
	public String getOwner() {
		return owner;
	}

}
