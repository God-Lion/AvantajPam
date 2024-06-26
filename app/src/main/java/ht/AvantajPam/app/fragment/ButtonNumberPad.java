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
        if (context instanceof NumberPadListener)
            listener = (NumberPadListener) context;
        else
            throw new RuntimeException(context.toString() + " must implement OnButtonClickListener");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_button_number_pad, container, false);
    }

    private String getNumberFromButtonId(int buttonId) {
        if (buttonId == R.id.button1) return "1";
        else if (buttonId == R.id.button2) return "2";
        else if (buttonId == R.id.button3) return "3";
        else if (buttonId == R.id.button4) return "4";
        else if (buttonId == R.id.button5) return "5";
        else if (buttonId == R.id.button6) return "6";
        else if (buttonId == R.id.button7) return "7";
        else if (buttonId == R.id.button8) return "8";
        else if (buttonId == R.id.button9) return "9";
        else if (buttonId == R.id.button0) return "0";
        else if (buttonId == R.id.btnOk) return "ok";
        return "";
    }

    private View.OnClickListener numberClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (listener != null) {
                String number = getNumberFromButtonId(v.getId());
                listener.onNumberClicked(number);
            }
        };
    };

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button1 = view.findViewById(R.id.button1);
        button1.setOnClickListener(numberClickListener);

        Button button2 = view.findViewById(R.id.button2);
        button2.setOnClickListener(numberClickListener);

        Button button3 = view.findViewById(R.id.button3);
        button3.setOnClickListener(numberClickListener);

        Button button4 = view.findViewById(R.id.button4);
        button4.setOnClickListener(numberClickListener);

        Button button5 = view.findViewById(R.id.button5);
        button5.setOnClickListener(numberClickListener);

        Button button6 = view.findViewById(R.id.button6);
        button6.setOnClickListener(numberClickListener);

        Button button7 = view.findViewById(R.id.button7);
        button7.setOnClickListener(numberClickListener);

        Button button8 = view.findViewById(R.id.button8);
        button8.setOnClickListener(numberClickListener);

        Button button9 = view.findViewById(R.id.button9);
        button9.setOnClickListener(numberClickListener);

        Button button0 = view.findViewById(R.id.button0);
        button0.setOnClickListener(numberClickListener);


        Button btnOk = view.findViewById(R.id.btnOk);
        btnOk.setOnClickListener(numberClickListener);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
}