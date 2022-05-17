package com.example.shoppingcart.ui.carts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.shoppingcart.databinding.FragmentCartsBinding;
import com.example.shoppingcart.ui.home.HomeViewModel;

public class CartsFragment extends Fragment {

    private FragmentCartsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CartsViewModel cartsViewModel =
                new ViewModelProvider(this).get(CartsViewModel.class);

        binding = FragmentCartsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCarts;
        cartsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
