package tn.esprit.authentification;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "rdv")
public class RendezVousEntity {
    @PrimaryKey(autoGenerate = true)
    Integer idRdv;

    @ColumnInfo(name="name")
    String nameRdv;

    @ColumnInfo(name="date")
    String dateRdv;

    public Integer getIdRdv() {
        return idRdv;
    }

    public void setIdRdv(Integer idRdv) {
        this.idRdv = idRdv;
    }

    public String getNameRdv() {
        return nameRdv;
    }

    public void setNameRdv(String nameRdv) {
        this.nameRdv = nameRdv;
    }

    public String getDateRdv() {
        return dateRdv;
    }

    public void setDateRdv(String dateRdv) {
        this.dateRdv = dateRdv;
    }
}
