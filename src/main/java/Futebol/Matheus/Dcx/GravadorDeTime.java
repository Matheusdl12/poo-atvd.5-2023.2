package Futebol.Matheus.Dcx;

import java.io.*;
import java.util.Map;

public class GravadorDeTime {
    public Map<String, Time>  leTimes() throws IOException {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("dadosTimes.dat"));
            return (Map<String, Time>) in.readObject();
        }catch (FileNotFoundException e){
            throw new IOException("Não foi encontrado o arquivo dados.dat", e);
        }catch (IOException e){
            throw e;
        }catch (ClassNotFoundException e){
            throw new IOException("Class dos objetos gravados no arquivo" + " dados.dat não existe", e);
        }finally {
            if (in != null){
                in.close();
            }
        }
    }

    public void gravaTimes(Map<String, Time> listasDeJogadoresEtimes) throws IOException{
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("dadosTimes.dat"));
            out.writeObject(listasDeJogadoresEtimes);
        }catch (FileNotFoundException e){
            throw new IOException("Não foi encontrado o arquivo dados.dat", e);
        }catch (IOException e){
            throw e;
        }finally {
            if (out != null){
                out.close();
            }
        }
    }

}//fim da class
