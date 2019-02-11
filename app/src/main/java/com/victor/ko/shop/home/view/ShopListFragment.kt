package com.victor.ko.shop.home.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment;
import com.victor.ko.shop.R

class ShopListFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_shop_list,container,false)
        return view
    }

    /*
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shop_list, container, false);

        shopAdapter = new ShopAdapter(shopClickCallback, imageService);
        binding.shopList.setAdapter(shopAdapter);
        binding.setIsLoading(true);

        return (View) binding.getRoot();
    }
     */
}