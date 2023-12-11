package fr.eql.ai115.algo.init.demo.TP.tpecole;

public class Testeur {

    Pedago pedago = new Pedago();

    public void testerDossier(Dossier testeur){
        System.out.println("Dossier validé, à tester \r\n");

        testeur.setEtat("Testé");
        // si on veut classe a veut communiquer avec classe b c'est mieux de faire A = B
        System.out.println("Testeur : " + testeur);

        pedago.pedagoDossier(testeur);
    }
}
