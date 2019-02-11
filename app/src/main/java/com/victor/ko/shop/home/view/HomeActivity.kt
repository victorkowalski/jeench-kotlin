package com.victor.ko.shop.home.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.victor.ko.shop.R
import com.victor.ko.shop.app.App
import com.victor.ko.shop.home.HomeModule

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        injectDependencies()
        //setUpPresenter()
        //setUpListeners()
        //setUpCitiesWeatherList()
    }

    private fun injectDependencies() {
        App.get().getAppComponent()?.plus(HomeModule())?.inject(this)
    }

}
/*
public class MainActivity extends AppCompatActivity implements HasSupportFragmentInjector {

    @Inject
    DispatchingAndroidInjector<Fragment> dispatchingAndroidInjector;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add shop list fragment if this is first creation
        if (savedInstanceState == null) {
            ShopListFragment fragment = new ShopListFragment();

            getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, fragment, ShopListFragment.TAG).commit();
        }
    }

    /** Shows the Shop detail fragment */
    public void show(Shop shop) {
        ShopFragment shopFragment = ShopFragment.forShop(shop.getShop_id());

        getSupportFragmentManager()
            .beginTransaction()
            .addToBackStack("shop")
            .replace(R.id.fragment_container,
                shopFragment, null).commit();
    }

    @Override
    public DispatchingAndroidInjector<Fragment> supportFragmentInjector() {
        return dispatchingAndroidInjector;
    }
}
*/