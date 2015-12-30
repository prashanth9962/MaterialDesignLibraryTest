package testapp.prashanth.com.transparentactionbartest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by prashanth on 30/12/15.
 */
public class Fragment2 extends Fragment {
    private View rootView;

    /*public Fragment1() {

    }*/


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment2, container, false);
        //return rootView;
    }

    private void inflateViews(LayoutInflater inflater) {
        this.rootView = inflater.inflate(R.layout.fragment1, null);
    }
}
