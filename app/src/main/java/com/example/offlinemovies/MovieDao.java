package com.example.offlinemovies;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MovieDao {

    @Query("SELECT * FROM movies")
    LiveData<List<MovieEntity>> loadMovies();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void saveMovies(List<MovieEntity> movieEntityList);
}