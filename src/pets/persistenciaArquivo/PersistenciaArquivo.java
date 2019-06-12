/*
 * PetSOS
 * Aplicativo para localicação de animais domésticos perdidos
 * Projeto de Programação Orientada a Objetos I
 */

/**
 * @author Brunna Dalzini
 * @author Maikysuel Braga
 * @author Rafaela Pessin
*/ 

package pets.persistenciaArquivo;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import pets.modelo.Animal;
import pets.modelo.Clinica;
import pets.modelo.ContaLogada;
import pets.modelo.Dono;

public class PersistenciaArquivo {

    public void salvarDadosClinica(Clinica clinica) throws Exception {

        File arq = new File("clinica.csv");       
        if (arq.exists()){
            try {
                arq.createNewFile();
                FileWriter arqWriter;
                arqWriter = new FileWriter(arq, true);

                PrintWriter escreveArq = new PrintWriter(arqWriter);
                
                escreveArq.println(clinica.getContato().getEmail() + 
                ";" + clinica.getNome() + 
                ";" + clinica.getEndereco().getRua() + 
                "," + clinica.getEndereco().getNumero() +
                "," + clinica.getEndereco().getBairro() +
                "," + clinica.getEndereco().getCidade() +
                "," + clinica.getEndereco().getEstado() +
                "," + clinica.getEndereco().getCep() +
                "," + clinica.getEndereco().getComplemento() +        
                ",;" + clinica.getContato().getTelefone() + 
                ";" + clinica.getContato().getCelular() +
                ";" + clinica.getRedeSocial().getFacebook() + 
                ";" + clinica.getRedeSocial().getInstagram() + 
                ";" + clinica.getRedeSocial().getTwitter() + 
                ";" + clinica.getRedeSocial().getWhatsapp());
                   
                escreveArq.flush();
                escreveArq.close();
                
            } catch (IOException e) {
                e.printStackTrace();
                throw new Exception ("Não foi possível salvar Clínica.");
            }
        }
        else{
            try {
            arq.createNewFile();
            FileWriter arqWriter;
            arqWriter = new FileWriter(arq, true);
            
            PrintWriter escreveArq = new PrintWriter(arqWriter);
            escreveArq.println("Email;Clínica;Endereço;Telefone;Celular;"
                    + "Facebook;Instagram;Twitter;Whatsapp");
            
            escreveArq.println(clinica.getContato().getEmail() + 
                ";" + clinica.getNome() + 
                ";" + clinica.getEndereco().getRua() + 
                "," + clinica.getEndereco().getNumero() +
                "," + clinica.getEndereco().getBairro() +
                "," + clinica.getEndereco().getCidade() +
                "," + clinica.getEndereco().getEstado() +
                "," + clinica.getEndereco().getCep() +
                "," + clinica.getEndereco().getComplemento() +        
                ",;" + clinica.getContato().getTelefone() + 
                ";" + clinica.getContato().getCelular() +
                ";" + clinica.getRedeSocial().getFacebook() + 
                ";" + clinica.getRedeSocial().getInstagram() + 
                ";" + clinica.getRedeSocial().getTwitter()+ 
                ";" + clinica.getRedeSocial().getWhatsapp());
             
            escreveArq.flush();
            escreveArq.close();

        } catch (IOException e) {
            e.printStackTrace();
            throw new Exception ("Não foi possível salvar Clínica.");
        }
        }        
    }    
public void salvarDadosDono(Dono dono) throws Exception {
        
        File arq = new File("dono.csv");
        
        if (arq.exists()){
            try {
                arq.createNewFile();
                FileWriter arqWriter;
                arqWriter = new FileWriter(arq, true);

                PrintWriter escreveArq = new PrintWriter(arqWriter);
                
                escreveArq.println(dono.getContato().getEmail() + ";"  +  
                dono.getNome() +
                ";" + dono.getEndereco().getRua() + 
                "," + dono.getEndereco().getNumero() +
                "," + dono.getEndereco().getBairro() +
                "," + dono.getEndereco().getCidade() +
                "," + dono.getEndereco().getEstado() +
                "," + dono.getEndereco().getCep() +
                "," + dono.getEndereco().getComplemento() +        
                ",;" + dono.getContato().getTelefone() + 
                ";" + dono.getContato().getCelular() +
                ";" + dono.getRedeSocial().getFacebook() + 
                ";" + dono.getRedeSocial().getInstagram() + 
                ";" + dono.getRedeSocial().getTwitter()+ 
                ";" + dono.getRedeSocial().getWhatsapp() +
                ";" + dono.getSenha() + ";");

                escreveArq.flush();
                escreveArq.close();

            } catch (IOException e) {
                e.printStackTrace();
                throw new Exception ("Não foi possível salvar Dono.");
            }
        }
        else{
            try {
            arq.createNewFile();
            FileWriter arqWriter;
            arqWriter = new FileWriter(arq, true);
            
            PrintWriter escreveArq = new PrintWriter(arqWriter);
            
            escreveArq.println("Email;Dono do Animal;Endereço;Telefone;Celular;"
                    + "Facebook;Instagram;Twitter;Whatsapp;Senha");
            
            escreveArq.println(dono.getContato().getEmail() + ";"  +  
                dono.getNome() +
                ";" + dono.getEndereco().getRua() + 
                "," + dono.getEndereco().getNumero() +
                "," + dono.getEndereco().getBairro() +
                "," + dono.getEndereco().getCidade() +
                "," + dono.getEndereco().getEstado() +
                "," + dono.getEndereco().getCep() +
                "," + dono.getEndereco().getComplemento() +        
                ",;" + dono.getContato().getTelefone() + 
                ";" + dono.getContato().getCelular() +
                ";" + dono.getRedeSocial().getFacebook() + 
                ";" + dono.getRedeSocial().getInstagram() + 
                ";" + dono.getRedeSocial().getTwitter()+ 
                ";" + dono.getRedeSocial().getWhatsapp() +
                ";" + dono.getSenha() + ";");

             
            escreveArq.flush();
            escreveArq.close();

        } catch (IOException e) {
            e.printStackTrace();
            throw new Exception ("Não foi possível salvar Dono.");
        }
        }
    }
    public void AtualizarDadosDono(Dono dono, String arquivo) throws Exception {
        
        File arq = new File(arquivo);
        File newArq = new File("tempArquivo.csv");
        
        ContaLogada contaLogada = new ContaLogada();
        String contaOn = contaLogada.getEmailLogado();

    try {
        //Indicamos o arquivo que será lido
        FileReader fileReader = new FileReader(arq);
        //Criamos o objeto bufferReader que nos oferece o 
        FileWriter escreveArq = new FileWriter(newArq);
        //Criamos o objeto bufferReader que nos oferece o método de leitura readLine()
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        //String que irá receber cada linha do arquivo
        String linha = "";

        //Fazemos um loop linha a linha no arquivo, enquanto ele seja diferente de null.
        //O método readLine() devolve a linha na posicao do loop para a variavel linha.
        boolean verificador = false;
        while ((linha = bufferedReader.readLine()) != null) {
            //Aqui imprimimos a linha
            int i=0;
            String email="";
            //Concatena as strings do nome
            while (linha.charAt(i) != ';'){
                email = email + linha.charAt(i);
                i=i+1;
            }
            
            //escreve linhas em novo arquivo enquanto nome diferente de removeClinica
            if (!email.equals(contaOn)){
                escreveArq.write(linha + "\r\n");          
            }
            else{
                JOptionPane.showMessageDialog(null, contaOn + " atualizado.");
                verificador = true;
                escreveArq.write(dono.getContato().getEmail() + ";"  +  
                dono.getNome() +
                ";" + dono.getEndereco().getRua() + 
                "," + dono.getEndereco().getNumero() +
                "," + dono.getEndereco().getBairro() +
                "," + dono.getEndereco().getCidade() +
                "," + dono.getEndereco().getEstado() +
                "," + dono.getEndereco().getCep() +
                "," + dono.getEndereco().getComplemento() +        
                ",;" + dono.getContato().getTelefone() + 
                ";" + dono.getContato().getCelular() +
                ";" + dono.getRedeSocial().getFacebook() + 
                ";" + dono.getRedeSocial().getInstagram() + 
                ";" + dono.getRedeSocial().getTwitter()+ 
                ";" + dono.getRedeSocial().getWhatsapp() +
                ";" + dono.getSenha() + ";" + "\r\n");
                
            }        
        }
        if (!verificador)
            JOptionPane.showMessageDialog(null, contaOn + " não cadastrado.");
            //System.out.println("Não cadastrado.");
            //liberamos o fluxo dos objetos ou fechamos o arquivo
        
        escreveArq.flush();      
        escreveArq.close();
        fileReader.close();     
        bufferedReader.close();
        
        arq.delete();
        newArq.renameTo(new File(arquivo));

        
	} catch (IOException e) {
    	e.printStackTrace();
        throw new Exception ("Não foi possível deletar nome.");
        }
    }
     
