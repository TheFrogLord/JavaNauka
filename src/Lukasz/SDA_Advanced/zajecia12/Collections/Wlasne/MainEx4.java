package Lukasz.SDA_Advanced.zajecia12.Collections.Wlasne;


import java.util.*;

public class MainEx4 {

    public static void main(String[] args) {
        Map<String, List<String>> products = new TreeMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj datę ważności i produkt: ");
            String date = sc.nextLine();
            if ("@".equals(date)) {
                break;
            }
            String product = sc.nextLine();
            if (products.containsKey(date)) {
                products.get(date).add(product);
            } else {
                List<String> productFromDate = new ArrayList<>();
                productFromDate.add(product);
                products.put(date, productFromDate);
            }
        }

        for (Map.Entry<String, List<String>> entry : products.entrySet()) {
            System.out.println("Data ważności: " + entry.getKey());
            for (String prod : entry.getValue()) {
                System.out.print(prod + ", ");
            }
            System.out.println();

        }
    }
}
