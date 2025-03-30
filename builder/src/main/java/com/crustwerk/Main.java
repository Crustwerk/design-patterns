package com.crustwerk;

/*
Necessità:
    Costruire un oggetto complesso passo dopo passo.

Quando usarlo:
    Quando un oggetto ha molte possibili configurazioni e vuoi separare la creazione dell'oggetto
    dalla sua rappresentazione finale.

*/

import com.crustwerk.classic.Post;
import com.crustwerk.interface_chaining.Person;

public class Main {
    public static void main(String[] args) {
        /*
        CLASSIC
        Classe pubblica "Post"
            - costruttore privato che prende un "Builder"
        Classe pubblica "Builder"
            - ha gli stessi campi di "Post"
            - ogni setter restituisce un "Builder"
            - metodo "build()" che crea un nuovo "Post" passando il Builder (this)
         */
        Post.Builder postBuilder = new Post.Builder()
                .text("text")
                .category("category");
        Post post = postBuilder.build();
        System.out.println(post.getTitle());

        /*
        ADVANCED
        Classe pubblica "Person"
            - costruttore che prende un builder
            - metodo statico "builder()" che restituisce un Builder di tipo FirstNameSetter.

        Interfaccia "FirstNameSetter"
            - metodo "firstName()" che restituisce oggetto di tipo LastNameSetter.

        Interfaccia "LastNameSetter"
            - metodo "lastName()" che restituisce oggetto di tipo OptionalFieldSetter.

        Interfaccia "OptionalFieldSetter"
            - metodi vari di parametri opzionali che restituiscono tutti Optional Field Setter
            - metodo "build()" che restituisce "Person".
         */

        Person person = Person.builder()
                .firstName("Pippo")
                .lastName("Buscemi")
                .email("puppa@pluto.org")
                .build();

        Person person2 = Person.builder()
                .firstName("Pippo")
                .lastName("Pluto")
                .build();

        System.out.println(person.getFirstName());
        System.out.println(person2.getFirstName());
    }
}