    public void salvarDadosAnimal(Animal animal) throws Exception {
        File arq = new File("animal.csv");
        
        if (arq.exists()){
            try {
                arq.createNewFile();
                FileWriter arqWriter;
                arqWriter = new FileWriter(arq, true);

                PrintWriter escreveArq = new PrintWriter(arqWriter);
                
                escreveArq.println(animal.getNome() + 
                    ";" + animal.getTipo() +
                    ";" + animal.getCor() + 
                    ";" + animal.getRaca() +
                    ";" + animal.getSexo()+
                    ";" + animal.getPorte() +
                    ";" + animal.getIdade() +
                    ";" + animal.getCastracao() +
                    ";" + animal.getVacinaV10() +
                    ";" + animal.getVacinaAntirrabica() + 
                    ";" + animal.getVermifugacao()+
                    ";" + animal.getUltimaLocalizacao()+  
                    ";" + animal.getObservacao());

                escreveArq.flush();
                escreveArq.close();

            } catch (IOException e) {
                e.printStackTrace();
                throw new Exception ("Não foi possível salvar Animal.");
            }
        } 
        else{
            try {
            arq.createNewFile();
            FileWriter arqWriter;
            arqWriter = new FileWriter(arq, true);
            
            PrintWriter escreveArq = new PrintWriter(arqWriter);
            
            escreveArq.println("Nome;Tipo;Cor;Raça;Sexo;Porte;Idade;Castratado;VacinaV10"
                    +"Vacina Antirrábica;Vermifugado;Último local visto;Informações Adicionais");
            
            escreveArq.println(animal.getNome() + 
                    ";" + animal.getTipo() +
                    ";" + animal.getCor() + 
                    ";" + animal.getRaca() +
                    ";" + animal.getSexo()+
                    ";" + animal.getPorte() +
                    ";" + animal.getIdade() +
                    ";" + animal.getCastracao() +
                    ";" + animal.getVacinaV10() +
                    ";" + animal.getVacinaAntirrabica() + 
                    ";" + animal.getVermifugacao()+
                    ";" + animal.getUltimaLocalizacao()+  
                    ";" + animal.getObservacao());
                     
            escreveArq.flush();
            escreveArq.close();

        } catch (IOException e) {
            e.printStackTrace();
            throw new Exception ("Não foi possível salvar Animal.");
        }
        }
    }
    
