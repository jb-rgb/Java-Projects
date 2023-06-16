package com.mycompany.proyectobd.jorge;
import com.mycompany.proyectobd.socrucito.Producto;
import com.mycompany.proyectobd.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jorge
 */
public class Inventario {
    private int idInventario;
    private int idProducto;
    
    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
    public static void actualizarProducto(String nombre, String descripcion, float precio, int cantidad, int idProducto) {
        String consulta = "UPDATE productos SET nombre_producto = ?, descripcion_producto = ?, precio_producto = ?, cantidad_producto = ? WHERE productos.id_producto = ?;";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tu_base_de_datos", "usuario", "contraseña");
             CallableStatement cs = con.prepareCall(consulta)) {
            cs.setString(1, nombre);
            cs.setString(2, descripcion);
            cs.setFloat(3, precio);
            cs.setInt(4, cantidad);
            cs.setInt(5, idProducto);
            cs.execute();
            System.out.println("Se actualizó correctamente el producto");
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }public void actualizarInventario() {
        
    }
}
