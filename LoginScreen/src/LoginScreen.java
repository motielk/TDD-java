import java.util.HashMap;
import java.util.Map;

/**
 * Esta classe representa um sistema de login simples que gerencia a autenticação do usuário.
 */

public class LoginScreen {
	private Map<String, String> userDatabase;
	
	/**
     * Constrói uma nova tela de login e inicializa o banco de dados de usuários com usuários padrão.
     */
	
	public LoginScreen() {
		userDatabase = new HashMap<>();
		userDatabase.put("john", "password123");
		userDatabase.put("alice", "securepass");
	}
	
	/**
     * Tenta fazer login de um usuário com o nome de usuário e senha fornecidos.
     * 
     * @param username O nome de usuário do usuário tentando fazer login
     * @param password A senha fornecida pelo usuário
     * @return verdadeiro se o login for bem-sucedido, falso caso contrário
     */

	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		if (userDatabase.containsKey(username)) {
		    String storedPassword = userDatabase.get(username);
		    if (storedPassword.equals(password)) {
		        return true;
		    }
		}
		return false;
	}
	
	
	/**
     * Adiciona um novo usuário ao banco de dados de usuários com o nome de usuário e senha fornecidos.
     * 
     * @param username O nome de usuário do novo usuário
     * @param password A senha do novo usuário
     */

	public void addUser(String username, String password) {
		// TODO Auto-generated method stub
		userDatabase.put(username, password);
	}
}
