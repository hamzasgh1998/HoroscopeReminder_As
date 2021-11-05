package tn.esprit.authentification;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface RdvDao {

    @Insert
    void addRdv(RendezVousEntity rdv);
}
