

public class Função_String{
    public static void main(String[] args) {
        
        
        String original = "SANDERLEY SANTOS PEREIRA   ";

        String S01 = original.toLowerCase();/*Função para tranformar de maiuscula para minuscula  */
        String s02 = original.toUpperCase();//Função para tranformar em Minuscula;
        String s03 = original.trim();//Função para elinar os espaços nos cantos das strign
        String s04 = original.substring(9);// essa função ela pegar apartir da strign que eu definir e cria uma nova string 
        String s05 = original.replace('A', 'm');// SUBSTITUI UM CHAR POR OUTRO 
        int i = original.indexOf("S");//PRIMEIRA VEZ QUE APARECE 
        int j = original.lastIndexOf("S");//ULTIMA VEZ QUE APARECE 


        System.out.println("String Original : " + original );
        System.out.println("String com toLowCase():" + S01);
        System.out.println("String com toUperCase():" + s02);
        System.out.println("String com trim():" + s03 + "-");
        System.out.println("String com substring():" + s04 + "-");
        System.out.println("String com replece():" + s05 + "-");
        System.out.println("String com replece():" + i + "-");
        System.out.println("String com replece():" + j + "-");

    }

        

}
