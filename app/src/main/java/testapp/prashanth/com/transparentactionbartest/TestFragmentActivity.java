package testapp.prashanth.com.transparentactionbartest;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class TestFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_fragment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*Fragment fragment = getFragmentManager().findFragmentById(R.id.container);
        if (fragment == null) {

        }*/
        //Fragment1 fragment1 = new Fragment1();
        replaceViewFragment(new Fragment1(),true);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                replaceViewFragment(new Fragment2(), true);
            }
        });
    }

    public void replaceViewFragment(Fragment fragment, boolean addToBackStack) {
        replaceViewFragment(R.id.container, fragment, addToBackStack);
    }

    protected void replaceViewFragment(int containerResourceId, Fragment fragment, boolean addToBackStack) {
        FragmentTransaction transaction = getFragmentManager()
                .beginTransaction()
                .setCustomAnimations(
                        R.animator.slide_left_right,
                        R.animator.slide_right_left,
                        R.animator.slide_left_right,
                        R.animator.slide_right_left)
                .replace(containerResourceId, fragment);
        if (addToBackStack) transaction.addToBackStack(null);
        transaction.commit();
    }

}

