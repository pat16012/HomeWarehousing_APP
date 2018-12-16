package homewarehouse.project.homewarehouse_amzn_api;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * This is a container to hold the API Json response informatiom.
 */
@Entity(tableName = "products")
public class Product_Info {

    @PrimaryKey
    @NonNull
    String mpid;

    int upsc;

    String brandName;

    String title;

    public String getMpid() {
        return mpid;
    }

    public void setMpid(String mpid) {
        this.mpid = mpid;
    }

    public int getUpsc() {
        return upsc;
    }

    public void setUpsc(int upsc) {
        this.upsc = upsc;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Product_Info(String mpid, int upsc, String brandName, String title){
        this.mpid = mpid;
        this.upsc = upsc;
        this.brandName = brandName;
        this.title = title;
    }





}
