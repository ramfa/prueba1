/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Docente;

import Abstracta.BD;
import Abstracta.Entidad;
import java.sql.ResultSet;
import java.sql.SQLException;
import Abstracta.Conexion;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Marcos
 */
public class Docente extends Entidad {
    private int legajo;
    private String nombre;
    private String apellido;
    private int cargoId;
    private int asignaturaId;
   
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCargoId() {
        return cargoId;
    }

    public void setCargoId(int cargoId) {
        this.cargoId = cargoId;
    }

    public int getAsignaturaId() {
        return asignaturaId;
    }

    public void setAsignaturaId(int asignaturaId) {
        this.asignaturaId = asignaturaId;
    }    
   
    public Docente(){
    }
    
    public Docente (int legajo, String nombre, String apellido,int cargoId,
     int asignaturaId)
     {
        this.legajo=legajo;
        this.nombre= nombre;
        this.apellido=apellido;
        this.cargoId=cargoId;
        this.asignaturaId=asignaturaId;
        
    }
    @Override
    public void altas() {
        String consulta = "INSERT INTO Docente VALUES ("
                + ""+this.legajo+","
                + "'"+this.nombre+"',"
                + "'"+this.apellido+"',"
                + " "+this.cargoId+","
                + " "+this.asignaturaId+")";
                Conexion con = new Conexion();
                con.conectar();
        try{
            con.getConexion().createStatement().execute(consulta);
        }catch(SQLException a){
            System.out.println("NO SE PUDO REALIZAR EL ALTA: "+consulta);
            a.printStackTrace();
        }
    }
    @Override
    public void bajas() {
            String consulta = "DELETE FROM Docente "
            + "where legajo="+this.legajo;
            Conexion con = new Conexion();
            con.conectar();
        try{
            con.getConexion().createStatement().execute(consulta);
        }catch(SQLException a){
            System.out.println("NO SE PUDO REALIZAR LA BAJA: "+consulta);
            a.printStackTrace();
        }
    }

    @Override
    public void modificar() {
                String consulta = "update Docente set "
                + " "+this.legajo+","
                + "'"+this.nombre+"',"
                + "'"+this.apellido+"',"
                + " "+this.cargoId+","
                + " "+this.asignaturaId+" "
                + "where legajo="+this.legajo;
                Conexion con = new Conexion();
                con.conectar();
        try{
            con.getConexion().createStatement().execute(consulta);
       }catch(SQLException a){
               System.out.println("NO SE PUDO REALIZAR LA MODIFICACION: "+consulta);
               a.printStackTrace();
         }
    }

    @Override
    public ResultSet leer() throws SQLException {
         ResultSet rs=null;
         String consulta="select * from Docente ";
         Conexion con=new Conexion();
         con.conectar();
     try{
         rs=con.getConexion().createStatement().executeQuery(consulta);
     }catch(SQLException a){a.printStackTrace();}
        return rs;
    }

    @Override
    public boolean buscar() {
          boolean hallado= false;
          String consulta="select * from Docente where Legajo="+this.legajo;
          ResultSet rs;
          Conexion con=new Conexion();
          con.conectar();
        try{
            rs=con.getConexion().createStatement().executeQuery(consulta);
            if(rs.next()){
                this.legajo=rs.getInt("Legajo");
                this.nombre=rs.getString("Nombre");
                this.apellido=rs.getString("Apellido");
                this.cargoId=rs.getInt("CargoId");
                this.asignaturaId=rs.getInt("AsignaturaId");
                hallado=true;
            }
        }catch(SQLException a){
            a.printStackTrace();
        }
        return hallado;
    }
    public ResultSet filtrar() throws SQLException {
        ResultSet rs=null;
        String consulta="select * from Docente where Legajo= "+this.legajo;
        Conexion con=new Conexion();
        con.conectar();
        try{
        rs=con.getConexion().createStatement().executeQuery(consulta);
           }
        catch(SQLException a){a.printStackTrace();}
        return rs;
    }
       public static ArrayList<Docente> listarDocentePorNombre(String nombre) {
        return listar("Nombre", nombre + "%", "like");
    }
       public static ArrayList<Docente> listarDocentePorLegajo(String legajo) {
        return listar("Legajo", legajo + "%", "like");
    }
       private static ArrayList<Docente> listar(String atributo, String parametro, String comparador) {
        return consultarSQL("select Legajo,Nombre,Apellido,CargoId,AsignaturaId from Docente where " + atributo + " " + comparador + " '" + parametro + "'");
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
        }catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
        return list;
     }
  
}



