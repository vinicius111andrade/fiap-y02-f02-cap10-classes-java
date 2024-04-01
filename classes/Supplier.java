public class Supplier {
    Long id;
    String name;
    String address;
    String phone;

    public Supplier(
        long newId,
        String newName,
        String newAddress,
        String newPhone
        ) {
        id = newId;
        name = newName;
        address = newAddress;
        phone = newPhone;
    }

    

    // ----- CREATE -----
    // public Supplier create(String name,
    // String address,
    // String phone) {
    //     return Supplier;
    // }

    // public Supplier update(
    //     long newId,
    //     String newName,
    //     String newAddress,
    //     String newPhone
    // ) { 
    //     return Supplier;
    // }

    // public boolean delete(long id) {
    //     return true; 
    // }
}
