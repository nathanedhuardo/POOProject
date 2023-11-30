package POOProject;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        // Criando um Gerente
        Gerente gerente = new Gerente("João Gerente", 5000.0, "TI");
        System.out.println("Gerente antes da serialização: " + gerente.toString());

        // Serializando  e Desserializando o objeto Gerente + Verificando o objeto depois de ser desserializado.
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("gerente.ser"))) {
            outputStream.writeObject(gerente);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Gerente gerenteDesserializado = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("gerente.ser"))) {
            gerenteDesserializado = (Gerente) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (gerenteDesserializado != null) {
            System.out.println("Gerente após desserialização: " + gerenteDesserializado.toString());
            System.out.println("Bônus do Gerente após desserialização: " + gerenteDesserializado.calcularBonus());
        }

        System.out.println();

        Desenvolvedor desenvolvedor = new Desenvolvedor("Maria Dev", 3000.0, "Java");
        System.out.println("Desenvolvedor antes da serialização: " + desenvolvedor.toString());
        
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("desenvolvedor.ser"))) {
            outputStream.writeObject(desenvolvedor);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Desenvolvedor desenvolvedorDesserializado = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("desenvolvedor.ser"))) {
            desenvolvedorDesserializado = (Desenvolvedor) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (desenvolvedorDesserializado != null) {
            System.out.println("Desenvolvedor após desserialização: " + desenvolvedorDesserializado.toString());
            System.out.println("Bônus do Desenvolvedor após desserialização: " + desenvolvedorDesserializado.calcularBonus());
        }
    }
}