```mermaid
    graph LR
    reactivegateway --> webproxy
    webproxy --> webapi
    webapi --> webproxy
    webproxy ---> reactivegateway
```
```shell
./gradlew bootRun --parallel
```