package grundlagen;

public class person {
    //Merke: Bei der Instanziierung einer Klasse werden alle Attribute auf Standard-Werte gesetzt:
    // int - > 0
    // boolea - > false
    // double - > 0.0
    // String - > null
    // alle Referenzvariablen werden also demnach per Default auf null gesetzt
    private String name;
    private int alter;
    private boolean weiblich;

// Konstruktoren:
// Hauptaufgaben reservieren von Ressourcen und das Setzen von Init-Werten für wichtige Attribute
public Person() {
    alter=18;
}
public Person(String name, int alter) {
    alter=alter;
    name=name;
}


    }
