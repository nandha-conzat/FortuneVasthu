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
import com.rukina.fortunevasthu.utils.PreferenceStorage;

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
    private int count = 0;

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

                if (radioMainEntranceGroup.getCheckedRadioButtonId() == -1)
                {
                    // no radio buttons are checked
                    PreferenceStorage.saveMainEntrance(getActivity(), "");
                }
                else
                {
                    // one of the radio buttons is checked
                    count = count+1;
                    int selectedId_ME = radioMainEntranceGroup.getCheckedRadioButtonId();
                    RadioButton radioMainEntranceButton = (RadioButton) rootView.findViewById(selectedId_ME);
                    PreferenceStorage.saveMainEntrance(getActivity(), radioMainEntranceButton.getText().toString());
                }

                if (radioHallGroup.getCheckedRadioButtonId() == -1)
                {
                    // no radio buttons are checked
                    PreferenceStorage.saveHall(getActivity(), "");
                }
                else
                {

                    // one of the radio buttons is checked
                    count = count+1;
                    int selectedId_Hall = radioHallGroup.getCheckedRadioButtonId();
                    RadioButton radioHallButton = (RadioButton) rootView.findViewById(selectedId_Hall);
                    PreferenceStorage.saveHall(getActivity(), radioHallButton.getText().toString());
                }

                if (radioKitchenGroup.getCheckedRadioButtonId() == -1)
                {
                    // no radio buttons are checked
                    PreferenceStorage.saveKitchen(getActivity(), "");
                }
                else
                {
                    // one of the radio buttons is checked
                    count = count+1;
                    int selectedId_Kitchen = radioKitchenGroup.getCheckedRadioButtonId();
                    RadioButton radioKitchenButton = (RadioButton) rootView.findViewById(selectedId_Kitchen);
                    PreferenceStorage.saveKitchen(getActivity(), radioKitchenButton.getText().toString());
                }

                if (radioMasterBedRoomGroup.getCheckedRadioButtonId() == -1)
                {
                    // no radio buttons are checked
                    PreferenceStorage.saveMasterBedRoom(getActivity(), "");
                }
                else
                {
                    // one of the radio buttons is checked
                    count = count+1;
                    int selectedId_MasterBed = radioMasterBedRoomGroup.getCheckedRadioButtonId();
                    RadioButton radioMasterBedRoomButton = (RadioButton) rootView.findViewById(selectedId_MasterBed);
                    PreferenceStorage.saveMasterBedRoom(getActivity(), radioMasterBedRoomButton.getText().toString());
                }

                if (radioBedRoomGroup.getCheckedRadioButtonId() == -1)
                {
                    // no radio buttons are checked
                    PreferenceStorage.saveBedRoom(getActivity(), "");
                }
                else
                {
                    // one of the radio buttons is checked
                    count = count+1;
                    int selectedId_BedRoom = radioBedRoomGroup.getCheckedRadioButtonId();
                    RadioButton radioBedRoomButton = (RadioButton) rootView.findViewById(selectedId_BedRoom);
                    PreferenceStorage.saveBedRoom(getActivity(), radioBedRoomButton.getText().toString());
                }

                if (radioPoojaRoomGroup.getCheckedRadioButtonId() == -1)
                {
                    // no radio buttons are checked
                    PreferenceStorage.savePoojaRoom(getActivity(), "");
                }
                else
                {
                    // one of the radio buttons is checked
                    count = count+1;
                    int selectedId_PoojaRoom = radioPoojaRoomGroup.getCheckedRadioButtonId();
                    RadioButton radioPoojaRoomButton = (RadioButton) rootView.findViewById(selectedId_PoojaRoom);
                    PreferenceStorage.savePoojaRoom(getActivity(), radioPoojaRoomButton.getText().toString());
                }

                if (radioBathGroup.getCheckedRadioButtonId() == -1)
                {
                    // no radio buttons are checked
                    PreferenceStorage.saveBathAndToilet(getActivity(), "");
                }
                else
                {
                    // one of the radio buttons is checked
                    count = count+1;
                    int selectedId_Bath = radioBathGroup.getCheckedRadioButtonId();
                    RadioButton radioBathButton = (RadioButton) rootView.findViewById(selectedId_Bath);
                    PreferenceStorage.saveBathAndToilet(getActivity(), radioBathButton.getText().toString());
                }

                if (radioPorticoGroup.getCheckedRadioButtonId() == -1)
                {
                    // no radio buttons are checked
                    PreferenceStorage.savePortico(getActivity(), "");
                }
                else
                {
                    // one of the radio buttons is checked
                    count = count+1;
                    int selectedId_Portico = radioPorticoGroup.getCheckedRadioButtonId();
                    RadioButton radioPorticoButton = (RadioButton) rootView.findViewById(selectedId_Portico);
                    PreferenceStorage.savePortico(getActivity(), radioPorticoButton.getText().toString());
                }

                if (radioCarParkingGroup.getCheckedRadioButtonId() == -1)
                {
                    // no radio buttons are checked
                    PreferenceStorage.saveCarParking(getActivity(), "");
                }
                else
                {
                    // one of the radio buttons is checked
                    count = count+1;
                    int selectedId_CarParking = radioCarParkingGroup.getCheckedRadioButtonId();
                    RadioButton radioCarParkingButton = (RadioButton) rootView.findViewById(selectedId_CarParking);
                    PreferenceStorage.saveCarParking(getActivity(), radioCarParkingButton.getText().toString());
                }

                if (radioStairCaseGroup.getCheckedRadioButtonId() == -1)
                {
                    // no radio buttons are checked
                    PreferenceStorage.saveStairCase(getActivity(), "");
                }
                else
                {
                    // one of the radio buttons is checked
                    count = count+1;
                    int selectedId_StairCase = radioStairCaseGroup.getCheckedRadioButtonId();
                    RadioButton radioStairCaseButton = (RadioButton) rootView.findViewById(selectedId_StairCase);
                    PreferenceStorage.saveStairCase(getActivity(), radioStairCaseButton.getText().toString());
                }

                if (radioSumpGroup.getCheckedRadioButtonId() == -1)
                {
                    // no radio buttons are checked
                    PreferenceStorage.saveSumpBorewell(getActivity(), "");
                }
                else
                {
                    // one of the radio buttons is checked
                    count = count+1;
                    int selectedId_Sump = radioSumpGroup.getCheckedRadioButtonId();
                    RadioButton radioSumpButton = (RadioButton) rootView.findViewById(selectedId_Sump);
                    PreferenceStorage.saveSumpBorewell(getActivity(), radioSumpButton.getText().toString());
                }

                if (radioSepticTankGroup.getCheckedRadioButtonId() == -1)
                {
                    // no radio buttons are checked
                    PreferenceStorage.saveSepticTank(getActivity(), "");
                }
                else
                {
                    // one of the radio buttons is checked
                    count = count+1;
                    int selectedId_Septic = radioSepticTankGroup.getCheckedRadioButtonId();
                    RadioButton radioSepticButton = (RadioButton) rootView.findViewById(selectedId_Septic);
                    PreferenceStorage.saveSepticTank(getActivity(), radioSepticButton.getText().toString());
                }

                if (radioCompoundWallGroup.getCheckedRadioButtonId() == -1)
                {
                    // no radio buttons are checked
                    PreferenceStorage.saveCompoundWall(getActivity(), "");
                }
                else
                {
                    // one of the radio buttons is checked
                    count = count+1;
                    int selectedId_Wall = radioCompoundWallGroup.getCheckedRadioButtonId();
                    RadioButton radioWallButton = (RadioButton) rootView.findViewById(selectedId_Wall);
                    PreferenceStorage.saveCompoundWall(getActivity(), radioWallButton.getText().toString());
                }

                if (radioRoadGroup.getCheckedRadioButtonId() == -1)
                {
                    // no radio buttons are checked
                    PreferenceStorage.saveRoad(getActivity(), "");
                }
                else
                {
                    // one of the radio buttons is checked
                    count = count+1;
                    int selectedId_Road = radioRoadGroup.getCheckedRadioButtonId();
                    RadioButton radioRoadButton = (RadioButton) rootView.findViewById(selectedId_Road);
                    PreferenceStorage.saveRoad(getActivity(), radioRoadButton.getText().toString());
                }

                if (count >= 4) {

                    Intent myIntent = new Intent(getActivity(), LoginActivity.class);
                    getActivity().startActivity(myIntent);
                } else {
                    Toast.makeText(getActivity(), "Please choose atleast 4 selection !", Toast.LENGTH_LONG).show();
                }

            }
        });

        return rootView;
    }
}
