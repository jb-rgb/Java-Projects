package com.mycompany.proyectobd;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Cinforme2 {
    public void mostrarInforme2(JTable tablaInforme1){
        Conexion cj = new Conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";
        modelo.addColumn("suma(pago)");
        modelo.addColumn("codigo_version");
        modelo.addColumn("nombre_plataforma");
        modelo.addColumn("modelo_plataforma");
        modelo.addColumn("nombre_juego");
        tablaInforme1.setModel(modelo);
        sql = "SELECT SUM(m.precio) , v.codigo_version, v.nombre_plataforma, p.modelo, j.nombre_juego FROM transaccion d, versiones v, pago m, plataforma p, juego j WHERE m.codigo_version = v.codigo_version AND m.numero_transaccion = d.numero_transaccion AND v.nombre_plataforma = p.nombre_plataforma GROUP BY (v.codigo_version,j.nombre_juego,p.nombre_plataforma,p.modelo) ORDER BY sum(d.monto) DESC;";
        String[] datos = new String[5];
        Statement st;
        try{
            st = cj.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            tablaInforme1.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }
}
