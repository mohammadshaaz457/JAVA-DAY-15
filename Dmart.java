import java.util.Scanner;

public class Dmart {
    public static void main(String[] args) {
        int PRICE_RICE = 70;
        int PRICE_OIL = 150;
        int PRICE_SUGAR = 50;
        int PRICE_SNACKS = 200;
        int PRICE_COOLDRINKS =100;
        int PRICE_BEAUTYPRODUCTS = 1000;
        int PRICE_PULSES = 200;
        int PRICE_CLOTHES = 1200;
        int PRICE_VEGETABLES=100;
        int PRICE_FRUITS=250;
        int PRICE_UTENSILS=500;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity of RICE: ");
        int quantityRICE = scanner.nextInt();
        System.out.print("Enter quantity of OIL: ");
        int quantityOIL = scanner.nextInt();
        System.out.print("Enter quantity of SUGAR: ");
        int quantitySUGAR = scanner.nextInt();
        System.out.print("Enter quantity of SNACKS: ");
        int quantitySNACKS = scanner.nextInt();
        System.out.print("Enter quantity of COOLDRINKS: ");
        int quantityCOOLDRINKS = scanner.nextInt();
        System.out.print("Enter quantity of BEAUTYPRODUCTS: ");
        int quantityBEAUTYPRODUCTS = scanner.nextInt();
        System.out.print("Enter quantity of PULSES: ");
        int quantityPULSES = scanner.nextInt();
        System.out.print("Enter quantity of CLOTHES: ");
        int quantityCLOTHES = scanner.nextInt();
        System.out.print("Enter quantity of VEGETABLES: ");
        int quantityVEGETABLES = scanner.nextInt();
        System.out.print("Enter quantity of FRUITS: ");
        int quantityFRUITS = scanner.nextInt();
        System.out.print("Enter quantity of UTENSILS: ");
        int quantityUTENSILS = scanner.nextInt();
        int totalRICE = PRICE_RICE * quantityRICE;
        int totalOIL = PRICE_OIL * quantityOIL;
        int totalSUGAR = PRICE_SUGAR * quantitySUGAR;
        int totalSNACKS = PRICE_SNACKS * quantitySNACKS;
        int totalCOOLDRINKS = PRICE_COOLDRINKS * quantityCOOLDRINKS;
        int totalBEAUTYPRODUCTS = PRICE_BEAUTYPRODUCTS * quantityBEAUTYPRODUCTS;
        int totalPULSES = PRICE_PULSES * quantityPULSES;
        int totalCLOTHES = PRICE_CLOTHES * quantityCLOTHES;
        int totalVEGETABLES = PRICE_VEGETABLES * quantityVEGETABLES;
        int totalFRUITS = PRICE_FRUITS * quantityFRUITS;
        int totalUTENSILS = PRICE_UTENSILS * quantityUTENSILS;
        int totalSelectedItems = totalRICE + totalOIL + totalSUGAR + totalSNACKS + totalCOOLDRINKS + totalBEAUTYPRODUCTS + totalPULSES + totalCLOTHES +  totalVEGETABLES + totalFRUITS + totalUTENSILS;
        System.out.print("Enter number of distinct products added to the cart (6 or 8): ");
        int numberOfProducts = scanner.nextInt();
        double finalAmount;
        if (numberOfProducts >=6) {
            finalAmount = totalSelectedItems * 0.9;
            System.out.println("10% discount applied.");
        } else if (numberOfProducts < 6) {
            finalAmount = totalSelectedItems;
            System.out.println("No discount applied.");
        } else {
            System.out.println("Invalid input for number of products. No discount applied.");
            finalAmount = totalSelectedItems;
        }
        System.out.println("\n--- Shopping Bill ---");
        System.out.println("========================");
        System.out.println("RICE: " + quantityRICE + " x " + PRICE_RICE + " = " + totalRICE);
        System.out.println("OIL: " + quantityOIL + " x " + PRICE_OIL + " = " + totalOIL);
        System.out.println("SUGAR: " + quantitySUGAR + " x " + PRICE_SUGAR + " = " + totalSUGAR);
        System.out.println("SNACKS: " + quantitySNACKS + " x " + PRICE_SNACKS + " = " + totalSNACKS);
        System.out.println("COOLDRINKS: " + quantityCOOLDRINKS + " x " + PRICE_COOLDRINKS + " = " + totalCOOLDRINKS);
        System.out.println("BEAUTYPRODUCTS: " + quantityBEAUTYPRODUCTS + " x " + PRICE_BEAUTYPRODUCTS + " = " + totalBEAUTYPRODUCTS);
        System.out.println("PULSES: " + quantityPULSES + " x " + PRICE_PULSES + " = " + totalPULSES);
        System.out.println("CLOTHES: " + quantityCLOTHES + " x " + PRICE_CLOTHES + " = " + totalCLOTHES);
        System.out.println("VEGETABLES: " + quantityVEGETABLES + " x " + PRICE_VEGETABLES + " = " + totalVEGETABLES);
        System.out.println("FRUITS: " + quantityFRUITS + " x " + PRICE_FRUITS + " = " + totalFRUITS);
        System.out.println("UTENSILS: " + quantityUTENSILS + " x " + PRICE_UTENSILS + " = " + totalUTENSILS);
        System.out.println("------------------------");
        System.out.printf("Final Amount: %.2f\n", finalAmount);
        System.out.println("========================");
    }
}