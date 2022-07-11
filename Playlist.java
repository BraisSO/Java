import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist= new ArrayList<String>();

desertIslandPlaylist.add("Wonderwall");
desertIslandPlaylist.add("Zapatillas");
desertIslandPlaylist.add("Viva la vida");
desertIslandPlaylist.add("Snow");
desertIslandPlaylist.add("Californication");
desertIslandPlaylist.add("The last standing");
desertIslandPlaylist.add("Ryuji");

System.out.println(desertIslandPlaylist);

System.out.println(desertIslandPlaylist.size());

desertIslandPlaylist.remove("Ryuji");
desertIslandPlaylist.remove(5);

int a = desertIslandPlaylist.indexOf("Wonderwall");
int b = desertIslandPlaylist.indexOf("Californication");

desertIslandPlaylist.set(a,"Californication");  
desertIslandPlaylist.set(b,"Wonderwall");

System.out.println(desertIslandPlaylist);


  }
  
}