     public void contaLogada(String email) throws IOException, Exception{
        File arq = new File("contaOn.txt");
        
        try{
            arq.createNewFile();
            FileWriter arqWriter;
            arqWriter = new FileWriter(arq, false);

            PrintWriter escreveArq = new PrintWriter(arqWriter);

            escreveArq.println(email);

            escreveArq.flush();
            escreveArq.close();

        } catch (IOException e) {
            e.printStackTrace();
            throw new Exception ("Não foi possível salvar Animal.");
        }
     }    
        
    public void deletarDadosAnimal(String remover, String arquivo) throws Exception {
        File arq = new File(arquivo);
        File newArq = new File("tempArquivo.csv");

    try {
        //Indicamos o arquivo que será lido
        FileReader fileReader = new FileReader(arq);
        //Criamos o objeto bufferReader que nos oferece o 
        FileWriter fileWriter = new FileWriter(newArq);
        //Criamos o objeto bufferReader que nos oferece o método de leitura readLine()
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        //String que irá receber cada linha do arquivo
        String linha = "";

        //Fazemos um loop linha a linha no arquivo, enquanto ele seja diferente de null.
        //O método readLine() devolve a linha na posicao do loop para a variavel linha.
        boolean verificador = false;
        while ((linha = bufferedReader.readLine()) != null) {
            //Aqui imprimimos a linha
            //System.out.println(linha);
            int i=0;
            String nome="";
            //Concatena as strings do nome
            while (linha.charAt(i) != ';'){
                nome = nome + linha.charAt(i);
                i=i+1;
            }
            
            //escreve linhas em novo arquivo enquanto nome diferente de removeClinica
            if (!nome.equals(remover)){
                fileWriter.write(linha + "\r\n");          
            }
            else{
                JOptionPane.showMessageDialog(null, remover + " removido.");
                //System.out.println(remover + " removido.");
                verificador = true;
            }        
        }
        if (!verificador)
            JOptionPane.showMessageDialog(null, remover + " não cadastrado.");
            //System.out.println("Não cadastrado.");
            //liberamos o fluxo dos objetos ou fechamos o arquivo
        
                
        fileWriter.close();
        fileReader.close();     
        bufferedReader.close();
        
        arq.delete();
        newArq.renameTo(new File(arquivo)); 
        
        
	} catch (IOException e) {
    	e.printStackTrace();
        throw new Exception ("Não foi possível deletar nome.");
        }
    }
}