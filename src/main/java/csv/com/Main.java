package csv.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    private static final String DIR = System.getProperty("user.dir");
    private static final String SEPARATOR = System.getProperty("file.separator");
    private static final String CAMINHO = DIR + SEPARATOR + "src" + SEPARATOR + "main" + SEPARATOR + "resources" + SEPARATOR + "csv" + SEPARATOR + "arquivo.csv";

    public static void main(String[] args) {

        String csvArquivo = CAMINHO;

        BufferedReader conteudoCSV = null;
        String linha = "";
        String cvsSeparadorCampo = ";";

        try {
            conteudoCSV = new BufferedReader(new FileReader(csvArquivo));

            while ((linha = conteudoCSV.readLine())!=null){
                String[] moeda = linha.split(cvsSeparadorCampo);
                System.out.println("[DAta = " + moeda[0]
                        + ", Col 1 = " + moeda[1]
                        + ", Col 2 = " + moeda[2]
                        + ", Col 3 = " + moeda[3] + "]" );

            }
        } catch (FileNotFoundException e) {

            System.out.println("Arquivo não encontrado" +e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("IndexOfBounds" +e.getMessage());
        } catch (IOException e){
            System.out.println("IO Erro: " +e.getMessage());
        }finally {
            if(conteudoCSV!=null){
                try{
                    conteudoCSV.close();

                }catch (IOException e){
                    System.out.println("IO Erro: " +e.getMessage());
                }
            }
        }

    }
}
