/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodicas.pojos;

/**
 *
 * @author ACER
 */
public class DetalleVenta {
    
    private int idDetalleVenta;
    private double cantidadVendida;
    private int idVenta;
    private int idProd;

    public DetalleVenta(int idDetalleVenta, double cantidadVendida, int idVenta, int idProd) {
        this.idDetalleVenta = idDetalleVenta;
        this.cantidadVendida = cantidadVendida;
        this.idVenta = idVenta;
        this.idProd = idProd;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public double getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(double cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }
    
    
    
}
