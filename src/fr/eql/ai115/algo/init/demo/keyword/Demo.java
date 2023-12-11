package fr.eql.ai115.algo.init.demo.keyword;

public class Demo {

    public static void main(String[] args) {
        System.out.println(DemoStatic.staticNumber); // accède au static uniquement comme ca en bonnes pratiques
        // nom de classe . attribut = instance

        DemoStatic d1 = new DemoStatic();
        DemoStatic d2 = new DemoStatic();

        System.out.println("============================");
        System.out.println(d1.getNonStaticNumber());
        // DemoStatic.staticNumber=45; // ca modifie toutes les valeurs de d1 et d2 en staticNumber

        System.out.println(d1.nonStaticAdd(45, 65));
        System.out.println(DemoStatic.staticAdd(45, 65));
        // pas besoin de faire new pour l'appeler car il est chargé en mémoire

        if (Math.random() < 0.3) {
            System.out.println("OK");
        } else {
            System.out.println("NON OK");
        }

        Demo d = new Demo();
        d.m();

        System.out.println(DemoStaticFinal.URL);

    }
        public void m(){
            System.out.println("aaaa");
            n();
        }

        static public void n(){
            System.out.println("static method");
        }
    }

