package com.orion10110.training.ExersizeOne.Ex3;

import java.util.ArrayList;

import com.orion10110.training.ExersizeOne.Ex1.Note;
import com.orion10110.training.ExersizeOne.interfaces.INotes;

public abstract class NotesStationery extends Stationery implements INotes {
	protected NotesStationery(String name, double price) {
		super(name, price);
	}

	private ArrayList<Note> notes = new ArrayList<Note>();
	
	public void addNote(WriterStationery writeStation, String text){
		notes.add(new Note("",writeStation.write(text)));
	}
	
	public void writeNote(){
		for(Note nt:notes){
			System.out.println(nt);
		}
	}
	
}
