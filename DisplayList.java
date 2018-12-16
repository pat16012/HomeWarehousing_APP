package homewarehouse.project.homewarehouse_amzn_api;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayList extends Fragment {
    private TextView Txtinfo;

    public DisplayList() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_display_list, container, false);
        Txtinfo = view.findViewById(R.id.read_info);

        List<Product_Info> products = MainPage.productDatabase.productDao().getProducts();

        String info = "";

        for(Product_Info product_info :products){
            String mpid = product_info.getMpid();
            int upsc = product_info.getUpsc();
            String brandName = product_info.getBrandName();
            String title = product_info.getTitle();

            info = product_info+"\n\n"+"Mpid :"+mpid+"\n Upsc :"+upsc+"\n Brand Name :"+brandName
                    +"\n Title :"+title;
        }

        Txtinfo.setText(info);
        return view;
    }

}
