# effective-java

## about this repository
Effective Java の内容を実践していくリポジトリ

* ベースはSpringBoot
* ただのJavaを動かせるようにCommandLineRunnerを実装している
  * 第一引数で 章-節 を選択、第2以降の引数をそのクラスに与える。

## Directory structure

src/main/java  
  ├EffectiveJavaApplication  
  ├/chapter1/ObjectLifecycle.java  
  └/chapter2/CommonMethod.java

## How to boot
```
# mvn clean package -Dmaven.test.skip=true
# java -jar target/*.jar (chapter)-(section)
```