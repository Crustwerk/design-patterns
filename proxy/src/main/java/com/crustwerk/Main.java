package com.crustwerk;

/*
Il Proxy Pattern è un design pattern strutturale che agisce come "intermediario" tra un client (chi usa un oggetto)
e un oggetto reale (l'oggetto che esegue il lavoro vero e proprio).
Il proxy si interpone tra il client e l'oggetto reale, e può aggiungere logica aggiuntiva
prima o dopo aver fatto l'accesso all'oggetto reale.

Il proxy è utile in vari scenari, come:

Controllo dell'accesso
    - Nel nostro esempio, il proxy protegge il documento da utenti non autorizzati.

Lazy Loading
    - Il proxy può ritardare la creazione dell'oggetto reale fino a quando non è effettivamente necessario.

Caching
    - Se l'oggetto reale è costoso da caricare (come il recupero di dati da un database), il proxy può memorizzare i risultati e restituirli successivamente senza dover caricare nuovamente l'oggetto.

Logging e Monitoraggio
    - Il proxy può registrare le operazioni che vengono fatte sull'oggetto reale, utile per il debug o per analisi delle prestazioni.

 */
public class Main {
    public static void main(String[] args) {
        Utente admin = new Utente("Alice", "ADMIN");
        Utente user = new Utente("Bob", "USER");

        Documento documento1 = new DocumentoProxy("Report.pdf", admin);
        Documento documento2 = new DocumentoProxy("Segreto.docx", user);

        documento1.apri(); // ✅ Alice (ADMIN) può aprire
        documento2.apri(); // ❌ Bob (USER) non può aprire
    }
}
