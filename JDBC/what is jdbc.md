# JDBC
JDBC stands for Java Database Connectivity. It is a relatively low-level API used to write Java code that interacts with relational databases via SQL.

The JDBC API has classes and interfaces that are located in the `java.sql` and `javax.sql` packages. There are several key classes and interfaces that are commonly encountered when writing JDBC code.

- `DriverManager` class: used to register a database driver
- `DataSource` interface: used to retrieve connections as an alternative to `DriverManager`
- `Connection` interface: represents the actual physical connection with the database
- `SQLException` class: this is the general exception that is thrown when something goes wrong when accessing the database
- `Statement` interface: used in order to execute SQL statements
- `PreparedStatement` interface: represents pre-compiled SQL statements (which you can also pass different parameters into)
- `CallableStatement` interface: used to execute stored procedures (user defined functions)
- `ResultSet` interface: represents data returned from the database