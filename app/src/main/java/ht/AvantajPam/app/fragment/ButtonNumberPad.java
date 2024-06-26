package ht.AvantajPam.app.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

import ht.AvantajPam.app.R;


public class ButtonNumberPad extends Fragment {

    private NumberPadListener listener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof NumberPadListener) {
            listener = (NumberPadListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement OnButtonClickListener");
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate your fragment layout here
        return inflater.inflate(R.layout.fragment_button_number_pad, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button1 = view.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onNumberClicked("1");
                }
            }
        });

        // Similarly, set click listeners for other buttons
        // For example:
        Button button2 = view.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onNumberClicked("2");
                }
            }
        });

        // Continue setting listeners for all your buttons
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }


//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_button_number_pad, parent, false);
//    }



//    @Override
//    public void onViewCreated(View view, Bundle savedInstanceState) {
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_button_number_pad, parent, false);
//
//        // Get reference to the activity (assuming SMSVerificationActivity)
//        Activity activity = getActivity();
//        if (activity instanceof NumberPadListener) {
//            listener = (NumberPadListener) activity;
//        } else {
//            throw new ClassCastException("Activity must implement NumberPadListener");
//        }
//
//        // Set OnClickListener for buttons
//        Button button1 = view.findViewById(R.id.button1);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (listener != null) {
//                    listener.onNumberClicked("1"); // Pass the clicked number
//                }
//            }
//        });
//
//        // Repeat for other buttons (2, 3, ..., 0)
//
//        return view;
//    }
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if(context instanceof OnButtonClickListener){      // context instanceof YourActivity
//            this.listener = (OnButtonClickListener) context; // = (YourActivity) context
//        } else {
//            throw new ClassCastException(context.toString()
//                    + " must implement PizzaMenuFragment.OnItemSelectedListener");
//        }
//    }
}