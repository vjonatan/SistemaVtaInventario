/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodicas.datos;

import com.kodicas.pojos.CategoriaProd;
import com.kodicas.pojos.DetalleVenta;
import com.kodicas.pojos.Producto;
import com.kodicas.pojos.Proveedor;
import com.kodicas.pojos.Venta;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class BaseDatos {
    
    Connection conn = null;
    PreparedStatement st = null;
    Statement stat = null;
    ResultSet rs = null;

    public BaseDatos() {
        try {
            Class.forName("com.mysql.jdbc.Driver");         
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    
    }
    
    public void insertarProducto(Producto producto){
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-sistema", "root", "123456");
            FileImageInputStream fis = new FileImageInputStream(producto.getFotoProducto());
            
            FileInputStream fis2 = null;
             
            String sql = "INSERT INTO cat_productos (id_prod, nombre_prod, desc_prod, stock_prod, foto_prod, unidad_prod, "
                            + "precio_compra_prod, precio_venta_prod, existencias_prod, id_categoria_prod, id_proveedor)"
                            + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            st = conn.prepareStatement(sql);
            
            st.setString(1, producto.getIdProducto());
            st.setString(2, producto.getNomProducto());
            st.setString(3, producto.getDescProducto());
            st.setDouble(4, producto.getStockProducto());
            
            fis2 = new FileInputStream(producto.getFotoProducto());
            st.setBinaryStream(5, fis2);
            
            //st.setBinaryStream(5, fis, (int)producto.getFotoProducto().length());
            //st.setBlob(5, (Blob) producto.getFotoProducto());
            st.setString(6, producto.getUnidadProducto());
            st.setDouble(7, producto.getPrecioCompraProducto());
            st.setDouble(8, producto.getPrecioVentaProducto());
            st.setDouble(9, producto.getExisitenciasProducto());
            st.setInt(10, producto.getIdCategoriaProd());
            st.setInt(11, producto.getIdProveedor());
            
            int i = st.executeUpdate();
            
            if (i > 0)
                JOptionPane.showMessageDialog(null, "Producto guardado correctamente");
            else
                JOptionPane.showMessageDialog(null, "Error al guardar producto");
            
        } catch (SQLException | IOException ex) {
            ex.printStackTrace();
        }finally{
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }        
        
    }
    
    public void insertarCategoria(CategoriaProd categoria){
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-sistema", "root", "123456");
             
            String sql = "INSERT INTO cat_categorias (nom_categoria_prod, desc_categoria_prod)"
                        + "  VALUES (?, ?)";
            
            st = conn.prepareStatement(sql);
            
            st.setString(1, categoria.getNomCategoriaProd());
            st.setString(2, categoria.getDescCategoriaProd());
                        
            st.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }        
        
    }
    
    public void actualizarInventarioProducto(Producto producto, double cantidad){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-sistema", "root", "123456");
             
            String sql = "UPDATE cat_productos SET existencias_prod = ? WHERE id_prod = ?";
            
            st = conn.prepareStatement(sql);
            
            st.setDouble(1, cantidad);
            st.setString(2, producto.getIdProducto());
                        
            st.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }    
    
    public void insertarProveedor(Proveedor proveedor){
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-sistema", "root", "123456");
             
            String sql = "INSERT INTO cat_proveedores (nom_proveedor, dir_proveedor, telefono_proveedor, email_proveedor, contacto_proveedor)"
                        + "  VALUES (?, ?, ?, ?, ?)";
            
            st = conn.prepareStatement(sql);
            
            st.setString(1, proveedor.getNomProveedor());
            st.setString(2, proveedor.getDirProveedor());
            st.setString(3, proveedor.getTelefonoProveedor());
            st.setString(4, proveedor.getEmailProveedor());
            st.setString(5, proveedor.getContactoProveedor());
                        
            st.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }        
        
    }    
    
    public void insertarVenta(Venta venta){
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-sistema", "root", "123456");
             
            String sql = "INSERT INTO ventas (monto_venta, fecha_venta)"
                        + "  VALUES (?, ?, ?, ?, ?)";
            
            st = conn.prepareStatement(sql);
            
            st.setDouble(1, venta.getMontoVenta());
            st.setDate(2, venta.getFechaVenta());
                        
            st.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }        
        
    }
    
    public void insertarDetalleVenta(DetalleVenta detalleVenta){
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-sistema", "root", "123456");
             
            String sql = "INSERT INTO detalle_venta (cantidad_vendida, id_venta, id_prod)"
                        + "  VALUES (?, ?, ?, ?)";
            
            st = conn.prepareStatement(sql);
            
            st.setDouble(1, detalleVenta.getCantidadVendida());
            st.setInt(2, detalleVenta.getIdVenta());
            st.setInt(3, detalleVenta.getIdProd());
                        
            st.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }        
        
    }
    
    public ArrayList<Producto> obtenerProductos(){
        
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-sistema", "root", "123456");
             
            String sql = "SELECT * FROM cat_productos ORDER BY nombre_prod";
            
            st = conn.prepareStatement(sql);
                                    
            rs = st.executeQuery();
            
            while (rs.next()) {
                String id = rs.getString("id_prod");
                String nombre = rs.getString("nombre_prod");
                String descripcion = rs.getString("desc_prod");
                double stock = rs.getDouble("stock_prod");
                //acá iria la FOTO
                String unidad = rs.getString("unidad_prod");
                double precioCompra = rs.getDouble("precio_compra_prod");
                double precioVenta = rs.getDouble("precio_venta_prod");
                double existenciaProd = rs.getDouble("existencias_prod");
                int id_categoria = rs.getInt("id_categoria_prod");
                int id_proveedor = rs.getInt("id_proveedor");
                
                Producto producto = new Producto(id, nombre, descripcion, stock, null, unidad, precioCompra, precioVenta, existenciaProd, id_categoria, id_proveedor);
                
                listaProductos.add(producto);
                
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } 
        
        return listaProductos;        
    }
    
    public ArrayList<Producto> obtenerProductosPorCriterio(String criterio){
        
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-sistema", "root", "123456");
             
            String sql = "SELECT * FROM cat_productos"
                    + " WHERE nombre_prod like '%"+criterio+"%'"
                    + " ORDER BY nombre_prod";
            
            stat = conn.createStatement();                                    
            rs = stat.executeQuery(sql);
            
            while (rs.next()) {
                String id = rs.getString("id_prod");
                String nombre = rs.getString("nombre_prod");
                String descripcion = rs.getString("desc_prod");
                double stock = rs.getDouble("stock_prod");
                String unidad = rs.getString("unidad_prod");
                double precioCompra = rs.getDouble("precio_compra_prod");
                double precioVenta = rs.getDouble("precio_venta_prod");
                double existenciaProd = rs.getDouble("existencias_prod");
                int id_categoria = rs.getInt("id_categoria_prod");
                int id_proveedor = rs.getInt("id_proveedor");
                
                Producto producto = new Producto(id, nombre, descripcion, stock, null, unidad, precioCompra, precioVenta, existenciaProd, id_categoria, id_proveedor);
                
                listaProductos.add(producto);
                
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } 
        
        return listaProductos;        
    }
    
    public ArrayList<CategoriaProd> obtenerCategorias(){
        
        ArrayList<CategoriaProd> listaCategorias = new ArrayList<CategoriaProd>();
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-sistema", "root", "123456");
             
            String sql = "SELECT * FROM cat_categorias";
            
            st = conn.prepareStatement(sql);
                                    
            rs = st.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("id_categoria_prod");
                String nombre = rs.getString("nom_categoria_prod");
                String descripcion = rs.getString("desc_categoria_prod");                            
                
                CategoriaProd categoria = new CategoriaProd(id, nombre, descripcion);
                
                listaCategorias.add(categoria);
                
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } 
        
        return listaCategorias;        
    }
    
    public ArrayList<Proveedor> obtenerProveedores(){
        
        ArrayList<Proveedor> listaProveedores = new ArrayList<Proveedor>();
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-sistema", "root", "123456");
             
            String sql = "SELECT * FROM cat_proveedores";
            
            st = conn.prepareStatement(sql);
                                    
            rs = st.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("id_proveedor");
                String nombre = rs.getString("nom_proveedor");
                String direccion = rs.getString("dir_proveedor");                            
                String telefono = rs.getString("telefono_proveedor");
                String email = rs.getString("email_proveedor");
                String contacto = rs.getString("contacto_proveedor");
                
                Proveedor proveedor = new Proveedor(id, nombre, direccion, telefono, email, contacto);
                
                listaProveedores.add(proveedor);
                
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } 
        
        return listaProveedores;        
    }
    
    
    
    
    public static void main(String[] args) {
        BaseDatos bd = new BaseDatos();
        
        //CategoriaProd categoria = new CategoriaProd(1, "Categoria de Prueba", "Descripción de la categoria de prueba");
        //bd.insertarCategoria(categoria);
        
        //for (Producto prod : bd.obtenerProducto()) {
        //    System.out.println(prod.toString());
        //}
        
        //for (CategoriaProd categoriaProd : bd.obtenerCategoria()) {
        //    System.out.println(categoriaProd.toString());
        //}
        
    }
    
    
}
