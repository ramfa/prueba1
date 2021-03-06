/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Docente;

import Abstracta.BD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public abstract class BDDocente {

    public static Docente insertarDocente(Docente d) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("insert into docente (Legajo,Nombre"
                + ",Apellido,CargoId,AsignaturaId) values (?,?,?,?,?)");
        ps.setInt(1, d.getLegajo());
        ps.setString(2, d.getNombre());
        ps.setString(3, d.getApellido());
        ps.setInt(4, d.getCargoId());
        ps.setInt(5, d.getAsignaturaId());      
        ps.executeUpdate();
        PreparedStatement ps2 = cnn.prepareStatement("select max(Legajo) from docente");
        ResultSet r = ps2.executeQuery();
        if (r.next()) {
            int lastID = r.getInt(1);
            d.setLegajo(lastID);
        }
        ps2.close();
        cnn.close();
        ps.close();
        return d;
    }

    public static Docente buscarDocenteCodigo(int legajo) throws SQLException {
        return buscarDocenteCodigo(legajo, null);
    }

    public static Docente buscarDocenteCodigo(int legajo, Docente d) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select Nombre,Apellido,CargoId,AsignaturaId from docente where legajo=?");
        ps.setInt(1, legajo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            if (d == null) {
                d = new Docente() {
                };
            }
            d.setLegajo(legajo);
            d.setNombre(rs.getString("Nombre"));
            d.setApellido(rs.getString("Apellido"));
            d.setCargoId(rs.getInt("CargoId"));
            d.setAsignaturaId(rs.getInt("AsignaturaId"));
                       
        }
        cnn.close();
        ps.close();
        return d;
    }

      public static Docente buscarDocenteNombre(String nombre) throws SQLException {
        return buscarDocenteNombre(nombre, null);
    }

    public static Docente buscarDocenteNombre(String nombre, Docente d) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select * from docente where Nombre=?");
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            d = d == null ? new Docente() {
            } : d;
            
            d.setNombre(nombre);
            d.setLegajo(rs.getInt("Legajo"));
            d.setApellido(rs.getString("Apellido"));
            d.setCargoId(rs.getInt("CargoId"));
            d.setAsignaturaId(rs.getInt("AsignaturaId"));
         

        } else {
            d = null;
        }
        cnn.close();
        ps.close();
        return d;
    }

    public static boolean actualizarDocente(Docente d) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("update docente set Nombre=?,Apellido=?,CargoId=? ,AsignaturaId=? where Legajo=" + d.getLegajo());
        ps.setString(1, d.getNombre());
        ps.setString(2, d.getApellido());
        ps.setInt(3, d.getCargoId());
        ps.setInt(4, d.getAsignaturaId());
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static ArrayList<Docente> mostrarDocente() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<Docente> lista = new ArrayList<Docente>();

        ps = cnn.prepareStatement("select *from docente");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Docente d = new Docente() {
            };
            d.setNombre(rs.getString("Nombre"));
            d.setLegajo(rs.getInt("Legajo"));
            d.setApellido(rs.getString("Apellido"));
            d.setCargoId(rs.getInt("CargoId"));
            d.setAsignaturaId(rs.getInt("AsignaturaId"));
            lista.add(d);
        }
        cnn.close();
        ps.close();
        return lista;
    }

    public static ArrayList<Docente> listarDocentePorNombre(String nombre) {
        return listar("Docente", nombre + "%", "like");
    }

    public static ArrayList<Docente> listarDocentePorCodigo(String legajo) {
        return listar("legajo", legajo + "%", "like");
    }

    private static ArrayList<Docente> listar(String atributo, String parametro, String comparador) {
        return consultarSQL("select * from docente where " + atributo + " " + comparador + " '" + parametro + "'");
    }

    private static ArrayList<Docente> consultarSQL(String sql) {
        ArrayList<Docente> list = new ArrayList<Docente>();
        Connection cn = BD.getConnection();
        try {
            Docente d;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                d = new Docente();
                d.setLegajo(rs.getInt("Legajo"));
                d.setNombre(rs.getString("Nombre"));
                d.setApellido(rs.getString("Apellido"));
                d.setCargoId(rs.getInt("CargoId"));
                d.setAsignaturaId(rs.getInt("AsignaturaId"));
                
                
                list.add(d);
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
        return list;
    }
}