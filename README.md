## java

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

