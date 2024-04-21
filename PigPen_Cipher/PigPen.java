import java.io.File;
import java.util.HashMap;

import static java.lang.System.in;


public class PigPen{

    private static HashMap<Integer,String> symbols = new HashMap<>();
    static{
       // symbols.put(1, "Symbol Images/1.png")
        // Mapon secilin imazh ne HashMap
       for(int i=1;i<=26;i++){
           symbols.put(i, "Symbol Images/"+i+".png");
       }
         symbols.put(27,"Symbol Images/space.png");
    }

    public static String[] encrypt(String plainText,String key){

        //Konfiguro sipas key
       HashMap<Integer, String> keySymbols = PigPen.keyConfig(key);

        if(key.isEmpty()){
            //Nese nuk ka vendos key leje default
                  keySymbols = symbols;
        }

       for(int i=1;i<=27;i++){
           System.out.println(keySymbols.get(i));
       }
        String[] imagesPath = new String[plainText.length()];

        char[] plainTextCharArray = plainText.toCharArray();

        //per secilen shkornje e mapon ni simbol i cili eshte path ne Symbol Images
        for(int i=0;i<plainTextCharArray.length;i++){
            if(Character.isLowerCase(plainTextCharArray[i])){
                imagesPath[i] = keySymbols.get(plainTextCharArray[i] - 'a' +1);
            }else if(Character.isUpperCase(plainTextCharArray[i])){
                imagesPath[i] = keySymbols.get(plainTextCharArray[i] - 'A' +1);
            }else{
                //Nese nuk eshte shkronje vetem shto space//
                imagesPath[i] = symbols.get(27);
            }
        }
       return imagesPath;
    }

    private static HashMap<Integer, String> keyConfig(String key) {

        //Ne baze te stringut gjenden pozicionet e elementev te # dhe X dhe ndryshohen ne hash MAp

        // key duhet vendosur ne format #.-#-X-X.
        HashMap<Integer, String> configuredSymbols = new HashMap<>();

        if (key.length() != 9) {
            System.err.println("Key nuk eshte dhene si duhet");
            //throw new RuntimeException();
        }
        String[] gridAndX = key.split("-");

        int counter = 0;
        for (int i = 0; i < gridAndX.length; i++) {

            if (gridAndX[i].equals("#")) {
                for (int j = 1; j <= 9; j++) {
                    configuredSymbols.put(i + j + counter, symbols.get(j));
                }
                counter += 8;
            }
            if (gridAndX[i].equals("#.")) {
                for (int j = 1; j <= 9; j++) {
                    configuredSymbols.put(i + j + counter, symbols.get(9 + j));
                }
                counter += 8;
            }
            if (gridAndX[i].equals("X")) {
                for (int j = 1; j <= 4; j++) {
                    configuredSymbols.put(i + j + counter, symbols.get(18 + j));
                }
                counter += 3;
            }
            if (gridAndX[i].equals("X.")) {
                for (int j = 1; j <= 4; j++) {
                    configuredSymbols.put(i + j + counter, symbols.get(22 + j));
                }
                counter += 3;
            }
        }
        configuredSymbols.put(27, "Symbol Images/space.png");
        return configuredSymbols;
    }

}
