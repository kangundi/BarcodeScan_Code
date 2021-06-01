package com.fabwms.barcodescan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheetDialog extends BottomSheetDialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable
            ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.bottom_sheet_layout,
                container, false);
        Bundle bundle = getArguments();
        TextView Captured_Barcode = v.findViewById(R.id.Captured_Barcode);

//        String Barcode_Value = bundle.getString("BarcodeTextBundle");
//        if(Barcode_Value!="")
//        {
//            Captured_Barcode.setText("Barcode Value:"+ Barcode_Value);
//        }
//        else
//        {
//            Captured_Barcode.setText("Barcode Value not found");
//        }

        Button Close_button = v.findViewById(R.id.Close_button);

        Close_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity(),
                        "Perform further action from the click of the button", Toast.LENGTH_SHORT)
                        .show();
                dismiss();
            }
        });
        return v;
    }
}
