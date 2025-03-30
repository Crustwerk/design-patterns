package com.crustwerk;

class DocumentoProxy implements Documento {
    private DocumentoReale documentoReale;
    private String nome;
    private Utente utente; // L'utente che vuole accedere

    public DocumentoProxy(String nome, Utente utente) {
        this.nome = nome;
        this.utente = utente;
    }

    @Override
    public void apri() {
        if (utente.getRuolo().equals("ADMIN")) {
            if (documentoReale == null) {
                documentoReale = new DocumentoReale(nome);
            }
            documentoReale.apri();
        } else {
            System.out.println("⛔ Accesso negato per " + utente.getNome() + ". Solo gli ADMIN possono aprire questo documento.");
        }
    }
}
