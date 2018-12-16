package homewarehouse.project.homewarehouse_amzn_api;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface ProductDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addProduct(Product_Info product_info);

   /* @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addAll(Product_Info... product_info); */

    @Query("select * from products") //looks at database
    List<Product_Info> getProducts();

    @Delete //deletes content in database
    void deleteProduct(Product_Info product_info);
}
