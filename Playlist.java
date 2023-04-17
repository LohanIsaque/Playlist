import java.util.ArrayList;
public class Playlist {
    public static void main (String[] args){
        ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>();
        listaParaIlhaDeserta.add("Inefavel");
        listaParaIlhaDeserta.add("Nunca Sozinho");
        listaParaIlhaDeserta.add("Vida Chique");
        listaParaIlhaDeserta.add("Meio pá");
        listaParaIlhaDeserta.add("Contagem");
        listaParaIlhaDeserta.add("Fim de Semana no Rio");
        listaParaIlhaDeserta.add("Felina");
        System.out.println(listaParaIlhaDeserta.size());
        listaParaIlhaDeserta.remove("Meio pá");
        listaParaIlhaDeserta.remove("Felina");
    	int indiceA = 1;
        int indiceB = 4;
        String temp = (listaParaIlhaDeserta.get(indiceA));
        System.out.println(temp);
        listaParaIlhaDeserta.set(indiceA, listaParaIlhaDeserta.get(indiceB));
        listaParaIlhaDeserta.set(indiceB, temp);
        System.out.println(listaParaIlhaDeserta);
           
    }
}