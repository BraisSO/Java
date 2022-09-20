package LanguageFamilies;

public class SinoTibetan extends Language {

	public SinoTibetan(String name, int numSpeakers) {
		super(name, numSpeakers, "Asia", "subject-object-verb");
		
		if(this.name.contains("Chinese")||this.name.contains("chinese")) {
			this.wordOrder="subject-verb-object";
		}

	}

}
