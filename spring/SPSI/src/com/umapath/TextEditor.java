package com.umapath;

public class TextEditor {
	
	public TextEditor(){
		System.out.println("Insite default TextEditor constructor ");
	}
	public TextEditor(SpellChecker spellChecker) { 
		System.out.println("Inside  parameterized TextEditor constructor." ); 
		this.spellChecker = spellChecker;
		}
	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
		System.out.println("setSpell");
	}
	public void spellCheck() {
	spellChecker.checkSpelling(); 
		System.out.println("TextEditor spellCheck");
		}

}
