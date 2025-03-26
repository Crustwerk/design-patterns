package com.crustwerk;

/*
Necessità:
    Costruire un oggetto complesso passo dopo passo.

Quando usarlo:
    Quando un oggetto ha molte possibili configurazioni e vuoi separare la creazione dell'oggetto
    dalla sua rappresentazione finale.

*/


import java.net.StandardSocketOptions;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Post.Builder builder = new Post.Builder().text("text").category("category");
        Post post = builder.build();
        System.out.println(post.getTitle());
    }
}