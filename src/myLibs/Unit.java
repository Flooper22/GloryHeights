/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myLibs;

/**
 *
 * @author hardcodehtml
 */
public class Unit {
    
    private int id;
    private Address address;
    private houseDescription desc;
    private double price;
    private String status;
    
    public Unit(int id, Address address,houseDescription desc,String status) {
        this.id = id;
        this.address = address;
        this.desc = desc;
        this.status = status;
      
    }

    Unit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public houseDescription getDesc() {
        return desc;
    }

    public void setDesc(houseDescription desc) {
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getPrice() {
        
        price = (desc.getSize() * 2000 ) + (desc.getBd_count() * 75000) + (desc.getCr_count() * 30000) + (desc.getGar_count() * 125000);
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
