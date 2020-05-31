
package Modelo;


public class Producto {
    
    private int id;
    private String desc;
    private int stock;

    public Producto() {
    }

    public Producto(int id, String desc, int stock) {
        this.id = id;
        this.desc = desc;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
}
