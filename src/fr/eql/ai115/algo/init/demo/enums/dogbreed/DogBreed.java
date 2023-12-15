package fr.eql.ai115.algo.init.demo.enums.dogbreed;

public enum DogBreed {

    FRENCH_BULLDOG("Bouledogue Français"),
    GOLDEN_RETRIEVER("Golden Retriever"),
    POODLE("Caniche"),
    BEAGLE("Beagle"),
    YORKSHIRE_TERRIER("Yorkshire Terrier"),
    CHIHUAHUA("Chihuahua"),
    BOXER("Boxer"),
    PEMBROKE_WELSH_CORGI ("Pembroke Welsh Corgi"),
    MINIATURE_SCHNAUZER("Schnauzer Nain"),
    IRISH_SETTER("Setter Irlandais");

    private final String label;


    DogBreed(String label) { this.label = label; }


    public String getLabel() { return label; }
}
