import java.time.LocalDate;
public class Lote {
    private  long id;
    private long productId;
    private LocalDate expireDate;
    private LocalDate entryDate;

    public Lote (
            long newId,
            long newProductId,
            LocalDate newExpireDate,
            LocalDate newEntryDate
    ){
        id = newId;
        productId = newProductId;
        expireDate = newExpireDate;
        entryDate = newEntryDate;
    }
}
