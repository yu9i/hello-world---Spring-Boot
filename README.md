# hello-world---Spring-Boot
## Contents

- [Code Execution](#Code-Execution)
- [Code](#Code)
  
---

## Code-Execution

### Prerequisites
- Spring Boot
- Java

### 1. Clone

```
$ git clone https://github.com/yu9i/hello-world---Spring-Boot.git
```

### 2. Start development server

#### 1) Command

```cmd
$ mvnw spring-boot:run
```

#### 2) Program

1. 'demo\src\main\java\com\example\demo\DemoApplication.java'로 이동
2. 우측 상단 또는 우클릭 'Run Java' 클릭하여 실행
   

##### 서버 시작 후, [`http://localhost:8080`](http://localhost:8080) 에 접속


## Code

### - index.html
##### (demo\src\main\resources\static\index.html)
처음(http://localhost:8080)에 표시될 파일.
Click 옆 'hello page'를 누르면 'http://localhost:8080/hello'로 이동한다.


### - HelloController.java
##### (demo\src\main\java\com\example\demo\controller\HelloController.java)
Spring Boot 어플리케이션 클래스(DemoApplication.java)와 같은 경로에 'Hello world'를 화면에 출력하는 파일을 만든다.
'/hello' API를 만들기 위해 데이터를 가져오는 @GetMapping 사용.


### - pom.xml
##### (demo\pom.xml)
웹을 사용하기 위해서 &lt;dependency&gt;에 'spring-boot-starter-web' 추가

