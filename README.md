## thrift version
0.10.0

## dependences

```xml
<dependency>
            <groupId>org.apache.thrift</groupId>
            <artifactId>libthrift</artifactId>
            <version>0.10.0</version>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>1.7.25</version>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-simple</artifactId>
            <version>1.7.25</version>
        </dependency>
```
plugin

```xml
                <groupId>org.apache.thrift</groupId>
                <artifactId>thrift-maven-plugin</artifactId>
                <version>0.10.0</version>
```

## Implementing Service

```java
public class UserServiceImpl implements UserService.Iface {
}
```

## Register Service to server

```java
                    new TSimpleServer(new TServer.Args(serverTransport)
                    .processor(
                            new UserService.Processor<>(new UserServiceImpl())
                    )
```