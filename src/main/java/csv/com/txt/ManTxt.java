package csv.com.txt;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ManTxt {

    private static final String DIR = System.getProperty("user.dir");
    private static final String SEPARATOR = System.getProperty("file.separator");
    private static final String CAMINHO = DIR + SEPARATOR + "src" + SEPARATOR + "main" + SEPARATOR + "resources" + SEPARATOR + "txt" + SEPARATOR + "arquivo.txt";

    public static void main(String[] args) {

        String linha = new String();
        File arq = new File(CAMINHO);


        if(arq.exists()){

            try {

                FileReader leitorDeArquivo = new FileReader(CAMINHO);
                BufferedReader bufferDeArquivo = new BufferedReader(leitorDeArquivo);

                while (true){
                    linha = bufferDeArquivo.readLine();
                    if (linha == null){
                        break;
                    }
                    System.out.println(linha);
                }

            }catch (Exception e){
                e.printStackTrace();

            }
        }



    }
}
