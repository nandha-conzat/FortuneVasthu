package com.rukina.fortunevasthu.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import com.rukina.fortunevasthu.R;
import com.rukina.fortunevasthu.utils.PreferenceStorage;

/**
 * Created by Nandha on 19-12-2016.
 */

public class FreeReportActivity extends AppCompatActivity {

    private RadioGroup radioMainEntranceGroup, radioHallGroup, radioKitchenGroup, radioMasterBedRoomGroup, radioBedRoomGroup,
            radioPoojaRoomGroup, radioBathGroup, radioPorticoGroup, radioCarParkingGroup, radioStairCaseGroup, radioSumpGroup,
            radioSepticTankGroup, radioCompoundWallGroup, radioRoadGroup;
    private String MainEntrance, Hall, Kitchen, MasterBedRoom, BedRoom, PoojaRoom, BathAndToilet, Portico, CarParking, StairCase,
            SumpAndBorewell, SepticTank, CompoundWall, Road;
    private LinearLayout llMainEntranceChk, llHallChk, llKitchenChk, llMasterBedRoomChk, llBedRoomChk, llPoojaRoomChk,
            llBathAndToiletChk, llPorticoChk, llCarParkingChk, llStairCaseChk, llSumpAndBorewellChk, llSepticTankChk,
            llCompoundWallChk, llRoadChk;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_report);

        radioMainEntranceGroup = (RadioGroup) findViewById(R.id.radioMainEntrc);
        radioHallGroup = (RadioGroup) findViewById(R.id.radioHall);
        radioKitchenGroup = (RadioGroup) findViewById(R.id.radioKitchen);
        radioMasterBedRoomGroup = (RadioGroup) findViewById(R.id.radioMasterBed);
        radioBedRoomGroup = (RadioGroup) findViewById(R.id.radioBedRoom);
        radioPoojaRoomGroup = (RadioGroup) findViewById(R.id.radioPoojaRoom);
        radioBathGroup = (RadioGroup) findViewById(R.id.radioBath);
        radioPorticoGroup = (RadioGroup) findViewById(R.id.radioPortico);
        radioCarParkingGroup = (RadioGroup) findViewById(R.id.radioCarPark);
        radioStairCaseGroup = (RadioGroup) findViewById(R.id.radioStairCase);
        radioSumpGroup = (RadioGroup) findViewById(R.id.radioSump);
        radioSepticTankGroup = (RadioGroup) findViewById(R.id.radioSeptic);
        radioCompoundWallGroup = (RadioGroup) findViewById(R.id.radioWall);
        radioRoadGroup = (RadioGroup) findViewById(R.id.radioRoad);

        llMainEntranceChk = (LinearLayout)findViewById(R.id.llchkMainEntrance);
        llHallChk = (LinearLayout)findViewById(R.id.llchkHall);
        llKitchenChk = (LinearLayout)findViewById(R.id.llchkKitchen);
        llMasterBedRoomChk = (LinearLayout)findViewById(R.id.llchkMasterBed);
        llBedRoomChk = (LinearLayout)findViewById(R.id.llchkBed);
        llPoojaRoomChk = (LinearLayout)findViewById(R.id.llchkPoojaRoom);
        llBathAndToiletChk = (LinearLayout)findViewById(R.id.llchkBath);
        llPorticoChk = (LinearLayout)findViewById(R.id.llchkPortico);
        llCarParkingChk = (LinearLayout)findViewById(R.id.llchkCarParking);
        llStairCaseChk = (LinearLayout)findViewById(R.id.llchkStairCase);
        llSumpAndBorewellChk = (LinearLayout)findViewById(R.id.llchkSump);
        llSepticTankChk = (LinearLayout)findViewById(R.id.llchkSeptic);
        llCompoundWallChk = (LinearLayout)findViewById(R.id.llchkWall);
        llRoadChk = (LinearLayout)findViewById(R.id.llchkRoad);


        MainEntrance = PreferenceStorage.getMainEntrance(getApplicationContext());
        Hall = PreferenceStorage.getHall(getApplicationContext());
        Kitchen = PreferenceStorage.getKitchen(getApplicationContext());
        MasterBedRoom = PreferenceStorage.getMasterBedRoom(getApplicationContext());
        BedRoom = PreferenceStorage.getBedRoom(getApplicationContext());
        PoojaRoom = PreferenceStorage.getPoojaRoom(getApplicationContext());
        BathAndToilet = PreferenceStorage.getBathAndToilet(getApplicationContext());
        Portico = PreferenceStorage.getPortico(getApplicationContext());
        CarParking = PreferenceStorage.getCarParking(getApplicationContext());
        StairCase = PreferenceStorage.getStairCase(getApplicationContext());
        SumpAndBorewell = PreferenceStorage.getSumpBorewell(getApplicationContext());
        SepticTank = PreferenceStorage.getSepticTank(getApplicationContext());
        CompoundWall = PreferenceStorage.getCompoundWall(getApplicationContext());
        Road = PreferenceStorage.getRoad(getApplicationContext());

