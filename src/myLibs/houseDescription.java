/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myLibs;

/**
 *
 * @author hardcodehtml
 */
public class houseDescription {
    private int bd_count;
    private int cr_count;
    private int gar_count;
    private double size;
    public houseDescription(int bd_count, int cr_count, int gar_count,double size) {
        this.bd_count = bd_count;
        this.cr_count = cr_count;
        this.gar_count = gar_count;
    }

  
    public int getBd_count() {
        return bd_count;
    }

    public void setBd_count(int bd_count) {
        this.bd_count = bd_count;
    }

    public int getCr_count() {
        return cr_count;
    }

    public void setCr_count(int cr_count) {
        this.cr_count = cr_count;
    }

    public int getGar_count() {
        return gar_count;
    }

    public void setGar_count(int gar_count) {
        this.gar_count = gar_count;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    
    
}
