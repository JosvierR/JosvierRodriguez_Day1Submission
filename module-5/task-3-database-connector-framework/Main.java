abstract class DatabaseConnector {

    protected String connectionString;

    public DatabaseConnector(
            String connectionString
    ) {

        this.connectionString =
            connectionString;
    }

    public void connect() {

        System.out.println(
            "Connected to: "
            + connectionString
        );
    }

    public void disconnect() {

        System.out.println(
            "Database disconnected."
        );
    }

    public abstract void executeQuery(
        String sql
    );
}

class MySqlConnector
        extends DatabaseConnector {

    public MySqlConnector(
            String connectionString
    ) {

        super(connectionString);
    }

    @Override
    public void executeQuery(
            String sql
    ) {

        System.out.println(
            "MySQL executing: "
            + sql
        );
    }
}

class PostgreSqlConnector
        extends DatabaseConnector {

    public PostgreSqlConnector(
            String connectionString
    ) {

        super(connectionString);
    }

    @Override
    public void executeQuery(
            String sql
    ) {

        System.out.println(
            "PostgreSQL executing: "
            + sql
        );
    }
}

public class Main {

    public static void main(String[] args) {

        DatabaseConnector database =
            new MySqlConnector(
                "localhost/my_database"
            );

        database.connect();

        database.executeQuery(
            "SELECT * FROM users"
        );

        database.disconnect();
    }
}