//        MainEntrance
        if (!MainEntrance.equals("")) {
            if (MainEntrance.equals("NE")) {
                radioMainEntranceGroup.check(R.id.radioNE_ME);
            } else if (MainEntrance.equals("SE")) {
                radioMainEntranceGroup.check(R.id.radioSE_ME);
            } else if (MainEntrance.equals("SW")) {
                llMainEntranceChk.setVisibility(View.VISIBLE);
                radioMainEntranceGroup.check(R.id.radioSW_ME);
            } else if (MainEntrance.equals("NW")) {
                radioMainEntranceGroup.check(R.id.radioNW_ME);
            }
        }
//        Hall
        if (!Hall.equals("")) {
            if (Hall.equals("NE")) {
                radioHallGroup.check(R.id.radioNE_Hall);
            } else if (Hall.equals("SE")) {
                radioHallGroup.check(R.id.radioSE_Hall);
            } else if (Hall.equals("SW")) {
                llHallChk.setVisibility(View.VISIBLE);
                radioHallGroup.check(R.id.radioSW_Hall);
            } else if (Hall.equals("NW")) {
                radioHallGroup.check(R.id.radioNW_Hall);
            }
        }
//        Kitchen
        if (!Kitchen.equals("")) {
            if (Kitchen.equals("NE")) {
                llKitchenChk.setVisibility(View.VISIBLE);
                radioKitchenGroup.check(R.id.radioNE_Kitchen);
            } else if (Kitchen.equals("SE")) {
                radioKitchenGroup.check(R.id.radioSE_Kitchen);
            } else if (Kitchen.equals("SW")) {
                llKitchenChk.setVisibility(View.VISIBLE);
                radioKitchenGroup.check(R.id.radioSW_Kitchen);
            } else if (Kitchen.equals("NW")) {
                radioKitchenGroup.check(R.id.radioNW_Kitchen);
            }
        }
//        MasterBedRoom
        if (!MasterBedRoom.equals("")) {
            if (MasterBedRoom.equals("NE")) {
                llMasterBedRoomChk.setVisibility(View.VISIBLE);
                radioMasterBedRoomGroup.check(R.id.radioNE_MasterBed);
            } else if (MasterBedRoom.equals("SE")) {
                llMasterBedRoomChk.setVisibility(View.VISIBLE);
                radioMasterBedRoomGroup.check(R.id.radioSE_MasterBed);
            } else if (MasterBedRoom.equals("SW")) {
                radioMasterBedRoomGroup.check(R.id.radioSW_MasterBed);
            } else if (MasterBedRoom.equals("NW")) {
                radioMasterBedRoomGroup.check(R.id.radioNW_MasterBed);
            }
        }
//        BedRoom
        if (!BedRoom.equals("")) {
            if (BedRoom.equals("NE")) {
                radioBedRoomGroup.check(R.id.radioNE_BedRoom);
            } else if (BedRoom.equals("SE")) {
                llBedRoomChk.setVisibility(View.VISIBLE);
                radioBedRoomGroup.check(R.id.radioSE_BedRoom);
            } else if (BedRoom.equals("SW")) {
                llBedRoomChk.setVisibility(View.VISIBLE);
                radioBedRoomGroup.check(R.id.radioSW_BedRoom);
            } else if (BedRoom.equals("NW")) {
                radioBedRoomGroup.check(R.id.radioNW_BedRoom);
            }
        }
//        PoojaRoom
        if (!PoojaRoom.equals("")) {
            if (PoojaRoom.equals("NE")) {
                llPoojaRoomChk.setVisibility(View.VISIBLE);
                radioPoojaRoomGroup.check(R.id.radioNE_PoojaRoom);
            } else if (PoojaRoom.equals("SE")) {
                radioPoojaRoomGroup.check(R.id.radioSE_PoojaRoom);
            } else if (PoojaRoom.equals("SW")) {
                llPoojaRoomChk.setVisibility(View.VISIBLE);
                radioPoojaRoomGroup.check(R.id.radioSW_PoojaRoom);
            } else if (PoojaRoom.equals("NW")) {
                radioPoojaRoomGroup.check(R.id.radioNW_PoojaRoom);
            }
        }
//        BathAndToilet
        if (!BathAndToilet.equals("")) {
            if (BathAndToilet.equals("NE")) {
                llBathAndToiletChk.setVisibility(View.VISIBLE);
                radioBathGroup.check(R.id.radioNE_Bath);
            } else if (BathAndToilet.equals("SE")) {
                llBathAndToiletChk.setVisibility(View.VISIBLE);
                radioBathGroup.check(R.id.radioSE_Bath);
            } else if (BathAndToilet.equals("SW")) {
                llBathAndToiletChk.setVisibility(View.VISIBLE);
                radioBathGroup.check(R.id.radioSW_Bath);
            } else if (BathAndToilet.equals("NW")) {
                radioBathGroup.check(R.id.radioNW_Bath);
            }
        }
