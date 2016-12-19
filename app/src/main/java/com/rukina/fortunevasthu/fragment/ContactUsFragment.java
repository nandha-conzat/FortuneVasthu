package com.rukina.fortunevasthu.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.rukina.fortunevasthu.R;

/**
 * Created by Nandha on 23-10-2016.
 */

public class ContactUsFragment extends Fragment {

    EditText edtName, edtContactNo, edtMailId, edtComment;
    Button btnSubmit;

    public ContactUsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_contact_us, container, false);

        edtName = (EditText) rootView.findViewById(R.id.editText_name);
        edtContactNo = (EditText) rootView.findViewById(R.id.editText_contactno);
        edtMailId = (EditText) rootView.findViewById(R.id.editText_email);
        edtComment = (EditText) rootView.findViewById(R.id.editText_comment);
        btnSubmit = (Button) rootView.findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Clear();
                Toast.makeText(getActivity(), "We will contact you shortly", Toast.LENGTH_LONG).show();
            }
        });

        return rootView;
    }

    private void Clear() {
        edtName.setText("");
        edtContactNo.setText("");
        edtMailId.setText("");
        edtComment.setText("");
    }
}
