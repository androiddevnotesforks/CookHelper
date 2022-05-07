package ru.tech.prokitchen.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.tech.prokitchen.data.local.dao.FavRecipeDao
import ru.tech.prokitchen.data.local.dao.FridgeDao
import ru.tech.prokitchen.data.local.dao.SettingsDao
import ru.tech.prokitchen.data.local.entity.FavRecipeEntity
import ru.tech.prokitchen.data.local.entity.ProductEntity
import ru.tech.prokitchen.data.local.entity.SettingsEntity

@Database(
    entities = [FavRecipeEntity::class, ProductEntity::class, SettingsEntity::class],
    exportSchema = false,
    version = 1
)
abstract class ProKitchenDatabase : RoomDatabase() {
    abstract val favRecipeDao: FavRecipeDao
    abstract val fridgeDao: FridgeDao
    abstract val settingsDao: SettingsDao
}