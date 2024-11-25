package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Parent.printMessage();
        Child.printMessage();
    }
}

/* Ответ: выводится в консоль "Parent"/"Parent" потому что, если у нас переменная статическая, то это глобальное значение — одно для всех.
* инфо: https://javarush.com/groups/posts/modifikator-static-java
* */
