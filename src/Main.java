public class Main {
    public static void main(String[] args) {

        DatabaseConnectionManager dbManager1 = DatabaseConnectionManager.getInstance();
        System.out.println(dbManager1.getConnectionStatus());

        dbManager1.executeQuery("SELECT * FROM usuarios");

        DatabaseConnectionManager dbManager2 = DatabaseConnectionManager.getInstance();

        System.out.println("As instâncias são iguais? " + (dbManager1 == dbManager2));

        dbManager1.closeConnection();

        DatabaseConnectionManager dbManager3 = DatabaseConnectionManager.getInstance();
        System.out.println(dbManager3.getConnectionStatus());
    }
}
