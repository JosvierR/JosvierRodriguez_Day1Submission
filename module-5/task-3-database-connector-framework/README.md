# Task 3

## Question

(Abstract Database Connector Framework): Design an abstract class `DatabaseConnector` with fields `connectionString`, concrete `connect()`, `disconnect()`, and abstract method `executeQuery(String sql)`. Implement concrete drivers `MySqlConnector` and `PostgreSqlConnector` with specific query execution logic. ---------------------------- End of Document----------------------------------------------------------------------------------------------

## How I understand it

The abstract class has the things every database connector shares, like connecting and disconnecting. Then MySQL and PostgreSQL implement their own way of executing a query. I can use both through the same DatabaseConnector type.

## Verified output

```text
Connected to: localhost/my_database
MySQL executing: SELECT * FROM users
Database disconnected.
```
