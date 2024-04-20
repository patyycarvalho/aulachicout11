package br.com;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Hello world!
 *
 */
public class App {
     public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("João", 30);

    try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("pessoa.dat"))) {
        // Serializando o objeto Pessoa
        outputStream.writeObject(pessoa);
        System.out.println("Objeto Pessoa serializado com sucesso!");
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}