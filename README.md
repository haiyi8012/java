## java

### InputStream 和Reader的区别
Reader是Java的IO库提供的另一个输入流接口。和InputStream的区别是，InputStream是一个字节流，
即以byte为单位读取，而Reader是一个字符流，即以char为单位读取

### Class对象的getResourceAsStream()可以从classpath中读取指定资源；
根据classpath读取资源时，需要检查返回的InputStream是否为null。
```
try (InputStream input = getClass().getResourceAsStream("/default.properties")) {
    if (input != null) {
        // TODO:
    }
}
```

### try(resource)的语法
Java 7引入的新的try(resource)的语法，只需要编写try语句，让编译器自动为我们关闭资源。
```
public void readFile() throws IOException {
    try (InputStream input = new FileInputStream("src/readme.txt")) {
        int n;
        while ((n = input.read()) != -1) {
            System.out.println(n);
        }
    } // 编译器在此自动为我们写入finally并调用close()
}
```
```
"abc".equalsIgnoreCase("Abc"); //true 
"abc".equals("Abc"); //false
```
[廖总](https://www.liaoxuefeng.com/wiki/1252599548343744/1306580867874849#0)