//        Portico
        if (!Portico.equals("")) {
            if (Portico.equals("NE")) {
                llPorticoChk.setVisibility(View.VISIBLE);
                radioPorticoGroup.check(R.id.radioNE_Portico);
            } else if (Portico.equals("SE")) {
                llPorticoChk.setVisibility(View.VISIBLE);
                radioPorticoGroup.check(R.id.radioSE_Portico);
            } else if (Portico.equals("SW")) {
                llPorticoChk.setVisibility(View.VISIBLE);
                radioPorticoGroup.check(R.id.radioSW_Portico);
            } else if (Portico.equals("NW")) {
                llPorticoChk.setVisibility(View.VISIBLE);
                radioPorticoGroup.check(R.id.radioNW_Portico);
            }
        }
//        CarParking
        if (!CarParking.equals("")) {
            if (CarParking.equals("NE")) {
                llCarParkingChk.setVisibility(View.VISIBLE);
                radioCarParkingGroup.check(R.id.radioNE_CarPark);
            } else if (CarParking.equals("SE")) {
                radioCarParkingGroup.check(R.id.radioSE_CarPark);
            } else if (CarParking.equals("SW")) {
                llCarParkingChk.setVisibility(View.VISIBLE);
                radioCarParkingGroup.check(R.id.radioSW_CarPark);
            } else if (CarParking.equals("NW")) {
                radioCarParkingGroup.check(R.id.radioNW_CarPark);
            }
        }
//        StairCase
        if (!StairCase.equals("")) {
            if (StairCase.equals("NE")) {
                llStairCaseChk.setVisibility(View.VISIBLE);
                radioStairCaseGroup.check(R.id.radioNE_StairCase);
            } else if (StairCase.equals("SE")) {
                radioStairCaseGroup.check(R.id.radioSE_StairCase);
            } else if (StairCase.equals("SW")) {
                radioStairCaseGroup.check(R.id.radioSW_StairCase);
            } else if (StairCase.equals("NW")) {
                radioStairCaseGroup.check(R.id.radioNW_StairCase);
            }
        }
//        SumpAndBorewell
        if (!SumpAndBorewell.equals("")) {
            if (SumpAndBorewell.equals("NE")) {
                radioSumpGroup.check(R.id.radioNE_Sump);
            } else if (SumpAndBorewell.equals("SE")) {
                llSumpAndBorewellChk.setVisibility(View.VISIBLE);
                radioSumpGroup.check(R.id.radioSE_Sump);
            } else if (SumpAndBorewell.equals("SW")) {
                llSumpAndBorewellChk.setVisibility(View.VISIBLE);
                radioSumpGroup.check(R.id.radioSW_Sump);
            } else if (SumpAndBorewell.equals("NW")) {
                llSumpAndBorewellChk.setVisibility(View.VISIBLE);
                radioSumpGroup.check(R.id.radioNW_Sump);
            }
        }
//        SepticTank
        if (!SepticTank.equals("")) {
            if (SepticTank.equals("NE")) {
                llSepticTankChk.setVisibility(View.VISIBLE);
                radioSepticTankGroup.check(R.id.radioNE_Septic);
            } else if (SepticTank.equals("SE")) {
                llSepticTankChk.setVisibility(View.VISIBLE);
                radioSepticTankGroup.check(R.id.radioSE_Septic);
            } else if (SepticTank.equals("SW")) {
                llSepticTankChk.setVisibility(View.VISIBLE);
                radioSepticTankGroup.check(R.id.radioSW_Septic);
            } else if (SepticTank.equals("NW")) {
                radioSepticTankGroup.check(R.id.radioNW_Septic);
            }
        }
//        CompoundWall
        if (!CompoundWall.equals("")) {
            if (CompoundWall.equals("NE")) {
                radioCompoundWallGroup.check(R.id.radioNE_Wall);
            } else if (CompoundWall.equals("SE")) {
                radioCompoundWallGroup.check(R.id.radioSE_Wall);
            } else if (CompoundWall.equals("SW")) {
                radioCompoundWallGroup.check(R.id.radioSW_Wall);
            } else if (CompoundWall.equals("NW")) {
                radioCompoundWallGroup.check(R.id.radioNW_Wall);
            }
        }
//        Road
        if (!Road.equals("")) {
            if (Road.equals("NE")) {
                radioRoadGroup.check(R.id.radioNE_Road);
            } else if (Road.equals("SE")) {
                radioRoadGroup.check(R.id.radioSE_Road);
            } else if (Road.equals("SW")) {
                llRoadChk.setVisibility(View.VISIBLE);
                radioRoadGroup.check(R.id.radioSW_Road);
            } else if (Road.equals("NW")) {
                radioRoadGroup.check(R.id.radioNW_Road);
            }
        }
    }
}
