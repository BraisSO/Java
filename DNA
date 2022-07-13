//program that determines whether there is a protein in a strand of DNA.

public class DNA {
 
  public static void main(String[] args) {
 
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-

String dna1= "ATGCGATACGCTTGA";
 String dna2="ATGCGATACGTGA";
 String dna3="ATTAATATGTACTGA";

 String dna = dna2;

 System.out.println("DNA length= " + dna.length());

int firstCodon=dna.indexOf("ATG");
int lastCodon=dna.indexOf("TGA");

System.out.println(dna.indexOf("ATG"));
System.out.println(dna.indexOf("TGA"));

if(firstCodon!=-1 && lastCodon!=-1 && (firstCodon-lastCodon)%3==0 ){
String protein= dna.substring(3,6);
System.out.println(protein);
}
else{System.out.println("No protein");}

  }
 
}