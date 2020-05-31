/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUDProducto;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO extends Conexion implements CRUDProducto {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    int r = 0;

    @Override
    public List Listar() {
        List<Producto> lp = new ArrayList<>();
        String sql = "SELECT * FROM productos";
        System.out.println("todo bien");
        try {
            conn = this.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setDesc(rs.getString(2));
                p.setStock(rs.getInt(3));
                lp.add(p);
            }
        } catch (SQLException e) {
        } finally {
            this.desconect();
        }
        return lp;
    }

    @Override
    public Producto getProducto(int id) {
        Producto p = new Producto();
        String sql = "SELECT * FROM productos WHERE id=" + id;
        try {
            conn = this.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setDesc(rs.getString(2));
                p.setStock(rs.getInt(3));
            }
        } catch (SQLException e) {
        } finally {
            this.desconect();
        }
        return p;
    }

    @Override
    public int add(Producto pro) {
        Producto p = new Producto();
        String sql = "INSERT INTO productos VALUES(null,?,?)";
        try {
            conn = this.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, pro.getDesc());
            ps.setInt(2, pro.getStock());
            r = ps.executeUpdate();

        } catch (SQLException e) {
        } finally {
            this.desconect();
        }
        return r;
    }

    @Override
    public int update(Producto pro) {
        Producto p = new Producto();
        String sql = "UPDATE productos SET descripcion=?, stock=? WHERE id=?";
        try {
            conn = this.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, pro.getDesc());
            ps.setInt(2, pro.getStock());
            ps.setInt(3, pro.getId());
            r = ps.executeUpdate();

        } catch (SQLException e) {
        } finally {
            this.desconect();
        }
        return r;
    }

    @Override
    public int delete(int id) {
        Producto p = new Producto();
        String sql = "DELETE FROM productos WHERE id="+id;
        try {
            conn = this.getConexion();
            ps = conn.prepareStatement(sql);
            r = ps.executeUpdate();

        } catch (SQLException e) {
        } finally {
            this.desconect();
        }
        return r;
    }

}
