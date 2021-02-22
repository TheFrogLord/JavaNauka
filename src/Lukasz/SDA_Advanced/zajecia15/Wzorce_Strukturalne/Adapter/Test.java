package Lukasz.SDA_Advanced.zajecia15.Wzorce_Strukturalne.Adapter;

public class Test {
    public static void main(String[] args) {

        OriginalProduct originalProduct =
                new OriginalProduct(1500, "Chair");
        IKEAProductPL adapted = new IkeaProductAdapter(originalProduct, 0.45);
        printProduct(adapted);
    }

    public static void printProduct(IKEAProductPL plProduct) {
        System.out.println(plProduct.getName() + " : "
                + plProduct.getPricePLN() + " zł");
    }
}

