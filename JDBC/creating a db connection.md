# Creating a Database Connection
To obtain a connection to the database, we need to have the credentials to our database. The location of the database is known as a **connection string**, which includes information about what SQL driver we're using, the ip address/domain, the port, and what the database name is.

Since we're utilizing Postgres, the beginning of our connection string will specifically be

`jdbc:postgresql:`

The final form of the connection string will be formatted as:

`jdbc:postgresql://<HOST_NAME>:<PORT>/<DB_NAME>`

In summary, what we need is
- A connection string
- Username
- Password

Steps to utilize JDBC:
1. Register the JDBC driver
2. Open a connection
3. Execute some JDBC statement using either
- `Statement`
- `PreparedStatement`
- `CallableStatement`
4. Retrieve the results that are returned in a `ResultSet` object