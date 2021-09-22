public class GeneradorVertebrados {
    public static Vertebrado[] generarArrayVertebrados() {
        Vertebrado[] miVertebrados = new Vertebrado[4];
        miVertebrados[0] = new Vertebrado("Camello", "Mamifero");
        miVertebrados[1] = new Vertebrado("Vaca purpura", "Mamifero");
        miVertebrados[2] = new Vertebrado("Perro azul", "Pez");

        return miVertebrados;
    }
}
