package fr.eql.ai115.algo.init.demo.banque;

public class Main {

    public static void main(String[] args) {


        Ccp compte1 = new Ccp(151,"Jean Dupont",15682);
        Ccp compte2 = new Ccp(658,"Toto Bourdinet",3251);

        Epargne epargne = new Epargne(151,"Jean Dupont",12000);

        compte1.transfer(compte1,compte2,1650);
        epargne.transfer(compte1,epargne,7000);
    }
}