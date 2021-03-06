package dao;

import models.Ranger;
import org.sql2o.Connection;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oRangerDao implements RangerDao{


    @Override
    public List<Ranger> getAllRangers() {

        try(Connection con = DB.sql2o.open()) {
            return con.createQuery(" SELECT * FROM ranger")
                    .executeAndFetch(Ranger.class);
        }
    }

    @Override
    public void addRanger(Ranger ranger) {

        String sql = "INSERT INTO ranger(rangername, radiotelephonefrequency, badgenumber) VALUES (:rangerName, :radioTelephoneFrequency,:badgeNumber)";
        try(Connection con = DB.sql2o.open()){
            int id = (int) con.createQuery(sql, true)
                    .bind(ranger)
                    .executeUpdate()
                    .getKey();
            ranger.setId(id);
        } catch (Sql2oException e){
            System.out.println("e");
        }

    }

    @Override
    public Ranger findRangerById(int id) {

        try(Connection con = DB.sql2o.open()){
            return con.createQuery("SELECT * FROM ranger WHERE id = :id")
                    .addParameter("id", id)
                    .executeAndFetchFirst(Ranger.class);
        }
    }

    @Override
    public Ranger findRangerByBadgeNumber(int badgeNumber) {

        try(Connection con = DB.sql2o.open()){
            return con.createQuery("SELECT * FROM ranger WHERE badgeNumber = :badgeNumber")
                    .addParameter("badgeNumber", badgeNumber)
                    .executeAndFetchFirst(Ranger.class);
        }
    }

    @Override
    public void deleteRangerById(int id) {

        String sql = "DELETE FROM ranger WHERE id =:id";
        try (Connection con = DB.sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        } catch (Sql2oException e){
            System.out.println("e");
        }

    }

    @Override
    public void deleteAllRangers() {

        String sql = "DELETE FROM ranger";
        try(Connection con = DB.sql2o.open()){
            con.createQuery(sql)
                    .executeUpdate();

        } catch (Sql2oException e){
            System.out.println("e");
        }


    }
}
