package com.example.odev4;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4.databinding.FragmentSayfaYBinding;
import com.google.android.material.snackbar.Snackbar;

public class SayfaYFragment extends Fragment {

   private FragmentSayfaYBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSayfaYBinding.inflate(inflater,container, false);
        OnBackPressedCallback geriTusu = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Snackbar.make(binding.textView5,"Geri Dönmek ister misiniz",Snackbar.LENGTH_SHORT)
                        .setAction("Evet",v->{
                        setEnabled(false);
                            Navigation.findNavController(v).navigate(R.id.gecisAnasayfa);
                        }).show();
            }
        };

        return binding.getRoot();
    }
}