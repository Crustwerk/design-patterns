package com.crustwerk;

class Utente {
    private String nome;
    private String ruolo; // es. "ADMIN", "USER", "GUEST"

    public Utente(String nome, String ruolo) {
        this.nome = nome;
        this.ruolo = ruolo;
    }

    public String getRuolo() {
        return ruolo;
    }

    public String getNome() {
        return nome;
    }
}