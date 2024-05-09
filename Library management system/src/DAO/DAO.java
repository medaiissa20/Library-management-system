/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author LENOVO
 */
public class DAO {
    public ObservableList<Livre> getAll() {
        String sql = "SELECT * from Livre";
       ResultSet rs = connectdb().createStatement().executeQuery(sql);
       
       ObservableList<Livre> livres = FXColleections.obervableArrayList();
       
       while (rs.next()){
           livres.add(new Livre(titre: rs.getString(), auteur:rs.getString() ));
       }
    }
}
