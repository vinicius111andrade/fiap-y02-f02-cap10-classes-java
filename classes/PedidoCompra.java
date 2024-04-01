import java.time.LocalDate;

public class PedidoCompra {
    long id;
    String name;
    LocalDate date;
    long userId;
    long productId;
    int quantity;

    public PedidoCompra (
        long newId,
        String newName,
        LocalDate newDate,
        long newUserId,
        long newProductId,
        int newQuantity
    ){
        id = newId;
        name = newName;
        date = newDate;
        userId = newUserId;
        productId = newProductId;
        quantity = newQuantity;
    }
}
