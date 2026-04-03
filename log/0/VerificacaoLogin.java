import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class VerificacaoLogin {


    // Inicialização do logger
    private static final Logger logger = LoggerFactory.getLogger(VerificacaoLogin.class);


    public static void main(String[] args) {
        // Simulação de entradas do usuário
        String usuarioCorreto = "admin";
        String senhaCorreta = "12345";


        // Tentativas de login
        realizarLogin("admin", "12345", usuarioCorreto, senhaCorreta); // Login correto
        realizarLogin("admin", "senhaErrada", usuarioCorreto, senhaCorreta); // Senha incorreta
        realizarLogin("usuarioDesconhecido", "12345", usuarioCorreto, senhaCorreta); // Usuário desconhecido
    }


    public static void realizarLogin(String usuario, String senha, String usuarioCorreto, String senhaCorreta) {
        logger.info("Tentativa de login com o usuario: " + usuario);
        if(usuario == usuarioCorreto && senha == senhaCorreta){
            logger.info("Tentativa de login bem-sucedida para o usuario: " + usuario);
        }else if(usuario == usuarioCorreto && senha != senhaCorreta){
            logger.error("Senha incorreta para o usuario: " + usuario);
        }else{
            logger.warn("Usuario " + usuario + " nao encontrado!");
        }
    }
}