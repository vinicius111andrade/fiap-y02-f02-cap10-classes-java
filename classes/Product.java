import java.time.LocalDate;

public class Product {
    private long id;
    private String name;
    private String type;
    private int quantity;
    private float price;


    public Product(
        long newId,
        String newName,
        String newType,
        int newQuantity,
        float newPrice
        ) {
        id = newId;
        name = newName;
        type = newType;
        quantity = newQuantity;
        price = newPrice;
    }

    //TODO precisa de expiration date?
    public Product add(int n, LocalDate expirationDate) {
        return add(n);
     }

     public Product add(int n) {
         return new Product(id, name, type, quantity + n, price);
      }

    public Product remove(int n) {
        return add(-n);
    }

    public int verify(long id, String name) {
        return 0; //TODO faz o q?
    }

    public Product update(
        long newId,
        String newName,
        String newType,
        int newQuantity,
        float newPrice
    ) { //TODO tem q interagir com o DAO?
        return new Product(
            newId, newName, newType, newQuantity, newPrice
        );
    }

    public boolean delete(long id) {
        return true; //TODO tem q interagir com DAO
    }
}