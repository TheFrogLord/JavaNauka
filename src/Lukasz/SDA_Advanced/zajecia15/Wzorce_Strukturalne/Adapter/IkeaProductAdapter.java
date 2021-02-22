package Lukasz.SDA_Advanced.zajecia15.Wzorce_Strukturalne.Adapter;

public class IkeaProductAdapter implements IKEAProductPL{

    private OriginalProduct originalProduct;
    private double calculate;

    public IkeaProductAdapter(OriginalProduct originalProduct, double calculate) {
        this.originalProduct = originalProduct;
        this.calculate = calculate;
    }

    @Override
    public double getPricePLN() {
        return getOriginalPrice() * calculate;
    }

    @Override
    public int getOriginalPrice() {
        return originalProduct.getPrice();
    }

    @Override
    public String getName() {
        return originalProduct.getName();
    }
}
