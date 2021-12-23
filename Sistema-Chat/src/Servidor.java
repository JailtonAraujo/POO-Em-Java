import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 Aberta!");
		
		Socket Cliente = servidor.accept();
		System.out.println("Nova Conexão Com Cliente "+Cliente.getInetAddress().getHostAddress());
		
		Scanner scanner = new Scanner(Cliente.getInputStream());
		
		while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		
		scanner.close();
		servidor.close();
		Cliente.close();
	}
}
