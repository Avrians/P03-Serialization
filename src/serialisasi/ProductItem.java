
package serialisasi;

import java.io.Serializable;

/**
 *
 * @author avrians
 */
public class ProductItem implements Serializable{
    String nama;
    double harga;
    
    public ProductItem(String name, double price) {
        this.nama = name;
        this.harga = price;
    }
    
    @Override
    public String toString() {
        return "\r\nNama ="+nama+"\r\nHarga"+harga+"\r\n";
    }
}
