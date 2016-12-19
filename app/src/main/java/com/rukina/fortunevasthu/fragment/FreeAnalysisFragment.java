package com.rukina.fortunevasthu.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.rukina.fortunevasthu.R;
import com.rukina.fortunevasthu.activity.FreeReportActivity;
import com.rukina.fortunevasthu.activity.LoginActivity;

/**
 * Created by Nandha on 23-10-2016.
 */

public class FreeAnalysisFragment extends Fragment {

    View rootView;

    public FreeAnalysisFragment() {
    }

    private RadioGroup radioMainEntranceGroup, radioHallGroup, radioKitchenGroup, radioMasterBedRoomGroup, radioBedRoomGroup,
            radioPoojaRoomGroup, radioBathGroup, radioPorticoGroup, radioCarParkingGroup, radioStairCaseGroup, radioSumpGroup,
            radioSepticTankGroup, radioCompoundWallGroup, radioRoadGroup;

    private Button btnGenerateReport;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_free_analysis, container, false);

        radioMainEntranceGroup = (RadioGroup) rootView.findViewById(R.id.radioMainEntrc);
        radioHallGroup = (RadioGroup) rootView.findViewById(R.id.radioHall);
        radioKitchenGroup = (RadioGroup) rootView.findViewById(R.id.radioKitchen);
        radioMasterBedRoomGroup = (RadioGroup) rootView.findViewById(R.id.radioMasterBed);
        radioBedRoomGroup = (RadioGroup) rootView.findViewById(R.id.radioBedRoom);
        radioPoojaRoomGroup = (RadioGroup) rootView.findViewById(R.id.radioPoojaRoom);
        radioBathGroup = (RadioGroup) rootView.findViewById(R.id.radioBath);
        radioPorticoGroup = (RadioGroup) rootView.findViewById(R.id.radioPortico);
        radioCarParkingGroup = (RadioGroup) rootView.findViewById(R.id.radioCarPark);
        radioStairCaseGroup = (RadioGroup) rootView.findViewById(R.id.radioStairCase);
        radioSumpGroup = (RadioGroup) rootView.findViewById(R.id.radioSump);
        radioSepticTankGroup = (RadioGroup) rootView.findViewById(R.id.radioSeptic);
        radioCompoundWallGroup = (RadioGroup) rootView.findViewById(R.id.radioWall);
        radioRoadGroup = (RadioGroup) rootView.findViewById(R.id.radioRoad);

        btnGenerateReport = (Button) rootView.findViewById(R.id.btn_getReport);

        btnGenerateReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId_ME = radioMainEntranceGroup.getCheckedRadioButtonId();
                int selectedId_Hall = radioHallGroup.getCheckedRadioButtonId();
                int selectedId_Kitchen = radioKitchenGroup.getCheckedRadioButtonId();
                int selectedId_MasterBed = radioMasterBedRoomGroup.getCheckedRadioButtonId();
                int selectedId_BedRoom = radioBedRoomGroup.getCheckedRadioButtonId();
                int selectedId_PoojaRoom = radioPoojaRoomGroup.getCheckedRadioButtonId();
                int selectedId_Bath = radioBathGroup.getCheckedRadioButtonId();
                int selectedId_Portico = radioPorticoGroup.getCheckedRadioButtonId();
                int selectedId_CarParking = radioCarParkingGroup.getCheckedRadioButtonId();
                int selectedId_StairCase = radioStairCaseGroup.getCheckedRadioButtonId();
                int selectedId_Sump = radioSumpGroup.getCheckedRadioButtonId();
                int selectedId_Septic = radioSepticTankGroup.getCheckedRadioButtonId();
                int selectedId_Wall = radioCompoundWallGroup.getCheckedRadioButtonId();
                int selectedId_Road = radioRoadGroup.getCheckedRadioButtonId();

                RadioButton radioMainEntranceButton = (RadioButton) rootView.findViewById(selectedId_ME);
                RadioButton radioHallButton = (RadioButton) rootView.findViewById(selectedId_Hall);
                RadioButton radioKitchenButton = (RadioButton) rootView.findViewById(selectedId_Kitchen);
                RadioButton radioMasterBedRoomButton = (RadioButton) rootView.findViewById(selectedId_MasterBed);
                RadioButton radioBedRoomButton = (RadioButton) rootView.findViewById(selectedId_BedRoom);
                RadioButton radioPoojaRoomButton = (RadioButton) rootView.findViewById(selectedId_PoojaRoom);
                RadioButton radioBathButton = (RadioButton) rootView.findViewById(selectedId_Bath);
                RadioButton radioPorticoButton = (RadioButton) rootView.findViewById(selectedId_Portico);
                RadioButton radioCarParkingButton = (RadioButton) rootView.findViewById(selectedId_CarParking);
                RadioButton radioStairCaseButton = (RadioButton) rootView.findViewById(selectedId_StairCase);
                RadioButton radioSumpButton = (RadioButton) rootView.findViewById(selectedId_Sump);
                RadioButton radioSepticButton = (RadioButton) rootView.findViewById(selectedId_Septic);
                RadioButton radioWallButton = (RadioButton) rootView.findViewById(selectedId_Wall);
                RadioButton radioRoadButton = (RadioButton) rootView.findViewById(selectedId_Road);

               /* Toast.makeText(getActivity(), "Main Ent :" + radioMainEntranceButton.getText() +
                        "Hall :" + radioHallButton.getText() +
                        "Kitchen :" + radioKitchenButton.getText() +
                        "Master Bed :" + radioMasterBedRoomButton.getText() +
                        "Bed :" + radioBedRoomButton.getText() +
                        "Pooja :" + radioPoojaRoomButton.getText() +
                        "Bath :" + radioBathButton.getText() +
                        "Portico :" + radioPorticoButton.getText() +
                        "Car :" + radioCarParkingButton.getText() +
                        "StairCase :" + radioStairCaseButton.getText() +
                        "Sump :" + radioSumpButton.getText() +
                        "Septic :" + radioSepticButton.getText() +
                        "Wall :" + radioWallButton.getText() +
                        "Road :" + radioRoadButton.getText(), Toast.LENGTH_SHORT).show(); */

                Intent myIntent = new Intent(getActivity(), FreeReportActivity.class);
                getActivity().startActivity(myIntent);

            }
        });

        return rootView;
    }
}
