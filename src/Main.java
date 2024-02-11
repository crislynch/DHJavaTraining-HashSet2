import java.util.HashSet;

// Scrivere una funzione che restituisca un HashSet riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l' elemento sia parte del Set e stampare il risultato

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = readHashSet();
        int setSize = hashSet.size();
        System.out.println("Dimensione del set: " + setSize + " elementi.");
        System.out.println("Elementi nel set: ");
        for (String element : hashSet) {
            System.out.println(element);
        }

        // Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
        HashSet<String> newHashSet = new HashSet<>(hashSet);
        System.out.println("Nuovo HashSet creato: " + newHashSet);

        // Verificare che l'elemento sia parte del Set e stampare il risultato
        String checkElement = "3";
        boolean elementPresence = hashSet.contains(checkElement);
        System.out.println("L'elemento '" + checkElement + "' è presente nel set? " + elementPresence);
    }

    // Scrivere una funzione che restituisca un HashSet riempito
    private static HashSet<String> readHashSet() {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");
        hashSet.add("5");
        hashSet.add("6");
        hashSet.add("7");

        return hashSet;
    }
}