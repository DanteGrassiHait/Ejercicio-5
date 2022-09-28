package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        List<String> myArray = new ArrayList<>();
        cargarArray(myArray, "palabra");
        cargarArray(myArray, "123");
        cargarArray(myArray, "palabraaaaa");
        cargarArray(myArray, "ññ");
        cargarArray(myArray, "hola que");
        System.out.println(funcion(myArray));

    }

    public static void cargarArray(List<String> myArray, String palabra){
        if(validaPalabra(palabra)){
            myArray.add(palabra);
        }
    }

    public static boolean validaPalabra(String palabra){
        if(palabra.length() <= 10){
            Pattern pattern = Pattern.compile("[a-zA-z]");
            Matcher matcher = pattern.matcher(palabra);
            return matcher.find();
        }
        return false;
    }

    public static String funcion(List<String> myArray){
        StringBuilder sb = new StringBuilder();
        myArray.forEach(palabra -> sb.append(palabra.toLowerCase()).append(" "));
        return sb.toString();
    }
}