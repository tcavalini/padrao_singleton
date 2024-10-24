public class DatabaseConnectionManager {

    private static DatabaseConnectionManager instance;


    private String connection;


    private DatabaseConnectionManager() {
        this.connection = "Conexão ao banco de dados estabelecida.";
    }

    public static DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    public void executeQuery(String query) {
        System.out.println("Executando consulta: " + query);
    }

    public void closeConnection() {
        System.out.println("Conexão ao banco de dados fechada.");
        instance = null;
    }

    public String getConnectionStatus() {
        return connection;
    }
}
