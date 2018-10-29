/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodicas.pojos;

import java.io.File;

/**
 *
 * @author ACER
 */
public class Producto {
    
    private String idProducto;
    private String nomProducto;
    private String descProducto;
    private double stockProducto;
    private File fotoProducto;
    private String unidadProducto;
    private double precioCompraProducto;
    private double precioVentaProducto;
    private double exisitenciasProducto;
    private int idCategoriaProd;
    private int idProveedor;

    public Producto(String idProducto, String nomProducto, String descProducto, double stockProducto, File fotoProducto, String unidadProducto, double precioCompraProducto, double precioVentaProducto, double exisitenciasProducto, int idCategoriaProd, int idProveedor) {
        this.idProducto = idProducto;
        this.nomProducto = nomProducto;
        this.descProducto = descProducto;
        this.stockProducto = stockProducto;
        this.fotoProducto = fotoProducto;
        this.unidadProducto = unidadProducto;
        this.precioCompraProducto = precioCompraProducto;
        this.precioVentaProducto = precioVentaProducto;
        this.exisitenciasProducto = exisitenciasProducto;
        this.idCategoriaProd = idCategoriaProd;
        this.idProveedor = idProveedor;
    }

    

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public String getDescProducto() {
        return descProducto;
    }

    public void setDescProducto(String descProducto) {
        this.descProducto = descProducto;
    }

    public double getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(double stockProducto) {
        this.stockProducto = stockProducto;
    }

    public File getFotoProducto() {
        return fotoProducto;
    }

    public void setFotoProducto(File fotoProducto) {
        this.fotoProducto = fotoProducto;
    }

    public String getUnidadProducto() {
        return unidadProducto;
    }

    public void setUnidadProducto(String unidadProducto) {
        this.unidadProducto = unidadProducto;
    }

    public double getPrecioCompraProducto() {
        return precioCompraProducto;
    }

    public void setPrecioCompraProducto(double precioCompraProducto) {
        this.precioCompraProducto = precioCompraProducto;
    }

    public double getPrecioVentaProducto() {
        return precioVentaProducto;
    }

    public void setPrecioVentaProducto(double precioVentaProducto) {
        this.precioVentaProducto = precioVentaProducto;
    }

    public double getExisitenciasProducto() {
        return exisitenciasProducto;
    }

    public void setExisitenciasProducto(double exisitenciasProducto) {
        this.exisitenciasProducto = exisitenciasProducto;
    }

    public int getIdCategoriaProd() {
        return idCategoriaProd;
    }

    public void setIdCategoriaProd(int idCategoriaProd) {
        this.idCategoriaProd = idCategoriaProd;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public String toString() {
        return this.idProducto;
    }
    
    
  
}
