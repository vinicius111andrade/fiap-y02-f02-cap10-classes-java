import java.time.LocalDate;
public class PedidoCompra {

    private long id;
    private String name;
    private LocalDate date;
    private long userId;
    private long productId;
    private int quantity;

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