package tasks;
public class GreenTea extends BlackTea {
    public static void main(String[] args) {
    	GreenTea Tea = new GreenTea();
    	GreenTea.boilWater();
    	GreenTea.prepareTeapot();
    	GreenTea.addGreenTeaLeaves();
    	GreenTea.pourHotWater();
    	GreenTea.steepTea();
    	GreenTea.removeTeaLeaves();
    	GreenTea.serveTea();
    	GreenTea.addLemon();
    }

    public static void boilWater() {
        System.out.println("Boil water");
    }

    public static void prepareTeapot() {
        System.out.println("Preparing the teapot");
    }

    public static void addGreenTeaLeaves() {
        System.out.println("Adding green tea leaves to the teapot");
    }

    public static void pourHotWater() {
        System.out.println("Pouring hot water into the teapot");
    }

    public static void steepTea() {
        System.out.println("Steeping the tea");
    }

    public static void removeTeaLeaves() {
        System.out.println("Removing the tea leaves from the teapot");
    }

    public static void serveTea() {
        System.out.println("Serving the green tea");
    }
}
