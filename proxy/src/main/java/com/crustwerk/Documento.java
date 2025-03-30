package com.crustwerk;

interface Documento {
    void apri();
}

class DocumentoReale implements Documento {
    private String nome;

    public DocumentoReale(String nome) {
        this.nome = nome;
    }

    @Override
    public void apri() {
        System.out.println("📄 Aprendo il documento: " + nome);
    }
}
