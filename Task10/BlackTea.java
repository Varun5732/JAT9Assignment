package tasks;

public class BlackTea extends TeaCreation {
    public static void main(String[] args) {
    	
    	BlackTea Tea = new BlackTea();
    	BlackTea.boilWater();
    	BlackTea.steepTea();
    	BlackTea.pourInCup();
    	BlackTea.addLemon();
    	BlackTea.addSugar();
    }

    public static void boilWater() {
        System.out.println("Boiling water...");
    }

    public static void steepTea() {
        System.out.println("Steeping the tea...");
    }

    public static void pourInCup() {
        System.out.println("Pouring the tea into a cup...");
    }

    public static void addLemon() {
        System.out.println("Adding lemon to the tea...");
    }
}
