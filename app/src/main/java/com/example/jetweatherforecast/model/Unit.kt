package com.example.jetweatherforecast.model

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import dagger.Provides
import javax.inject.Singleton

@Entity(tableName = "settings_tbl")
data class Unit(
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "unit")
    val unit: String,
)
