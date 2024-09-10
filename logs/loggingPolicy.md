# Logging Policy for TDD

## Introduction
The purpose of this document is to outline the logging policy for the TDD sandbox to ensure consistent and effective logging practices.

## Logging Framework
TDD uses SLF4J (version 2.0.13) with Logback (version 1.4.14) for logging.

## Log Levels
- **TRACE**: Detailed information, typically of interest only when diagnosing problems.
- **DEBUG**: Information useful to developers for debugging the application.
- **INFO**: Informational messages highlighting the progress of the application.
- **WARN**: Potentially harmful situations.
- **ERROR**: Error events that might still allow the application to continue running.

## Log Format
Log messages will adhere to the following format:
```
     %d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n
```
## Sample Log Entry
```
     2023-01-01 12:00:00 [main] INFO com.example.MyApp - Application started
```
## Log Storage
Logs are stored on the local file system under `logs/` directory.
- Application logs: `logs/app.log`
- Error logs: `logs/error.log`

## Log Rotation and Retention
- **Rolling Policy**: Logs are rolled daily and when the log file exceeds 10MB.
- **Retention Policy**: Up to 3000 days of logs are retained so the examples will remain
- **Total Size Cap**: 30MB max with a max file size of 1MB

## Logging Configuration
The `logback.xml` configuration is located in `src/main/resources`.

## Key Configurations
```xml
    <appender name="FILE" class="ch.qos.logback.core.rolling.RollingFileAppender">
    <file>logs/app.log</file>
    <rollingPolicy class="ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy">
        <fileNamePattern>logs/app.%d{yyyy-MM-dd}.%i.log</fileNamePattern>
        <maxFileSize>1MB</maxFileSize>
        <maxHistory>3000</maxHistory>   <!-- Set to 3000 to retain logs for this eg. -->
        <totalSizeCap>30MB</totalSizeCap>
    </rollingPolicy>
    <encoder>
        <pattern>%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n</pattern>
    </encoder>
</appender>
```

## Best Practices
- Avoid logging sensitive information such as passwords.
- Use appropriate log levels to avoid clutter.
- Ensure logs are meaningful and provide enough context.

## Maintenance and Monitoring
Regularly monitor log sizes and ensure the retention policy is strictly followed. Use tools like ELK (Elasticsearch, Logstash, Kibana) stack for centralized logging and analysis.

## Appendix
For further reading, refer to the [SLF4J Manual](https://www.slf4j.org/manual.html) and [Logback Documentation](http://logback.qos.ch/documentation.html).