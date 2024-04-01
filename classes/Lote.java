import java.time.LocalDate;

public class Lote {
    long id;
    long productId;
    LocalDate expireDate;
    LocalDate entryDate;

    public Lote (
        long newId,
        long newProductId,
        LocalDate newExpireDate,
        LocalDate newEntryDate
    ) {
        id = newId;
        productId = newProductId;
        expireDate = newExpireDate;
        entryDate = newEntryDate;
    }
}
