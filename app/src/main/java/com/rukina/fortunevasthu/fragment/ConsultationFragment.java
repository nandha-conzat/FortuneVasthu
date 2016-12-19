package com.rukina.fortunevasthu.fragment;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.rukina.fortunevasthu.R;

/**
 * Created by Nandha on 23-10-2016.
 */

public class ConsultationFragment extends Fragment {

    Spinner spnConsultationType;
    LinearLayout layTelecall, layOnline, layOffline;
    Button btnCallus, btnSubmit;
    TextView txtCallus;
    EditText edtName, edtAddress, edtContactNo, edtMailId, edtHouseDrawing, edtLat, edtLong, edtPayment;

    public ConsultationFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_consultation, container, false);

        spnConsultationType = (Spinner) rootView.findViewById(R.id.consultationspinner);
        layTelecall = (LinearLayout) rootView.findViewById(R.id.llTelecall);
        layOnline = (LinearLayout) rootView.findViewById(R.id.llOnline);
        layOffline = (LinearLayout) rootView.findViewById(R.id.llOffline);

        btnCallus = (Button) rootView.findViewById(R.id.btnCallus);
        txtCallus = (TextView) rootView.findViewById(R.id.txtTelecallingno);

        edtName = (EditText) rootView.findViewById(R.id.editText_name);
        edtAddress = (EditText) rootView.findViewById(R.id.editText_address);
        edtContactNo = (EditText) rootView.findViewById(R.id.editText_contactno);
        edtMailId = (EditText) rootView.findViewById(R.id.editText_email);
        edtHouseDrawing = (EditText) rootView.findViewById(R.id.editText_drawing);
        edtLat = (EditText) rootView.findViewById(R.id.editText_latnorth);
        edtLong = (EditText) rootView.findViewById(R.id.editText_longeast);
        edtPayment = (EditText) rootView.findViewById(R.id.editText_payment);
        btnSubmit = (Button) rootView.findViewById(R.id.btnSubmit);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), R.layout.spinner_item, getResources().getStringArray(R.array.consultation_type));
        spnConsultationType.setAdapter(dataAdapter);

        spnConsultationType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                String ConsultType = arg0.getItemAtPosition(arg2).toString();
                //Toast.makeText(getActivity(), "Error" + ConsultType, Toast.LENGTH_LONG).show();
                if (ConsultType.equalsIgnoreCase("Tele Calling")) {
                    layTelecall.setVisibility(View.VISIBLE);
                    layOnline.setVisibility(View.GONE);
                    layOffline.setVisibility(View.GONE);
                }
                if (ConsultType.equalsIgnoreCase("Online")) {
                    layTelecall.setVisibility(View.GONE);
                    layOnline.setVisibility(View.VISIBLE);
                    layOffline.setVisibility(View.GONE);
                }
                if (ConsultType.equalsIgnoreCase("Offline")) {
                    layTelecall.setVisibility(View.GONE);
                    layOnline.setVisibility(View.GONE);
                    layOffline.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        btnCallus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String phoneNumber = txtCallus.getText().toString();
                if ((phoneNumber != null) && !(phoneNumber.isEmpty())) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(
                            getActivity());
                    builder.setTitle("Any queries? Feel free to call us.");
                    builder.setMessage(" " + phoneNumber + " ");

                    builder.setPositiveButton("Cancel",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int which) {

                                    dialog.dismiss();
                                }
                            });
                    builder.setNegativeButton("Call",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int which) {

                                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNumber));
                                    if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                        // TODO: Consider calling
                                        //    ActivityCompat#requestPermissions
                                        // here to request the missing permissions, and then overriding
                                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                        //                                          int[] grantResults)
                                        // to handle the case where the user grants the permission. See the documentation
                                        // for ActivityCompat#requestPermissions for more details.
                                        return;
                                    }
                                    startActivity(intent);
                                }
                            });

                    builder.show();

                }
            }
        });

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
        edtAddress.setText("");
        edtContactNo.setText("");
        edtMailId.setText("");
        edtHouseDrawing.setText("");
        edtLat.setText("");
        edtLong.setText("");
        edtPayment.setText("");
    }
}
