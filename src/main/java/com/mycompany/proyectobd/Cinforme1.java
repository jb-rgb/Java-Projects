package com.mycompany.proyectobd;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Cinforme1 {
    public void mostrarInforme1(JTable tablaInforme1){
        Conexion cj = new Conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";
        modelo.addColumn("suma(monto)");
        modelo.addColumn("nickname");
        modelo.addColumn("nombre_usuario");
        modelo.addColumn("correo");
        tablaInforme1.setModel(modelo);
        sql = "SELECT SUM(d.monto), u.nickname, u.nombre, u.correo FROM transaccion d, usuario u WHERE u.nickname=d.usuario_nickname AND d.monto = 0.0 OR d.monto IS null GROUP BY (u.nickname) ORDER BY SUM(d.monto) DESC;";
        String[] datos = new String[4];
        Statement st;
        try{
            st = cj.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                modelo.addRow(datos);
            }
            tablaInforme1.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }
}
