package com.orion10110.training.ExersizeOne.Starts;

import com.orion10110.training.ExersizeOne.Ex1.Note;
import com.orion10110.training.ExersizeOne.Ex1.Notepad;

public class Start {
	public static void main(String[] args) {
		Notepad notepad = new Notepad("MyNotes", "OwnerOne");
		notepad.AddNote(new Note("TItle","For me"));
		notepad.AddNote(new Note("How do that","This my second rcord"));
		notepad.AddNote(new Note("NN","NN6 n4"));
		notepad.printNote();
		System.out.println("---------------------");
		notepad.RemoveNote(6);
		notepad.RemoveNote(2);
		notepad.updateNote(0, new Note("Myxaxa","It's working"));
		notepad.printNote();
	}
}
