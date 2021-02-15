参考地址：https://www.tutorialspoint.com/log4j/index.htm

// 1. 添加项目到JAVA
    <!-- https://mvnrepository.com/artifact/log4j/log4j -->
    <dependency>
        <groupId>log4j</groupId>
        <artifactId>log4j</artifactId>
        <version>1.2.17</version>
    </dependency>
    
// 2. Create log4j.properties file
    #Setting the log level for app.
    # console, myFile are variables to configure Console and FileAppender
    log4j.rootLogger=DEBUG,console,myFile

    #configuration for Console Object
    log4j.appender.console=org.apache.log4j.ConsoleAppender
    log4j.appender.console.layout=org.apache.log4j.PatternLayout
    log4j.appender.console.layout.ConversionPattern=%m%n

    # configuration for File Appender
    log4j.appender.myFile=org.apache.log4j.RollingFileAppender
    log4j.appender.myFile.File=demoLogs.log
    log4j.appender.myFile.layout=org.apache.log4j.PatternLayout
    log4j.appender.myFile.layout.ConversionPattern={%p}    [%c]     %m    %d{MMM-dd-yyyy EEEE z HH:mm:ss }             %n

    # Symbols or Wild Cards
    # %m - message
    # %n - new line or line break
    # %p - log level
    # %c - class name
    # %d - date and time

// 3. Create reference for logger in the class
    import org.apache.log4j.Logger; //导包
    private static Logger log=Logger.getLogger(Main.class); //创建静态变量并修改类名
    log.trace("Hello from TRACE");
    log.debug("Hello from DEBUG");
    log.info("Hello from INFO");
    log.warn("Hello from WARN");
    log.error("Hello from ERROR");
    log.fatal("Hello from FATAL");