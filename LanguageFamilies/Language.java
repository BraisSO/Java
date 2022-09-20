package LanguageFamilies;

public class Language {
	protected String name;
	protected int numSpeakers;
	protected String regionsSpoken;
	protected String wordOrder;

	public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
		this.name = name;
		this.numSpeakers = numSpeakers;
		this.regionsSpoken = regionsSpoken;
		this.wordOrder = wordOrder;
	}

	public void getInfo() {
		System.out.format(
				"%s is spoken by %d people mainly in %s.%n" + "The language follows the word order: %s.",
				this.name, this.numSpeakers, this.regionsSpoken, this.wordOrder);
	}

	public static void main(String[] args) {
		Language spanish= new Language("Spanish", 23232182, "Half-World", "S+v+p");
		spanish.getInfo();
		
		Mayan susua = new Mayan("Susua",1132);
		susua.getInfo();
		
		SinoTibetan mandarinChinese = new SinoTibetan("Mandarin Chinese", 2329832);
		SinoTibetan burnese= new SinoTibetan("burnese", 2323);
		
		mandarinChinese.getInfo();
		burnese.getInfo();
	}

}
