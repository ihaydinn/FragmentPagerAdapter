package com.ismailhakkiaydin.fragmentpageradapter;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class FragmentThree extends Fragment {

    public FragmentThree() {
        Log.i("EMRE", "Fragment One Oluşturuldu");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_three, container, false);
    }
}